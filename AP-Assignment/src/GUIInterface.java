   import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class GUIInterface {
	
	
	
	public void createFrame() {
		
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setLayout(new BorderLayout());
		
		

		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel graphPanel = new JPanel();
		

		graphPanel.setPreferredSize(new Dimension (770, 330));
		graphPanel.setBackground(Color.WHITE);
		
		//frame.getContentPane().add(graphPanel, BorderLayout.NORTH);
		
		
		
		JPanel textPanel = new JPanel();
		textPanel.setPreferredSize(new Dimension (770, 460));
		textPanel.setBackground(Color.GREEN);

		frame.getContentPane().add(textPanel,BorderLayout.SOUTH);
		
		JTextArea textarea = new JTextArea(14, 50);
	    JScrollPane scroll = new JScrollPane(textarea);
	    
	    
	    textarea.setEditable(false);
        textarea.setSize(460, 200);
        textarea.setBackground(Color.BLUE);

        textPanel.add(scroll, BorderLayout.WEST);
		
		JMenuBar menuBar;
		JMenu fileMenu, helpMenu;
		JMenuItem load, save, exit, about, help;
		
		menuBar = new JMenuBar();
		
		//Build the first menu.
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		fileMenu.getAccessibleContext().setAccessibleDescription(
		        "File");
		menuBar.add(fileMenu);
		
		load = new JMenuItem("Load");
		load.setMnemonic(KeyEvent.VK_L);
		load.getAccessibleContext().setAccessibleDescription(
		        "Load");
		fileMenu.add(load);
		
		save = new JMenuItem("Save");
		save.setMnemonic(KeyEvent.VK_S);
		save.getAccessibleContext().setAccessibleDescription(
		        "Save");
		fileMenu.add(save);
		
		exit = new JMenuItem("Exit");
		exit.setMnemonic(KeyEvent.VK_E);
		exit.getAccessibleContext().setAccessibleDescription(
		        "Exit");
		fileMenu.add(exit);
		
		
	
		helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_H);
		helpMenu.getAccessibleContext().setAccessibleDescription(
		        "Help");
		menuBar.add(helpMenu);
		
		about = new JMenuItem("About");
		about.setMnemonic(KeyEvent.VK_A);
		about.getAccessibleContext().setAccessibleDescription(
		        "About");
		helpMenu.add(about);
		
		help = new JMenuItem("Help");
		help.setMnemonic(KeyEvent.VK_S);
		help.getAccessibleContext().setAccessibleDescription(
		        "Help");
		helpMenu.add(help);
		
		
		
		//add graph panel to frame using layout manager set to north
		frame.getContentPane().add(graphPanel,BorderLayout.NORTH);
		
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}

}
