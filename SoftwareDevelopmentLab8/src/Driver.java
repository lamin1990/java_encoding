/**
 * 
 * Driver class.
 * 
 * @author mdixon
 * 
 */
public class Driver {

	public static void main(String[] args) {

		MyQueue<String> q1 = new MyListQueue<String>();

		System.out.println("Queue contents");

		q1.queue("1");
		q1.queue("2");
		q1.queue("3");

		while (!q1.isEmpty()) {

			System.out.println("Dequeued " + q1.dequeue());

		}

		////////////////////////////////////////////////////////
		
		MyStack<String> s1 = new MyListStack<String>();
		
		System.out.println("Stack contents");

		s1.push("1");
		s1.push("2");
		s1.push("3");

		while (!s1.isEmpty()) {

			System.out.println("Popped " + s1.pop());

		}
		
	}

}