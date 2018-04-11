
/**
 * An exception used to report invalid use of the {@link MyQueue} API.
 * 
 * @author mdixon
 */
@SuppressWarnings("serial")
public class MyQueueException extends Exception {

	/**
	 * Constructor.
	 * 
	 * @param msg the exception message.
	 */
	MyQueueException(String msg) {

		super(msg);
	}
}
