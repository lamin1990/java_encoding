
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;




/**
 * A simple example of a JPanel that draws a graph.
 * 
 * @author mdixon
 */
@SuppressWarnings("serial")
public class GraphDiagram extends JPanel {
	
	private int graphPadding;
	
	public GraphDiagram() {

		setPreferredSize(new Dimension(600, 300));
		setBackground(Color.RED);
	}


	/**
	 * A method that draws a simple graph using the given array of Y values
	 * 
	 * @param g the Graphics object used for drawing.
	 * @param axisData the array of yCoordinates
	 */
	public void drawGraph(Graphics g, float[] axisData, int xStart, int XInterval) {

		g.setColor(Color.BLUE);
		// get height of the panel (so we can calculate Y position relative to bottom of the panel).
		int height = getHeight();
//		int graphWidth = getWidth() - (2 * graphPadding);
//		int maxXValue = (axisData.length - 1) * XInterval;
//		double ratio = graphWidth / maxXValue;
		
		int x = xStart;		// start x point (left of panel) 
		// previous coord positions.
		int prevX = x;
		int prevY = (int) axisData[0];
		
		for (float y : axisData ) {
			// draw a line from previous position, to next x,y position.
//			x = (int)Math.ceil((x * ratio));
//			prevX = (int)Math.ceil((prevX * ratio));
			
			g.drawLine(prevX, height - prevY, x, height -(int) y);
			// store previous coord for next iteration of the loop.
			prevX = x;
			prevY = (int) y;
			// add an increment to the X pos.
			x = x + XInterval;	
		}
	}
	
	public void drawXAxis(Graphics g, int xStart, int xInterval, int count) {
		g.setColor(Color.BLUE);
		//---|----------------|---
		int yPosition = (getHeight() * 2 ) / 3;
		int x2 = ( getWidth() - (graphPadding) );
		g.drawLine(graphPadding, yPosition, x2, yPosition);
	}


	@Override
	public void paintComponent(Graphics g) {
		// This is called when the panel needs to be drawn to the screen
		
		try {
		// do default painting first (fills the background etc.)
		super.paintComponent(g);
		List<String> list = new ArrayList<String>();
		graphPadding = ( getWidth() * 5 ) / 100;
		
		// draw a title string
		int titleXPosition = ( getWidth() / 2 ) - Mysplitpane.chartTitle.length();
		int titleYPosition = ( getHeight() / 2 ) - Mysplitpane.yLabel.length();
		
		g.drawString(Mysplitpane.chartTitle, titleXPosition , 20);
		g.drawString(Mysplitpane.yLabel, 10, titleYPosition);
		
//		for(int i = 0; i < Mysplitpane.dataParts.length; i++) {
//			String nextVal = Mysplitpane.dataParts[i];
//			list.add(nextVal);
//		}
//		
//		float[] graphValues = new float[list.size()];
//		
//		for(int x = 0; x < list.size(); x++) {
//			
//			graphValues[x] = Float.parseFloat(list.get(x));
//			
//			if(Mysplitpane.xInterval < 20 && Mysplitpane.xInterval > 5) {
//				graphValues[x] = ( graphValues[x] * 10 );
//			}
//		}
			drawXAxis(g, Mysplitpane.xStart, Mysplitpane.xInterval, Mysplitpane.chartData.length);
			drawGraph(g, Mysplitpane.chartData, Mysplitpane.xStart, Mysplitpane.xInterval);
			
			g.setColor(Color.BLACK);
			g.drawString(Mysplitpane.xLabel, titleXPosition, (2 * getHeight()) / 3 );
		}
		catch(NullPointerException e) 
		{
			
		}
	}
		// define an array of Y coordinates - these would normally be stored in an attribute (possibly once read from a file). 
	public boolean IsValidFloat(String value) {
		try {
			Float.parseFloat(value.trim());
			return true;
		}
		catch(NumberFormatException ex) {
			return false;
		}
	}
	public float ParseFloat(String floatStr) {
		return Float.parseFloat(floatStr);
	}
	
	
	//-----------------------------------------------------------------
	//  Displays the main frame of the program.
	//-----------------------------------------------------------------
	/*public static void main(String[] args) {

		JFrame frame = new JFrame("A graphics program");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new GraphDiagram());

		frame.pack();
		frame.setVisible(true);
	}*/
}