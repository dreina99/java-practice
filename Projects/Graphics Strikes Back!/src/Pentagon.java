import java.awt.Color;
import java.awt.Graphics;

public class Pentagon implements Sprite {
    private Color color;
    int width;
    int height;

    /**
    * Create a pentagon that has bounding box dimensions width and height, 
    * filled with color.
     */
    public Pentagon (int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
  

    public void draw(Graphics surface, int x, int y) {
        // angle of side = 72 degrees
        double theta = 1.25664;

        // center to upper point of pentagon
        double rC = this.height / (1 + Math.cos(theta));
        // center to lower point of pentagon
        double rI = this.height - rC;

        // Draw the object
        surface.setColor(Color.BLACK);

        // length of pentagon side
        double s = (2 * this.height * Math.sin(theta / 2)) / (1 + Math.cos(theta / 2));
        // height of outer points
        double h2 = this.height - s * Math.sin(theta);
        // width of bottom points
        double w1 = s * Math.cos(theta);
        
        int[] xs = {x, x + this.width / 2, x + this.width/2 - (int)w1, x - this.width / 2 + (int) w1, x - this.width / 2};
        int[] ys = {y - (int) rC, y - (int)rC + (int) h2, y + (int)rI, y +(int) rI, y - (int) rC + (int) h2};

        surface.drawPolygon(xs, ys, 5);
        surface.setColor(color);
        surface.fillPolygon(xs, ys, 5);
    }

    public int getWidth() {
        return this.width / 2;
    }

    public int getHeight() {
        return this.height;
    }
}
