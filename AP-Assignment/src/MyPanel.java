import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;

import javax.swing.*;

public class MyPanel extends JPanel {
	
	
	private JPanel gpanel; 
	private JPanel txtpanel; 
	private JTextArea textarea;
	private JScrollPane scroll;
	
	//= new JPanel();
	
	//= new JPanel();
	 
	//= new JTextArea(14, 50);
	
	//= new JScrollPane(textarea);
	
	
	
	public MyPanel() {
		
		createPanel();
			
	}
	/*JPanel apanel = new JPanel();
	JPanel gpanel = new JPanel();
	JPanel tpanel = new JPanel();
	apanel.setLayout(new BorderLayout());
	
	apanel.add(gpanel);
	apanel.add(tpanel);
	
	tpanel.setPreferredSize(new Dimension (770, 460));
	tpanel.setBackground(Color.GREEN);
	gpanel.setBackground(Color.GRAY);*/
	
	public void createPanel() {
		
		setLayout(new BorderLayout());
		
		gpanel = new JPanel();
		gpanel.setBackground(Color.WHITE);
		gpanel.setPreferredSize(new Dimension (770, 330));
		add(gpanel,BorderLayout.EAST);
		
	
		
		
		textarea = new JTextArea();
		textarea.setEditable(true);
	    textarea.setSize(400, 400);
	    
	    JTextArea textarea = new JTextArea(100, 50);
		scroll = new JScrollPane(textarea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		
		txtpanel = new JPanel();
		txtpanel.setBackground(Color.BLACK);
		txtpanel.setPreferredSize(new Dimension (400, 230));
		add(txtpanel,BorderLayout.CENTER);
	
		add(scroll);
		
		
		
		
		//add(textarea, BorderLayout.WEST);
		
		
		
		//add(gpanel);
		//add(txtpanel);
		
	}

}
