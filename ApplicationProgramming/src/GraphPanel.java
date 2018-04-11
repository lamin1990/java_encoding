import java.awt.*;
import javax.swing.*;

/**
 * A simple example of a JPanel that draws a graph.
 * 
 * @author mdixon
 */
@SuppressWarnings("serial")
public class GraphPanel extends JPanel {

	public GraphPanel() {

		setPreferredSize(new Dimension(600, 300));
		setBackground(Color.WHITE);
	}


	/**
	 * A method that draws a simple graph using the given array of Y values
	 * 
	 * @param g the Graphics object used for drawing.
	 * @param yCoords the array of yCoordinates
	 */
	public void drawGraph(Graphics g, int yCoords[]) {

		g.setColor(Color.BLUE);

		// get height of the panel (so we can calculate Y position relative to bottom of the panel).
		int height = getHeight();
		
		int x = 20;		// start x point (left of panel) 

		// previous coord positions.
		int prevX = x;
		int prevY = yCoords[0];

		for (int y : yCoords ) {
			// draw a line from previous position, to next x,y position.
			g.drawLine(prevX, height - prevY, x, height - y);

			// store previous coord for next iteration of the loop.
			prevX = x;
			prevY = y;

			// add an increment to the X pos.
			x = x + 50;	
		}
	}


	@Override
	public void paintComponent(Graphics g) {
		// This is called when the panel needs to be drawn to the screen
		
		// do default painting first (fills the background etc.)
		super.paintComponent(g);

		// draw a title string
		g.drawString("A graph", 250 ,20);

		// define an array of Y coordinates - these would normally be stored in an attribute (possibly once read from a file). 
		int yCoords[] = { 10, 40, 50, 80, 100, 150, 100, 90, 180, 170, 50 };

		// call the method that draws the graph.
		drawGraph(g, yCoords);
	} 

	
	//-----------------------------------------------------------------
	//  Displays the main frame of the program.
	//-----------------------------------------------------------------
	public static void main(String[] args) {

		JFrame frame = new JFrame("A graphics program");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new GraphPanel());

		frame.pack();
		frame.setVisible(true);
	}
}