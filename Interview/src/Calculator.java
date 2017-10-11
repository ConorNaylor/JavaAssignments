import java.util.ArrayList;

public class Calculator
{

	private static long id = 1000;
	
	public Calculator()
	{
		createID();
	}
	
	private static void createID()
	{
		System.out.println(id ++);
	}
	
	
	ArrayList array1 = new ArrayList();
	float avg;
	float total;
	
	public void getAverage(int number)
	{
		array1.add(number);
		total += number;
		avg = (total / array1.size());
		System.out.println("Number passed in:" + number + ".  Avg of all:"  + avg);
	}

}