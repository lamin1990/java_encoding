import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;

public class AssignFrame2 {

	public static void main(String[] args) {
		//Create oject of Jframe called myframe.
		JFrame myFrame = new JFrame("Welcome to my Java Project");
		
		//Create menu object of AssignMenu and Mysplitpane.
		Mysplitpane spobject = new Mysplitpane();
		AssignMenu menu = new AssignMenu(spobject);
		
		//Adding the menu bar to the frame.
		myFrame.setJMenuBar(menu);
		//myFrame.add(splitObject);
		//Exit out of program when close.
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add cp object to the frame
		myFrame.getContentPane().add(spobject.splitPane,BorderLayout.CENTER);
		
		//myFrame.pack();
		
		
		//Set size of the frame.
		
		myFrame.setSize(600, 400);
				
		//making frame visible
		myFrame.setVisible(true);
		
		
	
	}

}
