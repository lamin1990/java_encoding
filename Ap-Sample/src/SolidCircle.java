import java.awt.Color;
import java.awt.Graphics; 
public class SolidCircle extends ShapeObject {
    int radius, x, y; 
    Color color; 
	public SolidCircle(int penX,int  penY, int r, Color c)
	{
		x=penX; 
		y=penY; 
		radius=r; 
		color=c; 
	}
	public void paintObject(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, radius, radius);
	}
}