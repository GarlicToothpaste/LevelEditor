import java.awt.*;
import java.awt.geom.*;
public class Node{
    private double x,y,radius;
    private Paint fillColor;

    public Node(double x, double y, double r, Paint fc){
        this.x = x;
        this.y = y;
        radius = r;
        fillColor = fc;
    }

    public void draw(Graphics2D g2d){
		Ellipse2D.Double circle = new Ellipse2D.Double(x,y,radius*2,radius*2);
		g2d.setPaint(fillColor);
		g2d.fill(circle);
		g2d.draw(circle);
    }

}