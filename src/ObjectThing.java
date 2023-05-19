import java.awt.*;
import javax.swing.JComponent;

public class ObjectThing extends JComponent {
    private int x, y;
    private int width, height;

    public ObjectThing(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }

    public void moveLeft() {
        int x = getX() - 10;
        int y = getY();
        System.out.printf("coordinates= %d %d\n", x, y);
        if (x > -60) {
            setLocation(x, y);
        }
    }

    public void moveRight() {
        int x = getX() + 10;
        int y = getY();
        System.out.printf("coordinates= %d %d\n", x, y);
        if (x < 700) {
            setLocation(x, y);
        }
    }

    public void moveUp() {
        int x = getX();
        int y = getY() - 10;
        System.out.printf("coordinates= %d %d\n", x, y);
        if (y > -60) {
            setLocation(x, y);
        }
    }

    public void moveDown() {
        int x = getX();
        int y = getY() + 10;
        System.out.printf("coordinates= %d %d\n", x, y);
        if (y < 480) {
            setLocation(x, y);
        }
    }
}



