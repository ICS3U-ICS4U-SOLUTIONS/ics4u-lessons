package sorting;

import java.lang.reflect.Array;

public class SelectionSort {

	public static int swaps = 0;
	public static int comparisons = 0;
	
	public static void main(String[] args) {

		int[] myArray  = {4, 3, 1, 0, 2};
		selectionSort(myArray, 0);
		printArray(myArray);
		System.out.println("COMPARISONS: " + comparisons);
		System.out.println("SWAPS: " + swaps);

	}
	
	
	/*	DESCRIPTION - Sorts array of integers in ascending order.
	 * 	PARAMETERS - int[] a, int i
	 * 	RETURN - void
	 */
	public static void selectionSort(int[] a, int n)  {
		
		// error case(s)
		if (n < 0)
			return;
		
		// base/stop case
		if (n == a.length-1)
			return;

		// do a pass
		for (int i=n; i<a.length-1; i++)  {
			
			comparisons++;
			
			// swap swap if bigger
			if (a[n] > a[i+1])
				swap(a, n, i+1);
		}
		
		selectionSort(a, n+1);
		
	}
	
	/*	DESCRIPTION - Prints array.
	 * 	PARAMETERS - int[] a
	 * 	RETURN - none
	 */
	public static void printArray(int[] a)  {
		
		for(int i=0; i<a.length; i++)  {
			
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
	}

	/*	DESCPRITION - Swaps int[x] with int[y].
	 * 	PARAMETERS - int[] a, int x, int y
	 * 	RETURN - none
	 */	
	public static void swap(int[] a, int x, int y)  {
		
		swaps++;
		
		int temp = a[x];
		
		a[x] = a[y];
		a[y] = temp;
	}
	
}
