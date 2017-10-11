package SortingAssignment;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Sort {

	public static int moves = 0;
	public static int comparisons = 0;
	public static StopWatch stopWatch = new StopWatch();
	
	public void mainMethod(){
		
		String array[] = {"za", "re", "ts", "cd", "bc", "de", "fr", "se", "ba", "as", "bz", "a"};
		
		System.out.print("Unsorted Array: ");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		String array2[] = array.clone();
		String array3[] = array.clone();
		String array4[] = array.clone();
		
		insertionSort(array2);
		shellSort(array3);
		quickSort(array4, new StringComparator());
		
	
		int p = 100;
		for(int j = 100; j < 1000; j+=p){
			String a[] = randArray(j);
			shellSort(a);
		}
		
		for(int c = 100; c < 1000; c+=p){
			String a[] = randArray(c);
			insertionSort(a);
		}
		
		for(int c = 100; c < 1000; c+=p){
			String a[] = randArray(c);
			quickSort(a, new StringComparator());
		}
	}
	
	public static String[] randArray(int i){
		String[] randArr = new String[i]; 
		
//		for(int j = 0; j < i; j++){
//			double temp = Math.random()*1247;
//			randArr[j] = "" + (int)temp;
//		}
		
		//Fills array with random elements from alphabet
		
		Random r = new Random();

	    String alphabet = "123456789qwertyuiopasdfghjklzxcvbnm";
	    for (int p = 0; p < i; p++) {
	         randArr[p] = "" + alphabet.charAt(r.nextInt(alphabet.length()));
	    }
		
//		for(int p = 0; p < i; p++){
//			System.out.print(randArr[p] + "  ");
//		}
		System.out.println();
		return randArr;
	}
		
	public static void shellSort (Comparable[] arr)   
	{	
		stopWatch.Start();
		comparisons = 0;
		
		int last = arr.length-1; 

		// Begin with gap = half length of array; reduce by half each time.
		for (int gap = arr.length/2; gap > 0; gap = gap/2)
		{
			//if (gap % 2 == 0) gap++; // if gap is even, move to next largest odd number
			
			// Apply Insertion Sort to the subarrays defined by the gap distance
			for (int first = 0; first < gap; first++) {
				insertionSort (arr, first, last, gap);
			}
		}
		System.out.println();
		System.out.print("Shellsort: ");
		for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + " " );
		}
		System.out.print(" Size of Array: " + arr.length + " Moves: " + moves + " Comparisons: " + comparisons  );
		
		System.out.println(" Time taken: " + stopWatch.elapsedTime());
	}
	
	
	
	
	private static void insertionSort(Comparable[] a, int first, int last, int gap)                                             
	{
		int index;     // general index for keeping track of a position in array
		int toSort;  // stores the index of an out-of-place element when sorting.

		for (toSort = first+gap; toSort <= last; toSort += gap){
			Comparable toSortElement = a[toSort];
			


			// Go back through the list to see how far back (if at all)
			// this element should be moved.
			// Note: we assume all elements before this are sorted relative to each other.
			boolean moveMade = false;
			index = toSort - gap;
			while ( (index >= first) && comparisons++ > -1 && (toSortElement.compareTo(a[index]) < 0))
			{
				// Shuffle elements over to the right, put firstUnsorted before them 
				a[index+gap] = a[index];
				index = index - gap;
				moveMade = true;
			} 
			if (moveMade) {
				//System.out.println("Inserting " + toSortElement + " at pos " + (index+1));
				a[index+gap] = toSortElement;
				moves++;
			}
		}
	} 

	
	
	public static void insertionSort(Comparable arr[])
	{
		stopWatch.Start();
		comparisons = 0;
		
		insertionSort(arr, 0, arr.length-1, 1);
		
		System.out.println();
		System.out.print("Insertionsort: ");
		for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + " " );
		}
		System.out.print(" Size of Array: " + arr.length +  " Moves: " + moves + " Comparisons: " + comparisons );
		
		System.out.println(" Time taken: " + stopWatch.elapsedTime());
		
	}

	private static String array2String(String[] a)
	{
		String text="[";
		for (int i=0; i<a.length; i++) {
			text += a[i];
			if (i<a.length-1)
				text += " ";
		}
		text += "]";
		return text;
	}
	
	public static void quickSort (Object[] arr, Comparator c) {
		comparisons = 0;
		moves = 0;
	    if (arr.length < 2) return; // the array is already sorted in this case
	    quickSortStep(arr, c, 0, arr.length-1); // call the recursive sort method
	    
	    System.out.println();
		System.out.print("Quicksort: ");
		for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + " " );
		}
		System.out.print(" Size of Array: " + arr.length + " Moves: " + moves + " Comparisons: " + comparisons  );
		
		System.out.println(" Time taken: " + stopWatch.elapsedTime());
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
	   Object pivotValue = s[rightBound];
	    
	   // Now partition the array 
	   int upIndex = leftBound;     // will scan rightward, 'up' the array
	   int downIndex = rightBound-1; // will scan leftward, 'down' the array
	   while (upIndex <= downIndex) 
	   { 
	       // scan right until larger than the pivot
	       while ( (upIndex <= downIndex) && comparisons++ > -1 && (c.compare(s[upIndex], pivotValue)<=0) )
	    	   upIndex++; 
	       // scan leftward to find an element smaller than the pivot
	       while ( (downIndex >= upIndex) && comparisons++ > -1 && (c.compare(s[downIndex], pivotValue)>=0))
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
	   moves++;
	 
	   // the pivot is now at upIndex, so recursively quicksort each side
	   quickSortStep(s, c, leftBound, pivotIndex-1);
	   quickSortStep(s, c, pivotIndex+1, rightBound);
	}
}


		

