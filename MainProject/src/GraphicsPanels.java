import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 * Represents the graphics display panel within the turtle program. This panel contains an image which is updated to reflect user commands.
 * 
 * @author mdixon
 * 
 */


// Declarations and initializations with their assigned values.
@SuppressWarnings("serial")
public class GraphicsPanels extends JPanel 
{
	static int oldx=0;
	static int posx=250,posy=250; 
	static int c=0;
	static boolean actioner=false;
	static int oldy=0;
	static boolean square=false,saved=false;
	static Color col=Color.BLACK;
	static Label tur = new Label("  >");
	static Label lcom = new Label("Command");
	static GraphicsPanels ov=new GraphicsPanels();
	static TextField commander = new TextField("");
	static TextField dis = new TextField("");
	static  Button pend = new Button("Pen is up");


	/**
	 * The default BG colour of the image.
	 */
	// The state and start-up direction of the turtle along with the BG color.
	//private int xPos=0, yPos=0;
	static boolean penUp = true;
	//private int direction = 180;
	private final static Color BACKGROUND_COL = Color.WHITE;

	
	public GraphicsPanels(String title) 
	{
	    super();
	}
	
	
	/**
	 * The underlying image used for drawing. This is required so any previous drawing activity is persistent on the panel.
	 */
	private static BufferedImage image;

	/**
	 * Draw a line on the image using the given colour.
	 * 
	 * @param color
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	
	
	public static void drawLine(Color color, int x1, int y1, int x2, int y2) 
	{
		if(!square)
		{
			Graphics g = image.getGraphics();
			g.setColor(color);
			g.drawLine(x1, y1, x2, y2);
		}
		
		else
		{
			Graphics g = image.getGraphics();
			g.setColor(color);
			g.drawRect(x1, y1, x2, y2);	
		}	
	}
	
	
	/**
	 * Clears the image contents.
	 */
	
	//The method used to reset everything back to the initial start.
	public static void clear() 
	{
		c=1;
		dall(c);
		Graphics g = image.getGraphics();
		saved=false;
		g.setColor(BACKGROUND_COL);	
		g.fillRect(0, 0, image.getWidth(),  image.getHeight());
		tur.setLocation(250, 250);
		posx=250;
		posy=250;
		tur.setText("  >");	
	}
	
	@Override
	public void paint(Graphics g) 
	{
		 super.paintComponent(g);
		// render the image on the panel.
		g.drawImage(image, 0, 0, this);	
	}

	
	/**
	 * Constructor.
	 */
	GraphicsPanels() 
	{
		setPreferredSize(new Dimension(680, 500));
		image = new BufferedImage(680, 500, BufferedImage.TYPE_INT_RGB);
		// Set max size of the panel, so that is matches the max size of the image.
		setMaximumSize(new Dimension(image.getWidth(), image.getHeight()));
		setLayout(null);
		clear();
	}
	
	
	// The format of the image = PNG.
	 public static void save() throws IOException
	 {
		 c++;
		 ImageIO.write(image, "PNG", new File("temp/d"+c+".png"));       
	 }

	 
	    public static void undo() throws IOException 
	    {
	    	c--;
	    	if(new File("temp/d"+c+".png").canRead()&&c>=1)
	        {
	    			saved=false;
	    	image = ImageIO.read(new File("temp/d"+c+".png"));
	        }
	    	
	    	else
	        	c++;
	    }
	    
	    
	    public static void redo() throws IOException 
	    {
	    	c++;
	    	if(new File("temp/d"+c+".png").canRead())
	        {
	    		saved=false;
	    	image = ImageIO.read(new File("temp/d"+c+".png"));
	        }
	    	
	    	else
	        	c--;
	    }
	    
	    
	    static void dall(int i) 
	    {
			
			while(true)
        	  { 
				  File t=new File("temp/d"+i+".png");
        		  t.delete();
        		  i++;
        		  t=new File("temp/d"+i+".png");
        		  if(!t.canRead())
        			  break;		  	
        	  }
		}
	    
// The below methods and declarations are for the movement of the turtle, 
//along with all other details necessary to conduct and execute the program.

	    protected static void commands(String comm) 
		{
			Scanner s=new Scanner(System.in);
			int x=0;
			int y=0;
				if(comm.equalsIgnoreCase("Forward"))
					{System.out.println("Enter the distance in integer.");
					
					try
					{
					x=s.nextInt();
					y=x;
					
					if(tur.getText().equals("  >"))
					{
						y=0;
					}
					
					else if(tur.getText().equals(" ^"))
					{y*=-1;
						x=0;
					}
					
					else if(tur.getText().equals("<"))
					{	y=0;
						x*=-1;
					}
					
					else if(tur.getText().equals(" v"))
					{x=0;
						
					}
					
					if(!penUp)
					{drawLine(col, posx,posy,posx+x,posy+y);save();saved=false;}
					tur.setLocation(posx+x, posy+y);
					posx+=x;
					posy+=y;
					}
					
					catch(Exception m)
					{
							System.out.println("Please enter a valid distance in integer."); 
							commands(comm);
					}
					
					}
				else if(comm.equals("Backward"))
				{
					System.out.println("Enter the distance in integer.");
				
					try
					{
						x=s.nextInt();
						y=x;
				
				if(tur.getText().equals("  >"))
				{	
					x*=-1;
					y=0;
				}
				
				else if(tur.getText().equals(" ^"))
				{
					x=0;
				}
				
				else if(tur.getText().equals("<"))
				{	
					y=0;
				}
				
				else if(tur.getText().equals(" v"))
				{
					x=0;
				    y*=-1;
				}
				
				if(!penUp)
				{
					drawLine(col, posx,posy,posx+x,posy+y);;save();saved=false;	
				}
				
				tur.setLocation(posx+x, posy+y);
				posx+=x;
				posy+=y;
				}
					catch(Exception m)
					{
						System.out.println("Please enter a valid distance in integer."); 
						commands(comm);	
					}
				}
				
				else if(comm.equalsIgnoreCase("Square"))
					{
					System.out.println("Enter the width in integer.");
					
					try
					{
					x=s.nextInt();

					if(!penUp)
					{
						drawLine(col, posx,posy,posx+x,posy);
					    posx+=x;
						rotateR();
						drawLine(col, posx,posy,posx,posy+x);
						posy+=x;
						rotateR();
						drawLine(col, posx,posy,posx-x,posy);
						posx-=x;
						rotateR();
						drawLine(col, posx,posy,posx,posy-x);
						posy-=x;
						save();
						rotateR();
						saved=false;}
					}
					
					catch(Exception m)
					{
						System.out.println("Please enter valid width in integer."); 
						commands(comm);
				    }
					
					}
				
				else if(comm.equalsIgnoreCase("Circle"))
				{
					System.out.println("Enter the radius in integer.");
				try
				{
				    x=s.nextInt();
					Graphics g = image.getGraphics();
					g.setColor(col);
					if(!penUp)
						{
						g.drawOval(posx-(x/2), posy-(x/2), x, x);save();saved=false;
						}
				}
				catch(Exception m)
				{
					System.out.println("Please enter a valid radius in integer."); 
					commands(comm);
					}
				
				}
				
				
				else if(comm.equalsIgnoreCase("TurnRight"))
					rotateR();
				else if(comm.equalsIgnoreCase("TurnLeft"))
						rotateL();
				else if(comm.equalsIgnoreCase("RED"))
					col=Color.RED;
				else if(comm.equalsIgnoreCase("BLACK"))
					col=Color.BLACK;
				else if(comm.equalsIgnoreCase("GREEN"))
					col=Color.GREEN;
				else if(comm.equalsIgnoreCase("Reset"))
					{
					clear();
					}
				else
					JOptionPane.showMessageDialog(null, "Invalid command!\n Please check help for more information.");
		      }
		
		// Below are the necessary methods for saving and loading.
		public static void loader(String file) throws IOException 
		{
	    	clear();
	    	BufferedImage s=ImageIO.read(new File(file));
			
	    	image=new BufferedImage(500, 500, s.getType());
	    	Graphics2D g = image.createGraphics();
	    	g.setColor(Color.WHITE);
	    	g.fillRect(0, 0, 500, 500);
	    	g.drawImage(s, 0, 0,s.getHeight(),s.getWidth(), null);
	    	g.dispose();
	    	save();      
	    }
		
				
		public static void store()
		{
			FileDialog dialog = new FileDialog((Frame)null, "Save image");
  	        dialog.setMode(FileDialog.SAVE);
 	        dialog.setVisible(true);
 	        String file = dialog.getDirectory()+dialog.getFile()+".png";
 	    
 	    try 
 	    {
 	    	if(new File(file).canRead())
 	    		new File(file).delete();
 	    	file=file.replace(".png", "")+".png";
				ImageIO.write(image, "png", new File(file));
				
		} 
 	    
 	    catch (IOException e1) 
 	    {
			e1.printStackTrace();
		}
 	   saved=false;
 	  
		}
		
		// Below are the rotations for the turtle with their command strings.
		public static void rotateL()
		{
			if(tur.getText().equals("  >"))
			{
				tur.setText(" ^");
			    tur.setFont(new Font("Tahoma", Font.BOLD, 26));
			}
			else if(tur.getText().equals(" ^"))
				{
				    tur.setText("<");
				    tur.setFont(new Font("Tahoma", Font.BOLD, 22));
				}
			else if(tur.getText().equals("<"))
				{
				    tur.setText(" v");
				    tur.setFont(new Font("Tahoma", Font.BOLD, 22));}
			else if(tur.getText().equals(" v"))
				{   
				    tur.setText("  >");
				    tur.setFont(new Font("Tahoma", Font.BOLD, 22));
				}
		}
		
		
		
		public static void rotateR()
		{
			if(tur.getText().equals("  >"))
			{
				tur.setText(" v");
			    tur.setFont(new Font("Tahoma", Font.BOLD, 22));
			}
			
			else if(tur.getText().equals(" v"))
				{
				    tur.setText("<");
				    tur.setFont(new Font("Tahoma", Font.BOLD, 22));
				}
			else if(tur.getText().equals("<"))
				{
				    tur.setText(" ^");
				    tur.setFont(new Font("Tahoma", Font.BOLD, 26));
				}
			else if(tur.getText().equals(" ^"))
				{   
				    tur.setText("  >");
				    tur.setFont(new Font("Tahoma", Font.BOLD, 22));
				}
		}
		
		//The getter and setter of the commands, in order to interpret the lines of the user.
		public static void getcommands()
		{
			String comm="";
		    dis.setText(" ");
			{
				if(commander.getText().toString().contains(" "))
				{
					dis.setText(commander.getText().toString().substring(commander.getText().toString().lastIndexOf(' ')+1, commander.getText().toString().length()));
				    comm=commander.getText().toString().substring(0, commander.getText().toString().lastIndexOf(' '));
				}
				
				else
			        comm=commander.getText().toString();
			 
				if(comm.equalsIgnoreCase("PenUp")&&(dis.getText().equals(" ")))
				{
					penUp=true;
					pend.setLabel("Pen is up");
				}
				else if(comm.equalsIgnoreCase("PenDown")&&(dis.getText().equals(" ")))
				{
					penUp=false;
				    pend.setLabel("Pen is down");
			}
				else
					textcommands(comm);
			ov.repaint();}
		}
			
		private static void textcommands(String comm) {
			
			int x=0;
			int y=0;
				if(comm.equalsIgnoreCase("Forward"))
					{
					try{
					x=Integer.parseInt(dis.getText());
					y=x;
					
					if(tur.getText().equals("  >"))
					{
						y=0;
					}else if(tur.getText().equals(" ^"))
					{y*=-1;
						x=0;
					}else if(tur.getText().equals("<"))
					{	y=0;
						x*=-1;
					}else if(tur.getText().equals(" v"))
					{x=0;
						
					}
					
					if(!penUp)
					{
						drawLine(col, posx,posy,posx+x,posy+y);save();saved=false;}
					    tur.setLocation(posx+x, posy+y);
					    posx+=x;
					    posy+=y;

					}
					catch(Exception m)
					{
						JOptionPane.showMessageDialog(null, "Please enter a valid distance in integer."); 
					}
					}
				else if(comm.equalsIgnoreCase("Backward"))
				{
				try{
				x=Integer.parseInt(dis.getText());
				y=x;
				
				if(tur.getText().equals("  >"))
				{	x*=-1;
					y=0;
				}else if(tur.getText().equals(" ^"))
				{
					x=0;
				}else if(tur.getText().equals("<"))
				{	y=0;
				}else if(tur.getText().equals(" v"))
				{x=0;
				 y*=-1;
				}
				
				
				// Additional features of the program such as square, circle, shortcuts.
				if(!penUp)
				{drawLine(col, posx,posy,posx+x,posy+y);;save();saved=false;}
				tur.setLocation(posx+x, posy+y);
				posx+=x;
				posy+=y;
				
				
				}
				catch(Exception m){JOptionPane.showMessageDialog(null, "Please enter a valid distance in integer."); }
				}
				else if(comm.equalsIgnoreCase("Square"))
					{
					
					System.out.println("Enter the width ");
					try{
					x=Integer.parseInt(dis.getText());

					if(!penUp)
					{drawLine(col, posx,posy,posx+x,posy);
					  posx+=x;
						rotateR();
						drawLine(col, posx,posy,posx,posy+x);
						posy+=x;
						rotateR();
						drawLine(col, posx,posy,posx-x,posy);
						posx-=x;
						rotateR();
						drawLine(col, posx,posy,posx,posy-x);
						posy-=x;
						save();
						rotateR();
						saved=false;}
					}catch(Exception m){JOptionPane.showMessageDialog(null, "Please enter a valid width!"); }
					
					}
				
				else if(comm.equalsIgnoreCase("Circle"))
				{System.out.println("Enter the desired width");
				try{
				x=Integer.parseInt(dis.getText());
					Graphics g = image.getGraphics();
					g.setColor(col);
					if(!penUp)
						{g.drawOval(posx-(x/2), posy-(x/2), x, x);save();saved=false;}
				}
				catch(Exception m){JOptionPane.showMessageDialog(null, "Please enter a valid radius!");}
				
				}
				
				
				else if(comm.equalsIgnoreCase("TurnRight")&&dis.getText().equals("90"))
					rotateR();
				else if(comm.equalsIgnoreCase("RT")&&dis.getText().equals("90"))
					rotateR();
				else if(comm.equalsIgnoreCase("RT")&&dis.getText().equals("180"))
				{rotateR(); rotateR();}
				else if(comm.equalsIgnoreCase("TurnRight")&&dis.getText().equals("180"))
					{rotateR(); rotateR();}
				else if(comm.equalsIgnoreCase("TurnLeft")&&dis.getText().equals("90"))
						rotateL();	
				else if(comm.equalsIgnoreCase("LT")&&dis.getText().equals("90"))
					rotateL();
				else if(comm.equalsIgnoreCase("TurnLeft")&&dis.getText().equals("180"))
				{rotateL();rotateL();}
				else if(comm.equalsIgnoreCase("LT")&&dis.getText().equals("180"))
				{rotateL();rotateL();}
				
				else if(comm.equalsIgnoreCase("RED"))
					col=Color.RED;
				else if(comm.equalsIgnoreCase("BLACK"))
					col=Color.BLACK;
				else if(comm.equalsIgnoreCase("GREEN"))
					col=Color.GREEN;
				else if(comm.equalsIgnoreCase("Reset"))
					{
					clear();
					}
				else
					JOptionPane.showMessageDialog(null, "Invalid command!\n Please check help for more informaition.");
		}
		
}

