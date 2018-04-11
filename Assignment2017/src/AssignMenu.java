import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


//Assign menu inherit JMENUBar
public class AssignMenu extends JMenuBar {
	
	//Declare and Initialize Jmenu and JMenuItems
	
	JMenu fileMenu, helpMenu;
	JMenuItem load, save, exit, about, help;
	
	//declare object of splitpane
	Mysplitpane cp;
	
	//Constructor
	//receive object from frame class and make it equal to cp or ssp object
	
	 public AssignMenu(Mysplitpane spp) {
		 this.cp = spp;
		
		//Build the first menu.
		fileMenu = new JMenu("File");
		add(fileMenu);
		//Add short cut to menu items
		load = new JMenuItem("Load", KeyEvent.VK_L);
		load.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.Event.CTRL_MASK));
		fileMenu.add(load);
		
		save = new JMenuItem("Save", KeyEvent.VK_S);
		save.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.Event.CTRL_MASK));
		fileMenu.add(save);
		
		exit = new JMenuItem("Exit", KeyEvent.VK_E);
		exit.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.Event.CTRL_MASK));
		fileMenu.add(exit);
		
	
		helpMenu = new JMenu("Help");
		add(helpMenu);
		
		about = new JMenuItem("About", KeyEvent.VK_A);
		about.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.Event.CTRL_MASK));
		helpMenu.add(about);
		
		help = new JMenuItem("Help", KeyEvent.VK_H);
		help.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.Event.CTRL_MASK));
		helpMenu.add(help);
	
		
		// Add the action listeners that identify the code to execute when the options are selected.
		
		
		load.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			//Call the method read from file	
			try {
				
				cp.readFromFile();
				Mysplitpane.gpanel.removeAll();
				Mysplitpane.gpanel.add(new GraphDiagram());
				Mysplitpane.gpanel.revalidate();
				Mysplitpane.gpanel.repaint();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}

			
			}
		});
		
		//add action listener to save
		save.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Save menu is been press!");
			}
		});
		//add action listener to exit
		exit.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		//add action listener to about
		about.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
					    "First graphic user interface made Lamin Khan.","About",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		//add action listener to help
		help.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Click File to open menuitem load, save and exit choose load to open text file from your drive!\n "
						+ "Press Exit to close the Application.\n "
						+ "Press Helpmenu and click Help for more instruction\n "
						+ "Press About to find out more about the Application");
			}
		});
		
	}
		

		
		
		
		

	}


