/**
 * Implements the {@link MyQueue} interface using an underlying linked list.
 * 
 * @author mdixon
 * 
 */
public class MyLinkedQueue<T> implements MyQueue<T> {

	/**
	 * The linked element at the head of the queue (first element to join)
	 */
	private LinkElement<T> head;

	/**
	 * The linked element at the end of the queue (last element to join)
	 */
	private LinkElement<T> last;

	@Override
	public void queue(T element) {

		// create a new LinkElement to wrap the queued element.
		LinkElement<T> linkElement = new LinkElement<T>(element);

		if ( last != null )
			last.setPrevLinkElement(linkElement);	// ensure previous last element refers to new last element.
		
		last = linkElement;
		
		if (head == null)
			head = linkElement;	// the first element on the queue, so becomes the head.
	}

	@Override
	public T dequeue() throws MyQueueException {

		if ( head != null )	{
			// Gets the current element from the head of the queue.
			T element = head.getElement();
			
			// remove the link element from the head of the queue, by pointing to the prev element.
			head = head.getPrevLinkElement();
			
			if ( head == null )
				last = null;	// just removed last element from the queue.
			
			return element;
		}
		
		throw new MyQueueException("Attempt to dequeue from an empty queue");
	}

	@Override
	public T front() throws MyQueueException {

		if (head != null)
			return head.getElement();

		throw new MyQueueException("Attempt to get the front of an empty queue");
	}

	@Override
	public boolean isEmpty() {

		return (head == null);
	}

}