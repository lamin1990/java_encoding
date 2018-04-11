import java.util.ArrayList;
import java.util.List;


/**
 * Implements the {@link MyStack} interface using an underlying {@link ArrayList}
 * 
 * @author mdixon
 */
public class MyListStack<T> implements MyStack<T> {

	/**
	 * The underlying ArrayList used to manage the stack.
	 */
	private List<T> list = new ArrayList<T>();

		
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