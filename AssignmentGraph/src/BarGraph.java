import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

public class BarGraph extends JPanel {
    private static final int PREF_W = 600;
    private static final int PREF_H = 300;
    
    private static int MAX_Y_VALUE = 20;
    private static final int BORDER_GAP = 30;
    private static final Color Y_AXIS_COLOR = Color.BLACK;
    private static final int Y_HATCH_CNT = 10;

    public BarGraph() {
    	setPreferredSize(new Dimension(PREF_W, PREF_H));
    	// make this pane transparent
    	setOpaque(false);
    }
    
    /**
	 * A method that draws a simple graph using the given array of Y values
	 * 
	 * @param g the Graphics object used for drawing.
	 * @param axisData the array of yCoordinates
	 * @param xStart the starting value for the xAxis
	 * @param XInterval the stepping value for the xAxis
	 */
	public void drawGraph(Graphics g, float[] axisData, float xStart, float XInterval) {
		g.setColor(Color.BLUE);
		// calculate the scale for the x axis
		double xScale = ((double) getWidth() - (2 * BORDER_GAP)) / (axisData.length - 1);
		// calculate the scale for the y axis
		// using the scale formula
		double yScale = ((double) getHeight() - (2 * BORDER_GAP)) / (MAX_Y_VALUE - 1);
		
		List<Point> graphPoints = new ArrayList<Point>();
		float total = 0;
		// generate x and y coordinates -> ploting points
		for (int i = 0; i < axisData.length; i++) {
			// x calculated from the scale + the chart padding
			int x1 = (int) (i * xScale + BORDER_GAP);
			// y value: height of the bar, is calculated relative to the maximum bar height
			int y1 = (int) ((MAX_Y_VALUE - axisData[i]) * yScale + BORDER_GAP);
			// accumulated the value - to calculate the average
			total += axisData[i];
			
			graphPoints.add(new Point(x1, y1));
		}
		
		// calculate the average for the y values
		int average = 0;
		if(axisData.length > 0) { // avoid dividing by zero in case of an empty dataset
			average = (int) total / axisData.length;
		}
		
		// create x and y axes
		g.setColor(Color.BLUE);
		g.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, BORDER_GAP, BORDER_GAP);
		g.setColor(Y_AXIS_COLOR);
		g.drawLine(BORDER_GAP, getHeight() - BORDER_GAP, getWidth() - BORDER_GAP, getHeight() - BORDER_GAP);

		// create labels for y axis.
		for (int i = 0; i < axisData.length; i++) {
			int x = BORDER_GAP;
			int y = getHeight() - (((i + 1) * (getHeight() - BORDER_GAP * 2)) / Y_HATCH_CNT + BORDER_GAP);
			// draw y values only for the starting point
			// and every other third position
			// and the last value
			// to avoid overlaps
			if(i == 0 || i % 3 == 0 || i == axisData.length - 1)
				g.drawString( axisData[i] + "" , x, y);
		}
		
		g.setColor(Color.BLUE);
		// and for x axis
		for (int i = 0; i < axisData.length - 1; i++) {
			int x = (i + 1) * (getWidth() - BORDER_GAP * 2) / (axisData.length - 1) + BORDER_GAP;
			int y = getHeight() - ( BORDER_GAP / 2);
			// draw x values only for the starting point
			// and every other third position
			// and the last value
			// to avoid overlaps
			if(i == 0 || i % 3 == 0 || i == axisData.length - 1)
				g.drawString( (( i + 1 ) * XInterval) + "" , x, y);
		}
		
		// bar width is distributed equally among the datapoints for the available width
		// subtracting the border gap for left and right padding
		// if we have a width of 300 and 6 data points
		// bar width => (300 - (2 * 30)) / 6 = 40
		int barWidth = (getWidth() - (2 * BORDER_GAP)) / axisData.length;
		// yStart: usable height of the graph
		int yStart = getHeight() - (BORDER_GAP); 
		
		for (int j = 0; j < graphPoints.size(); j++) {
			  // The x position of bar can be derived from it's index times the width of a bar + the border gap
			  // for example 4 bars with
		      // ** ** ** **
		      // 1  2  3  4
		      // width = 2 stars
		      // x = 1 * 2 = 2 (index 1)
		      // x = 2 * 2 = 4 (index 2)
			  int barXposition = BORDER_GAP + ( j * barWidth + 1);
		      int height = graphPoints.get(j).y; // height of a bar is equivalent to its y value
		      
		      g.setColor(Color.BLUE);
		      // fill the bar area - relative to the height of the chart
		      g.fillRect(barXposition, yStart - height, barWidth - 2, height);
		      
		      g.setColor(Color.black);
		      g.drawRect(barXposition, yStart - height, barWidth - 2, height);
		}
		
		// draw the mid point line in red
		// it stretches from the left padding x: BORDER_GAP until the start of the right padding x: chartWidth - BORDER_GAP
		// its y value is calculated relative to the scale on y values
		if(average > 0) {
			g.setColor(Color.RED);
			int midPointY = (int) ((MAX_Y_VALUE - average) * yScale + BORDER_GAP);
			g.drawLine(BORDER_GAP, midPointY, getWidth() - BORDER_GAP, midPointY);
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// This is called when the panel needs to be drawn to the screen
		
		try {
			// do default painting first (fills the background etc.)
			super.paintComponent(g);
			
			// draw a title string
			int titleXPosition = ( getWidth() / 2 ) - Mysplitpane.chartTitle.length();
			int titleYPosition = ( getHeight() / 2 ) - Mysplitpane.yLabel.length();
			
			// determine the maximum value of the datapoints
			float[] chartData = new float[Mysplitpane.chartData.length];
			for(int i = 0; i < chartData.length; i++) {
				chartData[i] = Mysplitpane.chartData[i];
			}
			
			Arrays.sort(chartData);
			MAX_Y_VALUE = (int)chartData[chartData.length - 1];
			
			drawGraph(g, Mysplitpane.chartData, Mysplitpane.xStart, Mysplitpane.xInterval);
			
			g.setColor(Color.BLACK);
			g.drawString(Mysplitpane.chartTitle, titleXPosition , 20);
			g.drawString(Mysplitpane.yLabel, 10, titleYPosition);
			
			g.setColor(Color.BLACK);
			g.drawString(Mysplitpane.xLabel, titleXPosition, getHeight() - (BORDER_GAP / 4) );
		}
		catch(NullPointerException e) 
		{
			
		}
	}   
}