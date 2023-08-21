import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingBox;
    Bouncer movingPentagon;
    StraightMover straightBox;
    StraightMover straightPent;
    ArrayList<Mover> movers = new ArrayList<Mover>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Rectangle box2 = new Rectangle(20, 20, Color.GREEN);
        Pentagon pent = new Pentagon(50, 50, Color.BLUE);
        Pentagon pent2 = new Pentagon(30, 30, Color.PINK);

        movingBox = new Bouncer(100, 170, box);
        movingBox.setMovementVector(3, 1);
        movingPentagon = new Bouncer(150, 150, pent);
        movingPentagon.setMovementVector(-3, 1);

        straightBox = new StraightMover(40, 70, box2);
        straightBox.setMovementVector(4, 0);
        straightPent = new StraightMover(260, 230, pent2);
        straightPent.setMovementVector(-4, 0);

        movers.add(movingBox);
        movers.add(movingPentagon);
        movers.add(straightBox);
        movers.add(straightPent);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) { 
        for(int i = 0; i < movers.size(); i++) {
            movers.get(i).draw(surface);
        }
    }
}
