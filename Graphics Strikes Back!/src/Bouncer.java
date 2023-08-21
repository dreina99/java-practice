import java.awt.Graphics;

public class Bouncer extends Mover {
    /** Create a Bouncer that positions sprite at (startX, startY). */
    public Bouncer(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }
    
    /** Draws the sprite at its current position on to surface. */
    public void draw(Graphics surface) {
        // Draw the sprite
        this.sprite.draw(surface, x, y);

        // Move the object each time we draw it
        this.x += this.xDirection;
        this.y += this.yDirection;

        // bounce conditions for pentagons
        if(this.sprite instanceof Pentagon) {
            // check x - width for pentagon 
            if ((this.x - this.sprite.getWidth() <= 0 && this.xDirection < 0) ||
            (this.x + this.sprite.getWidth() >= SimpleDraw.WIDTH && this.xDirection > 0)) {
                this.xDirection = -this.xDirection;
            }

            // angle of sides
            double theta = 1.25664;
            // length from center to top of pentagon
            double rC = this.sprite.getHeight() / (1 + Math.cos(theta));
            // length from center to bottom of pentagon
            double rI = this.sprite.getHeight() - rC;

            if ((this.y - rC <= 0 && this.yDirection < 0) ||
                (this.y + rI >= SimpleDraw.HEIGHT && this.yDirection > 0)) {
                    this.yDirection = -this.yDirection;
            }
        }
        else {
            // If we have hit the edge and are moving in the wrong direction, reverse direction
            // We check the direction because if a box is placed near the wall, we would get "stuck"
            // rather than moving in the right direction
            if ((this.x <= 0 && this.xDirection < 0) ||
                (this.x + this.sprite.getWidth() >= SimpleDraw.WIDTH && this.xDirection > 0)) {
                    this.xDirection = -this.xDirection;
            }

            if ((this.y <= 0 && this.yDirection < 0) ||
                (this.y + this.sprite.getHeight() >= SimpleDraw.HEIGHT && this.yDirection > 0)) {
                    this.yDirection = -this.yDirection;
            }
        }
    }
}