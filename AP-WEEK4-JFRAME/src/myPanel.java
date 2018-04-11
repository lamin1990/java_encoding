import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class myPanel extends JPanel implements ActionListener {
	
	JLabel lblName;
	JButton btnSave;
	JButton btnExit;
	
	public myPanel() 
	{
		
		lblName = new JLabel("Would you like to Save or Exit");
		btnSave = new JButton("save");
		btnExit = new JButton("Exit");
		
		btnSave.addActionListener(this);
		btnExit.addActionListener(this);
		
		add(btnSave);
		add(btnExit);
		add(lblName);
		
		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.GRAY);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//lblName.setText("")
		
		if(e.getSource() == btnSave)
			
			//lblName.setText("Software Development - GUI Event Handler => Save");
			lblName.setText("Event handling Example - usert Clicked Save Button");
			
		else
			System.exit(0);
		
	}



}
