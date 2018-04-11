/**
 * 
 * Driver class.
 * 
 * @author mdixon
 * 
 */
public class Driver {

	public static void main(String[] args) {

		MyQueue<String> q1 = new MyLinkedQueue<String>();

		System.out.println("Queue contents");

		q1.queue("1");
		q1.queue("2");
		q1.queue("3");

		try {
			while (!q1.isEmpty()) {

				System.out.println("Dequeued " + q1.dequeue());

			}
			
			q1.dequeue();	// should throw exception.
			
			System.out.println("Dequeued has not thrown exception?");
			
		} catch (MyQueueException e) {

		}

	}

}