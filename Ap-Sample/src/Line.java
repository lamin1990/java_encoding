import java.awt.*; 
public class Line extends ShapeObject{
    int x, y, x2, y2; 
    Color color; 
	public Line(int penX, int penY, int xDest, int yDest, Color c)
	{
		x=penX; 
		y=penY; 
		x2=xDest; 
		y2=yDest; 
		color=c; 
	}
	public void paintObject(Graphics g)
	{
		g.setColor(color);
		g.drawLine(x, y, x2, y2);
	}
}
