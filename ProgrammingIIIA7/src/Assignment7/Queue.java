package Assignment7;

//Conor Naylor 14316026

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Queue // This class represents the data structure used in the implementation
{
	
	private int size; 
	Queue(int size) // Constructor to specify the maximum size of the queue
	{
		this.size = size;
	}
	
	LinkedList<String> q = new LinkedList<String>(); //LinkedList used to hold strings which are produced and consumed 
	private final ReentrantLock lock = new ReentrantLock(); //used to lock array
	private Condition busy = lock.newCondition(); //Used to wait if array size has been reached
	
	
    String item;
    
    public synchronized void put(String value) throws InterruptedException 
    {
    	try 
    	{
    		while (q.size() == size) //Check if the actual q is equal to the max size specified
    		{
    			busy.await(); //If so, wait until space becomes free
    		}
    	q.add(value); //If there is space, add String value
		System.out.println("Putting " + value + " on the queue. Size: " + q.size()); //Print the string being added and the new size of the queue
    	}
		finally
    	{
    		busy.signalAll(); //Signal all threads to wake
    		lock.unlock();
    	}
    }

    @SuppressWarnings("finally")
	public synchronized String get()
    {
            try
            {
            	while(q.size() == 0)//if size of queue is 0, wait
                {
                busy.await();
                }
            item = q.remove(); //If size not 0, removes form head of queue
            System.out.println("Removing " + item + " from queue. Size: " + q.size()); //Print item being removed and new size of queue
            }
         finally
        {
        busy.signalAll(); // Signal all threads to wake
        lock.unlock();
        return item;
        }
    }
    
    public int size() //Returns int value of size of LL
    {
    	return q.size();
    }
    
    public void lock() //Locks queue
    {
    	lock.lock();
    }
}