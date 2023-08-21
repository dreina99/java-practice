import java.awt.Graphics;

public class Bouncer {
    private int x;
    private int y;
    private int xDirection;
    private int yDirection;
    private Sprite sprite; 

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public Bouncer(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite;
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    /** Draws the sprite at its current position on to surface. */
    public void draw(Graphics surface) {
        // Draw the sprite
        sprite.draw(surface, x, y);

        // Move the object each time we draw it
        x += xDirection;
        y += yDirection;

        // bounce conditions for pentagons
        if(this.sprite instanceof Pentagon) {
            // check x - width for pentagon 
            if ((x - this.sprite.getWidth() <= 0 && xDirection < 0) ||
            (x + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
                xDirection = -xDirection;
            }

            // angle of sides
            double theta = 1.25664;
            // length from center to top of pentagon
            double rC = this.sprite.getHeight() / (1 + Math.cos(theta));
            // length from center to bottom of pentagon
            double rI = this.sprite.getHeight() - rC;

            if ((y - rC <= 0 && yDirection < 0) ||
                (y + rI >= SimpleDraw.HEIGHT && yDirection > 0)) {
                    yDirection = -yDirection;
            }
        }
        else {
            // If we have hit the edge and are moving in the wrong direction, reverse direction
            // We check the direction because if a box is placed near the wall, we would get "stuck"
            // rather than moving in the right direction
            if ((x <= 0 && xDirection < 0) ||
                (x + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
                    xDirection = -xDirection;
            }

            if ((y <= 0 && yDirection < 0) ||
                (y + sprite.getHeight() >= SimpleDraw.HEIGHT && yDirection > 0)) {
                    yDirection = -yDirection;
            }
        }
    }
}