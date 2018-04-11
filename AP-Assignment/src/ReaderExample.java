import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Shows how to read and examine a text file for a certain pattern followed by some data.
 * 
 * Place files to be read in the top level of the project (unless you specify an absolute path when prompted).
 * 
 * @author mdixon
 *
 */
public class ReaderExample {

	public final static void main(String [] args) {
		
		// Prompt the user for a filename, then read via the KB
		System.out.println("Enter filename: ");
		
		Scanner s1 = new Scanner(System.in);
		
		String filename = s1.nextLine();
		
		try {
			// Open the named file
			BufferedReader r = new BufferedReader(new FileReader(filename));
			
			// Read the next line from the file
			String line = r.readLine();
			
			// Check that the line exists, and that is starts with the required pattern
			if ( line != null && line.startsWith("Title:") ) {
				
				line = line.substring(6);	// strip the characters that identify the prefix just found.
				
				System.out.println("Title is " + line);
				
				// since everything was okay, now try to read the next expected line.
				// TODO
			}
			else {
				// The line does not start with what was expected, so show an error.
				System.err.println("Missing 'Title:' entry");
			}
			
			// close the file once all data has been read.
			r.close();
			
		} catch (FileNotFoundException e) {
			// the named file could not be found
			System.err.println("File not found : " + filename);
			
		} catch (IOException e) {
			// IO error while reading from the file.
			System.err.println("Error while reading from file : " + filename);
		}
		
		s1.close();
	
	}
	
}
