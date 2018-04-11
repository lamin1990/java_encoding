import java.awt.Color;
import java.awt.Graphics; 
public class Text extends ShapeObject{
    int x, y;
    String textString; 
    Color color; 
	public Text(int penX, int penY, String str, Color c)
	{
		x=penX; 
		y=penY; 
		textString=str; 
		color=c;  
	}
	public void paintObject(Graphics g)
	{
		g.setColor(color);
		g.drawString(textString,x, y );
	}
}
