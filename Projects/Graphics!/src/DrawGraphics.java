import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DrawGraphics {
    BouncingBox box;
    BouncingBox box2;
    BouncingBox box3;
    boolean yellowFlag = true;
    boolean redFlag = true;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(89, 12, Color.GREEN);
        box2 = new BouncingBox(149, 288, Color.RED);
        box3 = new BouncingBox(205, 12, Color.YELLOW);

        box.setMovementVector(0, -3);
    }

    public void moveBox(BouncingBox box, int speed) {
        box.setMovementVector(0, speed);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        box.draw(surface);
        box2.draw(surface);
        box3.draw(surface);

        // need flag to prevent box from flipping direction
        if(box.y == 150 && yellowFlag) {
            moveBox(box3, -2);
            yellowFlag = false;
        }

        System.out.println(box3.y);
        // need flag to prevent box from flipping direction
        if(box3.y == 150 && redFlag) {
            moveBox(box2, 1);
            redFlag = false;
        }

        surface.setColor(Color.BLUE);
        surface.fillOval(80, 75, 20, 20);
        surface.fillOval(195, 75, 20, 20);
        
        // nose
        surface.drawArc(134, 115, 30, 30, 140, 265);

        // mouth
        surface.drawArc(90, 155, 120, 30, 0, -180);
    }
}