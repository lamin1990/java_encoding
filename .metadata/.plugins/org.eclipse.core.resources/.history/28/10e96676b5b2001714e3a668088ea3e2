import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.io.*;
import java.util.ArrayList; 
class mainFrame extends JFrame implements ActionListener  {
	//variable declarations
	JPanel basePanel; 
	JTextArea textArea; 
	JButton abstractButton; 
	executionClass executionPanel; 
	JMenuBar menuBar; 
	JMenu fileMenu, helpMenu; 
	JMenuItem openMenuItem, saveMenuItem, exitMenuItem, helpMenuItem; 
	int radius; 
	String instruction; 
	String[] instructionArray; 
	int penX, penY, x2,y2, length, width; 
	
	ArrayList<ShapeObject> list; 
	Color color;
	String instructionLine; 
	
	mainFrame(){
		
		list=new ArrayList<>();
		
		basePanel =new JPanel(); 
		//creating Menu Bar with items 
		menuBar=new JMenuBar(); 
		
		fileMenu=new JMenu("File");
		helpMenu=new JMenu("Help");
		
		openMenuItem=new JMenuItem("Load");
		saveMenuItem=new JMenuItem("Save");
		exitMenuItem=new JMenuItem("Exit");
		helpMenuItem=new JMenuItem("Help");
		openMenuItem.addActionListener(this);
		//adding action to the Exit menu
		exitMenuItem.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	                System.exit(0);
	        }
	    });

		//adding action to the help menu
		helpMenuItem.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {
	        	JOptionPane.showMessageDialog(null, "Welcome to Java Project");

	        }
	    });
		
		
		//adding menu items to the menus 
		fileMenu.add(openMenuItem); 
		fileMenu.add(saveMenuItem); 
		fileMenu.add(exitMenuItem); 
		
		helpMenu.add(helpMenuItem); 
		
		//adding menus to the menu bar
		menuBar.add(fileMenu); 
		menuBar.add(helpMenu); 
		
		//setting the Menu Bar of the JFrame
		setJMenuBar(menuBar); 
		
		//
		basePanel.setBackground(Color.green);
		//adding two panels one the base panel , one for display of instructions and 
		//other for execution of those instructions
		basePanel.add(new instructionClass()); 
		executionPanel=new executionClass(); 
		basePanel.add(executionPanel); 
		
		//adding base panel on the frame content's pane 
	    getContentPane().add(basePanel); 
	    //packing the items 
	    pack(); 
	    //setting frame visibility
	    setVisible(true); 
	}
	//method attached to the Action listener of  the Load menu item 
	public void actionPerformed(ActionEvent actionEvent){

		//choosing file 
		JFileChooser fileChooser = new JFileChooser();
    	fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
	    
        if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        	File fileName=  fileChooser.getSelectedFile();
        	try{
        		//reading data from the chosen file path 
        	   FileInputStream fileStream =  new FileInputStream(fileName.getAbsolutePath());
    	       DataInputStream  inputData = new DataInputStream (fileStream);
    	       BufferedReader  myBuffer = new BufferedReader(new InputStreamReader(inputData));
      	       
    	       while ((instructionLine =myBuffer.readLine()) != null)
      	       {
    	    	   
    	    	   abstractButton.doClick(); 
      	       }
        	}
        	catch(Exception e){
      	    	System.out.println("Fie not Correct exception ");    
      	    } 	    	   
        }
	}
	public class ButtonListener implements ActionListener{
		public void actionPerformed (ActionEvent actionEvent){
			 //splitting each line of instruction in the file into its parts
	    	   int indicator=0; 
	    	   instructionArray=instructionLine.split(" "); 
	    	   instruction=instructionArray[0]; 
	    	   //instruction validation and object creation according to the instruction line 
	       	 try{
	    	    if(instruction.equalsIgnoreCase("Circle"))
	    	    {
	        	   radius=Integer.parseInt(instructionArray[1]);
	        	   list.add(new Circle(penX, penY, radius, color)); 
	    		   indicator++; 
	            }
	    	    
	    	    if(instruction.equalsIgnoreCase("Solid_Circle"))
	    	    {
	        	   radius=Integer.parseInt(instructionArray[1]);
	        	   list.add(new SolidCircle(penX, penY, radius, color)); 
	    		   indicator++; 
	            }
	    	    if(instruction.equalsIgnoreCase("Line"))
	    	    {
	        	   x2=Integer.parseInt(instructionArray[1]);
	    		   y2=Integer.parseInt(instructionArray[2]); 
	    		   list.add(new Line(penX,penY, x2, y2, color)); 
	        	   indicator++; 
	            }
	    	    if(instruction.equalsIgnoreCase("Move"))
	    	    {	
	    	    	penX=Integer.parseInt(instructionArray[1]);
	    	    	penY=Integer.parseInt(instructionArray[2]); 
	    	    	indicator++; 
	    	  	}
	    	    if(instruction.equalsIgnoreCase("Colour"))
	    	    {
	    	    	int R=Integer.parseInt(instructionArray[1]);
	    	        int G=Integer.parseInt(instructionArray[2]); 
	    	    	int B=Integer.parseInt(instructionArray[3]); 
	    	    	color=new Color(R,G,B); 
	    	    	indicator++; 
	    	    }
	    	    if(instruction.equalsIgnoreCase("Clear"))
	    	    {
	    	    	indicator++; 
	    	    	for (ShapeObject sObj:list)
	    				list.remove(sObj);
	    	    	
	    	    }
	    	    if(instruction.equalsIgnoreCase("Text"))
	    	    {
	    	    	String textString=""; 
	    	    	for(int i=1; i<instructionArray.length; i++)
	    	    		textString+=instructionArray[i]+ " ";
	    	    	list.add(new Text(penX,penY, textString, color)); 
		        	  
	    	    	indicator++; 
	    	    }
	    	    if(instruction.equalsIgnoreCase("Rectangle"))
	    	    {
	        	   length=Integer.parseInt(instructionArray[1]);
	        	   width=Integer.parseInt(instructionArray[2]); 
	        	   list.add(new Rectangle(penX, penY, length,width, color)); 
	    		   indicator++; 
	            }
	    	    if(instruction.equalsIgnoreCase("Solid_Rectangle"))
	    	    {
	        	   length=Integer.parseInt(instructionArray[1]);
	        	   width=Integer.parseInt(instructionArray[2]); 
	        	   list.add(new SolidRectangle(penX, penY, length,width, color)); 
	    		   indicator++; 
	            }
	    	    if(instruction.equalsIgnoreCase("Square"))
	    	    {
	        	   length=Integer.parseInt(instructionArray[1]);
	        	    list.add(new Square(penX, penY, length, color)); 
	    		   indicator++; 
	            }
	    	    if(instruction.equalsIgnoreCase("Solid_Square"))
	    	    {
	        	   length=Integer.parseInt(instructionArray[1]);
	        	    list.add(new SolidSquare(penX, penY, length, color)); 
	    		   indicator++; 
	            }
	    	    
	    	    
	    	 }
	    	 catch(Exception e){
	    		 textArea.append("Invalid instruction\n");
	    	 }
        	if(indicator>=1)
	    	 {
	    		textArea.append(instructionLine+"\n");
	    	 }
	       executionPanel.repaint(); 
		}
	}
	
	
	 class instructionClass extends JPanel{
		public instructionClass(){
			textArea=new JTextArea(25,60);
			add(textArea); 
			abstractButton=new JButton(); 
			abstractButton.addActionListener(new ButtonListener());
			setBackground(Color.blue);
			setPreferredSize(new Dimension(800,800)); 
		}
	}

	 class executionClass extends JPanel{
		 
		public executionClass(){
			penX=0; 
			penY=0; 
			color=new Color(0,0,0); 
			setBackground(Color.cyan);
			setPreferredSize(new Dimension(800,800)); 
			
		    
			
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			for (ShapeObject sObj:list)
				sObj.paintObject(g);
		}
	}
	

	public static void main(String[] args) {
		mainFrame mainObject=new mainFrame(); 
		

	}

}
