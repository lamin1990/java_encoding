import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

/**
 * Simple file chooser example, that allows a user to select and open a file.
 * 
 * See https://docs.oracle.com/javase/tutorial/uiswing/components/filechooser.html
 * 
 * @author mdixon
 *
 */
public class FileChooserExample {
 
	public static void main(String[] args) {


		final JFileChooser fc = new JFileChooser();

		// you can set the directory with the setCurrentDirectory method.
		int returnVal = fc.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			// User has selected to open the file.
			
			File file = fc.getSelectedFile();
			
			try {
				// Open the selected file
				BufferedReader reader = new BufferedReader(new FileReader(file));

				// Output the contents to the console.
				String nextLine = reader.readLine();

				while ( nextLine != null ) {

					System.out.println(nextLine);
					nextLine = reader.readLine();
				}
				
				reader.close();

			} catch (IOException e) {
				
				System.err.println("Error while reading the file");
			} 
		}

	}

}
