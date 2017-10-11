package Assignment7;

//Conor Naylor 14316026

public class Producer implements Runnable
{
	private int counter=0;
	protected Queue q = null;
	private String value;
	private int size = 10;

	public Producer(Queue q, String value)
	{
	this.q =q;
	this.value = value;
	}
	
	@Override
	public void run()
	{
		while(counter < size) //Check if maximum number of strings have been added
		try
		{
			q.lock(); //Lock queue
			q.put(value); //Add value to queue
//			System.out.println("Putting " + value + " on queue. Queue size: " + q.size());
			Thread.sleep(100); //Wait 100ms
			counter++; 
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
