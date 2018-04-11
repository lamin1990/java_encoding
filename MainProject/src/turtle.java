import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class turtle extends GraphicsPanels {

	
	public static void main(String[]args)
	{File a=new File("temp");
	a.mkdir();
	
	
		final JFrame n=new JFrame();
		Container content = n.getContentPane();

	    // set layout on content pane
	    content.setLayout(new BorderLayout());
		n.setSize(700,700);
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		n.setResizable(true);
		tur.setFont(new Font("Tahoma", Font.BOLD, 22));
		tur.setBounds(250, 250, 30, 40);
		tur.setVisible(true);
		//tur.setAlignment((int) CENTER_ALIGNMENT);
		
		WindowAdapter adapter = new WindowAdapter() {
	      
	        @Override
	        public void windowClosing(WindowEvent e) {

	        	dall(1);
	        }
	    };
	n.addWindowListener(adapter);
	
	
	JMenuBar men = new JMenuBar();
	 JMenu file=new JMenu("File");
	// JMenuItem New = new JMenuItem("New");
	 JMenuItem New = new JMenuItem(new AbstractAction("New") {
		    public void actionPerformed(ActionEvent e) {
		        // Button pressed logic goes here
		    	clear();
		    }
		});
	 
	 
	    JMenuItem Save = new JMenuItem(new AbstractAction("Save") {
		    public void actionPerformed(ActionEvent e) {
		    	store();
		    	saved=true;
		    }
		});
	    
	    JMenuItem exit = new JMenuItem(new AbstractAction("Exit") {
		    public void actionPerformed(ActionEvent e) {
		        // Button pressed logic goes here
		    	if(saved)
		    	System.exit(0);
		    	else
		    	{
		    		 int dec = JOptionPane.showConfirmDialog(null, "Do you want to save before exiting?", "Unsaved image", JOptionPane.YES_NO_CANCEL_OPTION);
		    	        if (dec == JOptionPane.YES_OPTION) {
		    	        	store();
		    	        	 System.exit(0);
		    	        }
		    	        else if (dec == JOptionPane.NO_OPTION){
		    	           System.exit(0);
		    	        }else
		    	        {}
		    		    		
		    	}
		    }
		});
	    
	    	    
	    JMenuItem load = new JMenuItem(new AbstractAction("Load") {
		    public void actionPerformed(ActionEvent e) {

		    	 FileDialog dialog = new FileDialog((Frame)null, "Select File to Open");
		    	   
		    	 	dialog.setMode(FileDialog.LOAD);
		    	 	
		    	    dialog.setVisible(true);
		    	    String file = dialog.getDirectory()+dialog.getFile();
		    	   
		    	    
		    	    try {if(!(dialog.getFile()==null))
		    	    	if(dialog.getFile().endsWith(".png"))
						{ System.out.println(file + " loading image.");
		    	    		loader(file);
		    	    		n.repaint();
		    	    		
						}
		    	    	else
		    	    		JOptionPane.showMessageDialog(null, "Error!\n Please select an image.");
					} catch (IOException e1) {

						e1.printStackTrace();
					}
		    	
		    }
		});
	    
	 JMenu help=new JMenu("Help");
	 JMenuItem about = new JMenuItem(new AbstractAction("About") 
	 
	 {
		 
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null, 
		    			 "Guide:\n"
		    			+ "• File contains:\n"
		    			+ "  - New: to clear canavas.\n"
		    			+ "  - Save: to save the current image.\n"
		    			+ "  - Load: to load a previously saved drawing.\n"
		    			+ "  - Exit: to exit the program.\n\n"
		    			+ "• Help contains:\n"
		    			+ "  - About: to show command dialogs.\n"
		    			);
		    	
		    	JOptionPane.showMessageDialog(null, 
		    			 "The following commands are to be typed in the text field:\n"
		 		    	+ "• PenUp\n"
				    	+ "  - This will lift the pen from the canvas.\n"
				    	+ "• PenDown\n"
				    	+ "  - This will place the pen on the canvas.\n"
		    			+ "--------------------------------\n"
		    			+ "• FORWARD <distance>\n"
		    			+ "  - This will move the turtle forward by the desired <distance>.\n"
		    			+ "• BACK <distance>\n"
		    			+ "  - This will move the turtle backwards to the desired <distance>.\n"
		    			+ "--------------------------------\n"
		    			+ "• TurnLeft 90 or TurnLeft 180\n"
		    			+ "  - This will rotate the turtle anti clockwise by the chosen degrees.\n"
		    			+ "    Use [LT] for shortcut\n"
		    			+ "• TurnRight 90 or TurnRight 180\n"
		    			+ "  - This will rotate the turtle clockwise by the chosen degrees.\n"
		    			+ "    Use [RT] for shortcut\n"
		    			+ "--------------------------------\n"
		    			+ "• CIRCLE <radius>.\n"
		    			+ "  - To draw a circle with the desired radius.\n"
		    			+ "• SQUARE <width>.\n"
		    			+ "  - To draw a square with the desired parameters.\n"
		    			+ "--------------------------------\n"
		    			+ "• RESET\n" 
		    			+ "  - To clear the canvas and return the \n    "
		    			+ "turtle to its initial starting point.\n"
		    			+ "--------------------------------\n"
		    			+ "• GREEN : BLACK : RED\n"
		    			+ "  - Sets the output pen colour by given choices.\n"
		    			+ "--------------------------------\n"
		    			+ "Note <distance> ,<radius> and <width>\n"
		    			+ "are integers, e.g. 100."
		    			);
		    	
		    	
		    }
		});
	// file.setMnemonic('f');
	  New.setAccelerator(KeyStroke.getKeyStroke("control N"));
	  load.setAccelerator(KeyStroke.getKeyStroke("control L"));
	  exit.setAccelerator(KeyStroke.getKeyStroke("control E"));
	  about.setAccelerator(KeyStroke.getKeyStroke("control H"));
	  Save.setAccelerator(KeyStroke.getKeyStroke("control S"));
	 
	 
	 men.add(file);
	 men.add(help);
	 men.setBorder(new BevelBorder(BevelBorder.RAISED));
	  file.add(New);
	  file.add(Save);
	  file.add(load);
	  file.add(exit);
	  help.add(about);
	  
	  

	  JLayeredPane lp = n.getLayeredPane(); 
	  lp.add(tur, Integer.valueOf(2));
		//final GraphicsPanels ov=new GraphicsPanels();
	   
		commander.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
					getcommands();
			}
		});
		commander.setBounds(70, 540, 200, 20);
		
dis.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent arg0) {
				
			}
			
			public void keyReleased(KeyEvent arg0) {
				
			}
			
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
					getcommands();
			}
		});
		dis.setBounds(70, 570, 50, 20);
		dis.setVisible(false);
		lcom.setBounds(0, 540, 70, 20);
		ov.add(lcom);
		ov.add(dis);
		ov.add(commander);
		 content.add(ov);
		 

		 
	n.getContentPane().add(men,BorderLayout.NORTH);

		n.setTitle("Turtle House");

		
		Button button = new Button("Clear");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clear();
				ov.repaint();
				try {
					save();
					dall(c+1);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		button.setBounds(0, 500, 79, 40);
		ov.add(button);
		
		
		try {
			save();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		final Button button2 = new Button("Square Off");
		pend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(penUp)
					{penUp=false; pend.setLabel("Pen is down");
					square=false;button2.setLabel("Square off");}
					else
						{penUp=true; pend.setLabel("Pen is up");
						try {
							save();
							dall(c+1);
						} catch (IOException e) {
		
							e.printStackTrace();
						}}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(square)
					{square=false; button2.setLabel("Square off");
					}
					else
						{square=true; button2.setLabel("Square on");
						penUp=true;pend.setLabel("Pen is up");}
			}
		});
		
		button2.setBounds(79, 500, 79, 40);
		ov.add(button2);
		
		pend.setBounds(218, 500, 79, 40);
		ov.add(pend);
		
		
		
		final Button lod = new Button("Undo");
		final Button sav = new Button("Redo");
		sav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				
					redo();
					ov.repaint();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		sav.setBounds(376, 500, 79, 40);
		ov.add(sav);
		
		
		
		lod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					undo();
					ov.repaint();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		lod.setBounds(297, 500, 79, 40);
		ov.add(lod);

		
		final Button button3 = new Button("");
		button3.setBackground(Color.GREEN);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				col=Color.GREEN;
				
			}
		});
		button3.setBounds(158, 500, 20, 40);
		ov.add(button3);
		
		final Button BLACK = new Button("");
		BLACK.setBackground(Color.BLACK);
		BLACK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				col=Color.BLACK;
				
			}
		});
		BLACK.setBounds(178, 500, 20, 40);
		ov.add(BLACK);
		
		final Button RED = new Button("");
		RED.setBackground(Color.RED);
		RED.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				col=Color.RED;
				
			}
		});
		RED.setBounds(198, 500, 20, 40);
		ov.add(RED);
	
		
		ov.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
				if(arg0.getX()<=500&&arg0.getY()<=500)
				try {
					//System.out.println(arg0.getComponent().toString());
					save();
					dall(c+1);
					saved=false;

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}else if(actioner)
					try {
						
						save();
						dall(c+1);
						actioner=false;
						saved=false;
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
			@SuppressWarnings("static-access")
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				actioner=true;
				oldx=arg0.getX();
				oldy=arg0.getY();
				if(square&&arg0.getX()<=500&&arg0.getY()<=500)
					ov.drawLine(col,arg0.getX()-50, arg0.getY()-50, 100, 100);
		
				saved=false;
				ov.repaint();
				
			}
			
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		ov.addMouseMotionListener(new MouseMotionListener() {
			
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
				/*if(!penUp&&!square&&arg0.getX()<=500&&arg0.getY()<=500)
				{ov.drawLine(col, oldx, oldy, arg0.getX(), arg0.getY());
				saved=false;}
				ov.repaint();
				
				oldx=arg0.getX();
				oldy=arg0.getY();*/
			}
			
			public void mouseDragged(MouseEvent arg0) {
				if(!square&&arg0.getX()<=500&&arg0.getY()<=500)
				ov.drawLine(col, oldx, oldy, arg0.getX(), arg0.getY());
				saved=false;
				ov.repaint();
				oldx=arg0.getX();
				oldy=arg0.getY();
			}
		});
		n.setVisible(true);

		
		while(true)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("write command");
			String comm=s.nextLine();
			if(comm.equals("PenUp"))
			{penUp=true;
				pend.setLabel("Pen is up");
			}
			else if(comm.equals("PenDown"))
			{penUp=false;
			pend.setLabel("Pen is down");
		}
			else
		commands(comm);
		ov.repaint();
		}
			
	}

}
