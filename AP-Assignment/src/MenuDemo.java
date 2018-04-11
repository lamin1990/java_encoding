import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JFrame;

/**
 * Simple example of how to add a menu bar and options. Also shows how to popup a simple dialogue box.
 * 
 * See http://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
 * 
 * @author mdixon
 */
public class MenuDemo {

	/**
	 * Sets up the demo menu.
	 * 
	 * @return the created {@link JMenuBar}.
	 */
	JMenuBar setupMenu() {

		//Create the menu bar itself.
		JMenuBar menuBar = new JMenuBar();

		// Create a menu
		JMenu menu1 = new JMenu("Menu");
		
		menuBar.add(menu1);

		// Create the menu options.
		JMenuItem menuItem1 = new JMenuItem("Item 1", KeyEvent.VK_1);
		JMenuItem menuItem2 = new JMenuItem("Item 2", KeyEvent.VK_2);
		JMenuItem menuItem3 = new JMenuItem("Item 3", KeyEvent.VK_3);
		
		// Add the options to the menu
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menu1.addSeparator();
		menu1.add(menuItem3);
		
		// Add the action listeners that identify the code to execute when the options are selected.
		menuItem1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Option 1 selected");
			}
		});
		
		menuItem2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Option 2 selected");
			}
		});
		
		menuItem3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Option 3 selected");
			}
		});
		
		return menuBar;
	}
	
	 
	/**
	 * Main program, creates a simple frame with a menu bar.
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
    	
        //Create and set up the window.
        JFrame frame = new JFrame("MenuDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        MenuDemo demo = new MenuDemo();
        frame.setJMenuBar(demo.setupMenu());
    
        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }
}
