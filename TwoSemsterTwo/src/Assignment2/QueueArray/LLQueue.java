package Assignment2.QueueArray;

public class LLQueue {

	//This class bring together both the Queue and linked list
	
	SLinkedList SLink = new SLinkedList();
	
	
	public void enqueue(Object n) {
		SLink.gotoTail(); 			//Places the pointer to the tail node.
		SLink.insertNext(n);		//Inserts the object n into the tail node.
	}

	
	public void dequeue() {			//Places pointer at head of queue and removes head.
		SLink.gotoHead();			//Head
		SLink.deleteHead();			//Deletes Head
	}

	public boolean isEmpty() {		//Checks if the list is empty.
		return SLink.isEmpty();
	}

	public Object front() {			//Places the pointer to the front of the linked list.
		return SLink.gotoHead();
	}
	
	public void rear(){				//Places the pointer to the tail of the list.
		SLink.gotoTail();
	}


	public void insertNext(Object i){ //Inserts the object into the list.
		SLink.insertNext(i);
	}


	public void deleteNext() {
		SLink.deleteNext();
	}
	
	public Object display(){
		return SLink.getCurr();
	}
}
