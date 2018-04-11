import java.util.ArrayList;
import java.util.List;

public class Logger {

	int errCount = 0;
	
	int warnCount = 0;
	
	int infoCount = 0;
	
	List<String> messages = new ArrayList<String>();
	
	
	void logError(String message) {
		
		messages.add("ERROR: " + message);
		errCount++;
	}
	
	void logWarning(String message) {
		
		messages.add("WARNING: " + message);
		warnCount++;
	}
	
	void logInformation(String message) {
		
		messages.add("INFO: " + message);
		infoCount++;
	}
	
	
	public final static void main(String args []) {
		
		// 1. Add comments that describes the class, along with each attribute and operation.
		
		// 2. Add appropriate 'private' and 'public' modifiers to each of the attributes and methods.
		
		// 3. Within this main method, create a new instance of the Logger class (called 'log')
		
		// 4. Call each of the available methods several times on the 'log' instance.
		
		// 5. Add a method called displayLog(), that outputs all of the messages stored within the log. hint: use a for loop.
		
		// 6. Add a method called displayStats(), that outputs information about how many errors, warnings and information messages are stored.
		
		// 7. Add code to this main methods that calls the newly added methods and shows that they work as expected.
	}
	
}
