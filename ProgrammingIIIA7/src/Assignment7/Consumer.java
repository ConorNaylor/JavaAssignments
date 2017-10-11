package Assignment7;

//Conor Naylor 14316026

public class Consumer implements Runnable
{
	String value;
	protected Queue q = null;

	public Consumer(Queue q)
	{
		this.q = q;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				q.lock(); //Lock queue

				value = q.get(); //Removes element at head of queue
				//System.out.println("Removing " + value + " from queue. Queue size: " + q.size());
			}finally{}
		}
	}
}

