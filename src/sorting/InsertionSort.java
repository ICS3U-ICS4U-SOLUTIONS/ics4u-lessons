package sorting;

public class InsertionSort {

	public static int swaps = 0;
	public static int comparisons = 0;
	
	public static void main(String[] args) {

		int[] myArray  = {4, 3, 1, 0, 2};
		insertionSort(myArray, 0);
		printArray(myArray);
		System.out.println("COMPARISONS: " + comparisons);
		System.out.println("SWAPS: " + swaps);
	}

	
	/*	DESCRIPTION - Sorts array of integers in ascending order.
	 * 	PARAMETERS - int[] a, int i
	 * 	RETURN - void
	 */
	public static void insertionSort(int[] a, int n)  {
		
		/*	Insertion sort is similar to sorting a hand of cards.
		 * 	Put first 2 items in correct order.
		 * 	Insert 3rd item in correct place relative to fist two.
		 * 	Insert fourth item in correct place relative to first three.
		 * 	and so on ...
		 */

		
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
