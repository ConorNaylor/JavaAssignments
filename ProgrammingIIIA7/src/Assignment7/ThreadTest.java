package Assignment7;

//Conor Naylor 14316026

import java.util.concurrent.*;

public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException // Main method for this programme, creates a random number of producer and consumer threads
	{
		Queue q = new Queue(10); //Create an instance of the Queue class, passing in a maximum size of 50
		
		int noProducers = (int)(Math.random() * 25 + 1);
		int noConsumers = (int)(Math.random() * 25 + 1);
		
		System.out.println("This programme has created " + noProducers + " producers and " + noConsumers + " consumers."); //Prints number of producers and consumers made
		
		ExecutorService produce = Executors.newFixedThreadPool(100); // ES provides mechanisms for starting, executing and closing down of tasks expressed as Runnable(as the Comsumer and Producer are)
		ExecutorService consume = Executors.newFixedThreadPool(100); // Manages threads asynchronously
		
		for(int i = 0; i < noProducers; i++)
		{
			produce.submit(new Producer(q, "string number" + (i + 1))); //For the number of producers created, submit a runnable task to the ExecutorService produce
		}
		produce.shutdown();
		
		for(int j = 0; j < noConsumers; j++)
		{
			consume.submit(new Consumer(q)); ////For the number of consumers created, submit a runnable task to the ExecutorService consume
		}
	}
}