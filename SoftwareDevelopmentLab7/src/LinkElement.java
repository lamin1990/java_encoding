/**
 * 
 */
/**
 * Represents an element within the {@link MyLinkedQueue} class.
 * 
 * @author mdixon
 *
 * @param <T> the type of the element.
 */
class LinkElement<T> {

	/**
	 * The stored element.
	 */
	private final T theElement;
	
	/**
	 * The previous link element in the linked queue, can be null if no previous link element exists.
	 */
	private LinkElement<T> prevElement;
	
	/**
	 * Gets the stored element.
	 * 
	 * @return the stored element.
	 */
	public T getElement() {
		
		return theElement;
	}
		
	/**
	 * Gets the previous link element in the linked queue, can be null if no previous element exists.
	 * 
	 * @return the previous link element in the linked queue
	 */
	LinkElement<T> getPrevLinkElement() {
	
		return prevElement;
	}
	
	/**
	 * Sets the previous link element in the linked queue, can be null if no previous element exists.
	 * 
	 * @return the previous link element in the linked queue
	 */
	void setPrevLinkElement(LinkElement<T> prevElement) {
	
		this.prevElement = prevElement;
	}
	
	/**
	 * Constructor.
	 * 
	 * @param theElement the stored element.
	 */
	LinkElement(T theElement) {
		
		this.theElement = theElement;
	}
}
