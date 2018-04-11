import java.util.Stack;

/**
 * A simple number sorter based on the use of two stacks.
 * @author c3496473
 *
 */
public class NumberSorter {
	/**
	 * Sorts the given array of integers into ascending order, then outputs to the console
	 * @param numbers
	 */

	void sort(int [] numbers) {
		/**
		 * The source stack, from which numbers are popped
		 */
		Stack<Integer> srcStack = new Stack<Integer>();
		/**
		 * The dest stack, to which the numbers are pushed.
		 */
		Stack<Integer> destStack = new Stack<Integer>();
		/**
		 * Add the initial array of numbers to the source stack.
		 */
		for(int number : numbers)
			srcStack.push(number);
		/**
		 * Iterate while the source stack still contains number.
		 */
		while(!srcStack.isEmpty()) {
			int next = srcStack.pop();
			/**
			 * Pop values from the dest stack which are greater than the next number, 
			 * and push these back onto the source stack
			 */
			while(!destStack.isEmpty() && destStack.peek() > next)
				srcStack.push(destStack.pop());
			/**
			 * Push the next number to the dest stack (whih now will be ordered).
			 */
			destStack.push(next);
		}
		/**
		 * Print the contents of the dest stack (which will now be ordered).
		 */
		System.out.println("Sorted: ");
		for(int number : destStack)
			System.out.println(number + " ");
		System.out.println();
	}
	
	

}
