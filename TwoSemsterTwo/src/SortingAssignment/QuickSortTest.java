package SortingAssignment;

import java.util.Comparator;
import java.util.Random;

public class QuickSortTest {
	
	public static StopWatch clock = new StopWatch();
	public static int moves = -1;
	public static int comparisons = 0;

	// Main method to test QuickSort
	public static void main(String[] args)
	{
		
		String arr[] = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
		String arr1[] = {"9", "8", "6", "7", "4", "3", "5", "2", "0", "1", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
		
		clock.Start();
		System.out.println("For hard coded unsorted arrays: ");
		quickSort(arr, new StringComparator());
		clock.reset();
		
		System.out.println();
		
		clock.Start();
		quickSort(arr1, new StringComparator());
		clock.reset();
		
		System.out.println("\n");
		
		System.out.println("For the above arrays already sorted:");
		clock.Start();
		quickSort(arr, new StringComparator());
		clock.reset();
		
		System.out.println();
		
		clock.Start();
		quickSort(arr1, new StringComparator());
		clock.reset();
		
		System.out.println("\n");
		
		System.out.println("For random unsorted arrays: ");
		clock.Start();
		String arr2[] = randArray(10);
		quickSort(arr2, new StringComparator());
		System.out.println();
		clock.reset();
		clock.Start();
		quickSort(arr2, new StringComparator());
		clock.reset();
		
		System.out.println();
		
		clock.Start();
		String arr3[] = randArray(50);
		quickSort(arr3, new StringComparator());
		System.out.println();
		clock.reset();
		clock.Start();
		quickSort(arr3, new StringComparator());
		clock.reset();
		
		System.out.println();
		
		clock.Start();
		String arr4[] = randArray(100);
		quickSort(arr4, new StringComparator());
		System.out.println();
		clock.reset();
		clock.Start();
		quickSort(arr4, new StringComparator());
		clock.reset();
		
System.out.println();
		
		clock.Start();
		String arr5[] = randArray(200);
		quickSort(arr5, new StringComparator());
		System.out.println();
		clock.reset();
		clock.Start();
		quickSort(arr5, new StringComparator());
		clock.reset();
		
System.out.println();
		
		clock.Start();
		String arr6[] = randArray(500);
		quickSort(arr6, new StringComparator());
		System.out.println();
		clock.reset();
		clock.Start();
		quickSort(arr6, new StringComparator());
		clock.reset();
		
System.out.println();
		
		clock.Start();
		String arr7[] = randArray(1000);
		quickSort(arr7, new StringComparator());
		System.out.println();
		clock.reset();
		clock.Start();
		quickSort(arr7, new StringComparator());
		clock.reset();
		
System.out.println();
		
		clock.Start();
		String arr8[] = randArray(2000);
		quickSort(arr8, new StringComparator());
		System.out.println();
		clock.reset();
		clock.Start();
		quickSort(arr8, new StringComparator());
		clock.reset();
		
	}
	    	
		public static Object[] quickSort (Object[] arr, Comparator c) {
			
			moves = -1;
			comparisons = 0;
			
		    if (arr.length < 2) return null; // the array is already sorted in this case
		    quickSortStep(arr, c, 0, arr.length-1); // call the recursive sort method
		    
			System.out.print("Quicksort array sorted: ");
			for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " " );
			}
			System.out.print(" Size of Array: " + arr.length + " Moves: " + moves + " Comparisons: " + comparisons + " Time taken: " + clock.elapsedTime() + " ms" );
	
		    return arr;
		}
		  
		/** QuickSortStep method: 
		  * Method called by QuickSort(), which sorts the elements of array s between
		  * indices leftBound and rightBound, using a recursive, in-place,
		  * implementation of the quick-sort algorithm.
		 **/
		private static void quickSortStep (Object[] s, Comparator c,
		                              int leftBound, int rightBound ) 
		{
		   if (leftBound >= rightBound) return; // the indices have crossed
		   Object temp;  // temp object used for swapping
		    
		   // Set the pivot to be the last element
		   Object pivotValue = s[rightBound]; //modification here as pivot value chosen is a random value between 0 and rightbound value
//		   Object pivotValue = s[1];
//		   temp = s[rightBound];
//		   s[rightBound] = s[1];
//		   s[1] = temp;
		   
		   
		   // Now partition the array 
 		   int upIndex = leftBound;     // will scan rightward, 'up' the array
		   int downIndex = rightBound-1; // will scan leftward, 'down' the array
		   while (upIndex <= downIndex) 
		   { 
		       // scan right until larger than the pivot
		       while ( (upIndex <= downIndex) && comparisons++ > 0 && (c.compare(s[upIndex], pivotValue)<=0) )
		    	   upIndex++; 
		       // scan leftward to find an element smaller than the pivot
		       while ( (downIndex >= upIndex) && comparisons++ > 0 && (c.compare(s[downIndex], pivotValue)>=0))
		    	   downIndex--;
		       if (upIndex < downIndex) { // both elements were found
		          temp = s[downIndex]; 
			      s[downIndex] = s[upIndex]; // swap these elements
			      s[upIndex] = temp;
			      moves++;
		       }
		   } // the loop continues until the indices cross
		    
		   int pivotIndex = upIndex;
		   temp = s[rightBound]; // swap pivot with the element at upIndex
		   s[rightBound] = s[pivotIndex]; 
		   s[pivotIndex] = temp;
		 
		   // the pivot is now at upIndex, so recursively quicksort each side
		   quickSortStep(s, c, leftBound, pivotIndex-1);
		   quickSortStep(s, c, pivotIndex+1, rightBound);
		}


		

		/** utility method to return string representation of array of strings */
		private static String array2String(String[] a)
		{
			String text="[";
			for (int i=0; i<a.length; i++) {
				text += a[i];
				if (i<a.length-1)
					text += ",";
			}
			text += "]";
			return text;
			}
		public static String[] randArray(int i){
			String[] randArr = new String[i]; 

			Random r = new Random();

		    String alphabet = "123456789abcdefghijklmnopqrstuvwxyz";
		    for (int p = 0; p < i; p++) {
		         randArr[p] = "" + alphabet.charAt(r.nextInt(alphabet.length()));
		    }

			return randArr;
		}
	  }

