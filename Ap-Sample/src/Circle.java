import java.awt.*; 
public class Circle extends ShapeObject {
    int radius, x, y; 
    Color color; 
	public Circle(int penX,int  penY, int r, Color c)
	{
		x=penX; 
		y=penY; 
		radius=r; 
		color=c; 
	}
	public void paintObject(Graphics g){
		g.setColor(color);
		g.drawOval(x, y, radius, radius);
	}
}
