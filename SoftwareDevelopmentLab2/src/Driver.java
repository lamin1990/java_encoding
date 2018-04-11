import java.util.Scanner;
/**
 * 
 */

/**
 * @author user
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a sentence : ");
		String sentence = s.nextLine();
		
		//Create an instance, ok to use Counter as the type since the WordProcessor is a type of counter.
		Counter wp = new WordProcessor();
		System.out.println("---------------------------");
		
		System.out.println("Letters : " + wp.countLetters(sentence));
		System.out.println("Length : " + wp.getLength(sentence));
		System.out.println("Words : " + wp.countWords(sentence));
		System.out.println();
		
		// For Q2
		
		//Need to use WordProcessor as type, since calling methods defined in the class itself.
		WordProcessor wp2 = new WordProcessor();
		wp2.setText("this is some default text");
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Letters : " + wp2.countLetters(null));
		System.out.println("Length : " + wp2.getLength(null));
		System.out.println("Words : " + wp2.countWords(null));
		System.out.println();
		
		s.close();

	}

}
