package QueueArray;
import javax.swing.JOptionPane;

public class QueueCircularArray implements Queue  {
	
	protected Object Q[];						// Array used to represent queue
	protected int rear = 0;						// Rear of queue
	protected int front = 0;					// Front of queue
	protected int size = 0; 					// This is the actual capacity
	public static final int CAPACITY = 1000;	// This is the default array capacity
	 
	 public QueueCircularArray(){
	        this(CAPACITY);
	    }

	public QueueCircularArray(int cap) {
		 size = (cap > 0) ? cap : CAPACITY ;
	     Q = new Object[size];
	}

	@Override
	public void enqueue(Object n) {  // This constructor takes the argument in from the Test class in the form of an object. 
		if(isFull()){
			JOptionPane.showMessageDialog(null, "Can't enqueue object, queue is full.");
			return;
		}
		Q[rear] = n;			   	//Set the rear of the queue to point to the object n
		rear = (rear + 1) % size; 	//Increment the rear pointer and mod it against the size of the queue. 
	}

	@Override
	public Object dequeue() {	// This method sets the queue front pointer to null and increments the pointer.
		Object i;
		if(isEmpty()){
		return null;
		}
		else{
			i = Q[front];		// I is equal to the front of the queue
			Q[front] = null;	// Set the front of the queue to null
			front = (front + 1) % size; //Increment the pointer: front.
		}
		return i;
		
	}

	@Override
	public boolean isEmpty() { //Check if the queue is empty.
		return(front == rear ) ? true : false;
	}

	@Override
	public boolean isFull() {	//Check if the queue is full.
		return front == (rear + 1) % size;
	}
	
	public Object getFront(){	//Return the value of the front of the queue
		if(! isEmpty())
			return Q[front];
		else return null;
	}


}

