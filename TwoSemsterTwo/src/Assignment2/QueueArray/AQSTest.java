package Assignment2.QueueArray;

import java.util.Scanner;

public class AQSTest {
	
	ArrayQueue AQ = new ArrayQueue();	//Initiates an ArrayQueue
	Scanner scanner = new Scanner(System.in);
	
	public void calculateTimeAQ(){
	
	System.out.print("Enter number of strings to be enqueued with array implementation: ");
	
	int a = scanner.nextInt();			//Allows user to specify the number of string to be inputed into array.
	String[] array = new String[a];		//Initiates the array of strings
	
	for(int i = 0; i < a; i++ ){		//This method converts the ints to strings and places them in the array
		String s = "" + i;				//Cast ints to string data type
		array[i] = s; 
	}
		
	long startTimeAQEQ = System.nanoTime();		//Starts the clock to measure the time taken to enqueue
	
	for(int k = 0; k < a; k++){					//Enqueues the k'th element of the array into the queue. 
		AQ.enqueue(array[k]);
	}
	
	long stopTimeAQEQ = System.nanoTime();		//Stops the clock
	
	long startTimeAQDQ = System.nanoTime();		//Starts to clock to dequeue.
	
	for(int l = 0; l < a; l++){					//Dequeues all the elements of the array.
		AQ.dequeue();
	}
	
	long stopTimeAQDQ = System.nanoTime();
	
	long elapsedTimeAQEQ = stopTimeAQEQ - startTimeAQEQ;
	long elapsedTimeAQDQ = stopTimeAQDQ - startTimeAQDQ;
	
	System.out.println("Time taken to enqueue items with array implementation: " + elapsedTimeAQEQ + " nano seconds");
    System.out.println("Time taken to dequeue items with array implementation: " + elapsedTimeAQDQ + " nano seconds");
	}
}