import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    Bouncer movingSprite;
    Bouncer movingPentagon;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Pentagon star = new Pentagon(50, 50, Color.BLUE);

        movingSprite = new Bouncer(100, 170, box);
        movingPentagon = new Bouncer(150, 150, star);
        movingSprite.setMovementVector(3, 1);
        movingPentagon.setMovementVector(3, 1);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) { 
        movingSprite.draw(surface);
        movingPentagon.draw(surface);
    }
}
