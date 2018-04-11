import java.awt.Color;
import java.awt.Graphics; 
public class SolidRectangle extends ShapeObject {
    int length, width, x, y; 
    Color color; 
	public SolidRectangle(int penX,int  penY, int len, int wid, Color c)
	{
		x=penX; 
		y=penY; 
		length=len;
		width=wid; 
		color=c; 
	}
	public void paintObject(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, length,width);
	}
}
