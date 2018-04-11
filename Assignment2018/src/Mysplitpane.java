import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.swing.*;


public class Mysplitpane extends JPanel {
	
	//Declare variables
	static JSplitPane splitPane;
	private JTextArea textarea;
	private JScrollPane scroll;
	private JScrollPane rightscroll;
	static JPanel diagram = new JPanel();
	static JPanel gpanel = new JPanel();
	
	static String[] dataParts = null;
	static float[] chartData;
	static String lineValue;
	
	static float xStart, xInterval;
	
	static String chartTitle;
	static String xLabel;
	static String yLabel;
	
	// constructor
	public  Mysplitpane() {
	
		gpanel.setBackground(Color.WHITE);
		
	
		textarea = new JTextArea(100, 50);
		
		scroll = new JScrollPane(textarea);
		rightscroll = new JScrollPane(gpanel);
	
		//scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		rightscroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
	
	splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scroll, rightscroll );
	
	
	
	splitPane.setOneTouchExpandable(true);
	splitPane.setDividerLocation(250);
	//Allow or disallow editing
	textarea.setEditable(false);
	

	}
		//Creating a method to read a text file
	public void readFromFile() {
		final JFileChooser fc = new JFileChooser();

		// you can set the directory with the setCurrentDirectory method.
		int returnVal = fc.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			// User has selected to open the file.
			
			File file = fc.getSelectedFile();
			
			try {
				// Open the selected file
				BufferedReader reader = new BufferedReader(new FileReader(file));
				

				// Output the contents to the console.
				String nextLine = reader.readLine();
				 lineValue = "";
				//Scanner Scan = new Scanner(file);
				int linePosition = 0;
				
				
				
				while ( nextLine != null ) {
					linePosition = linePosition + 1;
					
					switch(linePosition) {
						case 1: // Title
							lineValue = nextLine.replace("Title:", ""); 
							if(nextLine.startsWith("Title:") && IsNotEmpty(lineValue)) {
								chartTitle = lineValue;
								textarea.append(nextLine + "\n");
							}
							else {
								JOptionPane.showMessageDialog(null, "Please specify a chart title in your input file");
								break;
							}
							break;
						case 2: // YLabel
							lineValue = nextLine.replace("YLabel:", "");
							if(nextLine.startsWith("YLabel:") && IsNotEmpty(lineValue)) {
								yLabel = lineValue;
								textarea.append(nextLine + "\n");
							}
							else {
								JOptionPane.showMessageDialog(null, "Please specify a label for the Y axis in your input file");
								break;
							}					
							break;
						case 3: // XLabel
							lineValue = nextLine.replace("XLabel:", "");
							if(nextLine.startsWith("XLabel:") && IsNotEmpty(lineValue)) {
								xLabel = lineValue;
								textarea.append(nextLine + "\n");
							}
							else {
								JOptionPane.showMessageDialog(null, "Please specify a label for the X axis in your input file");
								break;
							}
							break;
						case 4: // XStart
							lineValue = nextLine.replace("XStart:", "").trim();
							if(nextLine.startsWith("XStart:") && IsValidFloat(lineValue)) {
								xStart = ParseFloat(lineValue);
								if(xStart >= 0) {
									textarea.append(nextLine + "\n");
								}
								else {
									JOptionPane.showMessageDialog(null, "xStart cannot be less than zero");
									break;
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Please specify a valid number for x start in your input file");
								break;
							}
							break;
						case 5: // XInterval
							lineValue = nextLine.replace("XInterval:", "").trim();
							if(nextLine.startsWith("XInterval:") && IsValidFloat(lineValue)) {
								xInterval = ParseFloat(lineValue);
								if(xInterval > 0) {
									textarea.append(nextLine + "\n");
								}
								else {
									JOptionPane.showMessageDialog(null, "xInterval cannot be less than zero");
									break;
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Please specify a valid number for xInterval in your input file");
								break;
							}
							break;
						case 6: // Data
								if(IsNotEmpty(nextLine)) {
									 dataParts = nextLine.split(",");
									chartData = new float[dataParts.length];
									
									for(int i = 0; i < dataParts.length; i++) {
										lineValue = dataParts[i].trim();
										if(IsValidFloat(lineValue)) {
											chartData[i] = ParseFloat(dataParts[i]);
										}
										
										else {
											JOptionPane.showMessageDialog(null, "The value "  + lineValue + " is not a valid data point");
											break;
										}
										
									}
								}
								else {
									JOptionPane.showMessageDialog(null, "Not data specified");
									break;
								}
							break;
	
					}
					nextLine = reader.readLine();
				}
				
				reader.close();

			} catch (IOException e) {
				
				System.err.println("Error while reading the file");
			} 
		}

	}
		
	public boolean IsNotEmpty(String value) {
		if(value != null && value.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean IsValidInteger(String value) {
		try {
			Integer.parseInt(value.trim());
			return true;
		}
		catch(NumberFormatException ex) {
			return false;
		}
	}
	
	public int ParseInt(String intStr) {
		return Integer.parseInt(intStr);
	}
	
	public float ParseFloat(String floatStr) {
		return Float.parseFloat(floatStr);
	}
	
	public boolean IsValidFloat(String value) {
		try {
			Float.parseFloat(value.trim());
			return true;
		}
		catch(NumberFormatException ex) {
			return false;
		}
	}
}


