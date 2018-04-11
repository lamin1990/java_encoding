import java.awt.Color;
import java.awt.Graphics; 
public class Square extends ShapeObject {
    int length,  x, y; 
    Color color; 
	public Square(int penX,int  penY, int len,  Color c)
	{
		x=penX; 
		y=penY; 
		length=len;
		color=c; 
	}
	public void paintObject(Graphics g){
		g.setColor(color);
		g.drawRect(x, y, length,length);
	}
}
