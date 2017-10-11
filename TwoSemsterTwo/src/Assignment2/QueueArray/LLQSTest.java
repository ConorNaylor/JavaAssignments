package Assignment2.QueueArray;

import java.util.Scanner;

public class LLQSTest {				//This does the same function as AQSTest class but with a linked list implementation
	
	LLQueue LLQ = new LLQueue();
	Scanner scan = new Scanner(System.in);
	
	public void calculateTimeLLQ(){
	
	System.out.print("Now enter number of string to be enqueued with linked list implementation: ");
	
	int b = scan.nextInt();
	String[] array2 = new String[b];
	
	for(int j = 0; j < b; j++ ){
		String st = "" + j;
		array2[j] = st; 
	}
	
	long startTimeLLQEQ = System.nanoTime();
	
	for(int l = 0; l < b; l++){
		LLQ.enqueue(array2[l]);
	}
	
	long stopTimeLLQEQ = System.nanoTime();
	
	long startTimeLLQDQ = System.nanoTime();
	
	for(int l = 0; l < b; l++){
		LLQ.dequeue();
	}
	
	long stopTimeLLQDQ = System.nanoTime();
	
	long elapsedTimeLLQEQ = stopTimeLLQEQ - startTimeLLQEQ;
	long elapsedTimeLLQDQ = stopTimeLLQDQ - startTimeLLQDQ;
	
     System.out.println("Time taken to enqueue items with linked list implementation: " + elapsedTimeLLQEQ + " nano seconds");
     System.out.println("Time taken to dequeue items with linked list implementation: " + elapsedTimeLLQDQ + " nano seconds");
     
}

}
