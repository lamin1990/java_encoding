
/**
 * A simple queue interface
 * 
 * @author mdixon
 * @param <T> the type of elements on the queue.
 */
public interface MyQueue<T> {

	/**
	 * Add an element onto the queue
	 * 
	 * @param element the element to be added to the queue.
	 */
	void queue(T element);
	
	/**
	 * Extracts the element at the front of the queue.
	 * 
	 * @return  the element taken from the queue
	 * @throws MyQueueException if the queue was empty.
	 */
	T dequeue() throws MyQueueException;
	
	/**
	 * Gets the element at the front of the queue, without removing it.
	 * 
	 * @return the element at the front of the queue
	 * @throws MyQueueException if the queue was empty.
	 */
	T front() throws MyQueueException;

	
	/**
	 * Tests if the queue is empty.
	 * 
	 * @return true if the queue is empty
	 */
	boolean isEmpty();
	
}