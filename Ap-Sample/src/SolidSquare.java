import java.awt.Color;
import java.awt.Graphics; 
public class SolidSquare extends ShapeObject {
    int length,  x, y; 
    Color color; 
	public SolidSquare(int penX,int  penY, int len,  Color c)
	{
		x=penX; 
		y=penY; 
		length=len;
		color=c; 
	}
	public void paintObject(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, length,length);
	}
}