import java.util.LinkedList;
import java.util.List;

/**
 * Implements the {@link MyQueue} interface using an underlying {@link LinkedList}
 * 
 * @author mdixon
 * 
 */
public class MyListQueue<T> implements MyQueue<T> {

	/**
	 * The underlying LinkedList used to manage the stack.
	 */
	private List<T> list = new LinkedList<T>();



	@Override
	public void queue(T element) {
		
		list.add(element);
		
	}


	@Override
	public T dequeue() {
		
		if ( !list.isEmpty() )
			return list.remove(0);
		
		return null;
	}

	@Override
	public T front() {
		
		if ( !list.isEmpty() )
			return list.get(0);
		
		return null;
	}
	
	
	@Override
	public boolean isEmpty() {

		return list.isEmpty();
	}

}
