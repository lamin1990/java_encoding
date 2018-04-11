import javax.swing.JFrame;

public class Week4FrameExample 
{
	public static void main(String[] args) 
	{
		
		
		JFrame myFrame =  new JFrame("AP Week4 lab");
		myPanel apanel = new myPanel();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setContentPane(apanel);
		myFrame.pack();
		//myFrame.setSize(200, 300);
		myFrame.setVisible(true);
		
		
	}

}
