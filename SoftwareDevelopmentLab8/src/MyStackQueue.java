import java.util.LinkedList;
import java.util.List;


/**
 * Implements the {@link MyQueue} and {@link MyStack} interfaces using an underlying {@link LinkedList}.
 * 
 * @author mdixon
 */
public class MyStackQueue<T> implements MyQueue<T>, MyStack<T> {

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
	public void push(T element) {
		
		list.add(element);
	}

	@Override
	public T pop() {
		
		if ( !list.isEmpty() )
			return list.remove(list.size()-1);
		
		return null;
	}

	@Override
	public T peek() {
		
		if ( !list.isEmpty() )
			return list.get(list.size()-1);
		
		return null;
	}
	
	
	@Override
	public boolean isEmpty() {

		return list.isEmpty();
	}

}