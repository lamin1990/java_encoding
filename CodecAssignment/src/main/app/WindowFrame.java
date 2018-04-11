package main.app;
import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author user
 *
 */
public class WindowFrame {

	/** 
	 * Main program, creates a simple frame with a menu bar.
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *Create and set up the window 
		 */
		JFrame frame = new JFrame("Welcome to my codex graphic user interface");
		
		/**
		 * Exit out of program when close
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * 
		 */
		/**
		 * Create and setup a content pane
		 */
		
		String CodecSecretKey = "123456"; 
		
		ICodec codec =  new Codec(CodecSecretKey);
		IHasher hasher = new Hasher();
		
//		String data = "Hello World!";
//		String encoded = codec.Encode(data);
//		String decoded = codec.Decode(encoded);
//		
//		System.out.println("Original: " + data);
//		System.out.println("Encoded: " + encoded);
//		System.out.println("Decoded: " + decoded);
		
		WindowSplitPane myPane = new WindowSplitPane(codec, hasher);
		
		WindowMenu menu = new WindowMenu(myPane);
		frame.setJMenuBar(menu.setupMenu());
		
		//WindowSplitPane pane = new WindowSplitPane();
		frame.getContentPane().add(myPane.setupContent(),BorderLayout.CENTER);
		//frame.getContentPane().add(splitpane, BorderLayout.CENTER);
		/**
		 * Set the size of the frame
		 */
		frame.setSize(600, 400);
		
		/**
		 * Making frame visible
		 */
		frame.setVisible(true);

	}

}
