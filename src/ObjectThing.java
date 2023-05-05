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
        int maxX = getParent().getWidth() - getWidth();
        if (x > maxX) {
            x = maxX;
        }
        setLocation(x, y);
    }

    public void moveRight() {
        int x = getX() + 10;
        int y = getY();
        int maxX = getParent().getWidth() - getWidth();
        if (x > maxX) {
            x = maxX;
        }
        setLocation(x, y);
    }

    public void moveUp() {
        int x = getX();
        int y = getY() - 10;
        int maxX = getParent().getWidth() - getWidth();
        if (x > maxX) {
            x = maxX;
        }
        setLocation(x, y);
    }

    public void moveDown() {
        int x = getX();
        int y = getY() + 10;
        int maxX = getParent().getWidth() - getWidth();
        if (x > maxX) {
            x = maxX;
        }
        setLocation(x, y);
    }
}



