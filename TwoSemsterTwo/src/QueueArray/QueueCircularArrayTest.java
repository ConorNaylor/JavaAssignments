package QueueArray;

import javax.swing.JOptionPane;

public class QueueCircularArrayTest {

		public static void main(String[] args) {
			// Create a Queue
			Queue q = new QueueCircularArray();
			
			System.out.println(q.getFront()); //Shows the front object in the Queue.
			
			// String placed onto queue:
			JOptionPane.showMessageDialog(null, "About to enqueue words onto queue: \nHow high can you jump?");
			q.enqueue("How");
			q.enqueue("high");
			q.enqueue("can");
			q.enqueue("you");
			q.enqueue("jump?");
			// These are the objects that I am dequeuing 
			JOptionPane.showMessageDialog(null, "About to dequeue the words ...");
			while(! q.isEmpty()) {
 				String word = (String)q.dequeue(); // Note: have to cast Objects popped to String
				JOptionPane.showMessageDialog(null, "Word dequeued: " + word);
			}
			System.exit(0);
		}

	}

