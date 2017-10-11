package assignment4;

//Conor Naylor 14316026

import java.util.*;

public class RatTest
{

	public static void main(String[] args) throws IllegalInputException
	{
		ArrayList<Rational> rat = new ArrayList<Rational>(); //List of Rational values
		Rational a = new Rational(2,1);
		Rational b = new Rational(12,2);
		Rational c = new Rational(5,7);
		Rational d = new Rational(4,9);
		Rational e = new Rational(9,1);
		Rational f = new Rational(53,17);
		Rational g = new Rational(46,32);
		Rational h = new Rational(1,4);
		Rational i = new Rational(10,1);
		Rational j = new Rational(16,8);

		rat.add(a);
		rat.add(b);
		rat.add(c);
		rat.add(d);
		rat.add(e);
		rat.add(f);
		rat.add(g);
		rat.add(h);
		rat.add(i);
		rat.add(j);

		RationalOrder order = new RationalOrder();										//Instantiates the comparator class
		System.out.println("Unsorted arraylist as entered:		      " + rat);
		Collections.shuffle(rat);														//Shuffles rat
		//Collections.sort(list, c);
		System.out.println("Shuffled arraylist:                           " + rat );
		ArrayList<Rational> sorted = sort(rat, order);								    //Passes the arraylist 'sorted' into sort()
		System.out.println("Sorted using my own insertion sort algorithm: " + sorted);
		
		Scanner sc = new Scanner(System.in);											//Used to input value
		System.out.print("Please enter rational number to be searched for. \nNumerator:");
		int num = sc.nextInt();															//Passed int from input to num
		System.out.print("Denominator:");
		int denom = sc.nextInt();
		Rational key = new Rational(num,denom);											//Creates key - rational number we are searching for
		if(binarySearch(rat, key) >= 0)
		{
		System.out.println("\nThe rational number " + key + " is in the arraylist.");
		}
		else
		{
		System.out.println("\nThe rational number " + key + " is not in the arraylist.");
		}
	}

	public static ArrayList<Rational> sort(ArrayList<Rational> list, RationalOrder order) 	 //Sorting method
	{
		ArrayList<Rational> sorted = new ArrayList<Rational>();			 //Will store sorted array

		for (int i = 0; i < list.size(); i++) 							 //To iterate through 'list'
		{		
			Rational value = list.get(i);								 //Passed the object at index i into the value variable

			int position = sorted.size(); 								 //Default place to add to list

			for (int j = 0 ; j < sorted.size(); j++)						 //Nested loop
			{				 
				int comparison = order.compare(sorted.get(j), value);	   	 //Compares the unsorted list 'value' at index i against the sorted list at index j using my class RationalOrder
				if(comparison > 0 || comparison == 0)				 
				{
					position = j;									     //Place the position pointer at the element j in the array if 'value' is less than or equal to the Jth element in the sorted list 
					break;
				}
			}
			sorted.add(position, value);								 //Adds value at the index position
		}
		return sorted;
	}
	
	public static int binarySearch(ArrayList<Rational> list, Rational key){
	
	int index; //Used to return the value of the search
	
	RationalOrder order = new RationalOrder();
	
	index = Collections.binarySearch(list, key, order); //Negative number if key is not in arraylist
	
	return index;
	}
}	
