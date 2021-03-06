package Assignment2.QueueArray;

public class LLQueueTest {
	
	public void test(){
		
		LLQueue LLQ = new LLQueue(); //Create a new linked list to test the LLQueue class.
		
		LLQ.enqueue(1);
		LLQ.enqueue(2);
		LLQ.enqueue(3);
		LLQ.enqueue(4);
		LLQ.enqueue(5);
		
		LLQ.rear();
		System.out.println(LLQ.display());
		
		LLQ.dequeue();
		LLQ.dequeue();
		System.out.println(LLQ.isEmpty());
		LLQ.front();
		System.out.println(LLQ.display());
		
		LLQ.dequeue();
		LLQ.dequeue();
		LLQ.front();
		System.out.println(LLQ.display());
		
		LLQ.dequeue();
		System.out.println(LLQ.isEmpty());
		
		
	}

}
