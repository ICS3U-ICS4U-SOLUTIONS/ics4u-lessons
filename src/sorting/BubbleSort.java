package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] myArray = {5, 2, 3, 1, 4, 9, 6, 7, 8, 0};
		printArray(myArray);
		swap(myArray, 2, 5);
		printArray(myArray);
	}
	
	
	/*	DESCRIPTION - Swaps int[x] with int[y].
	 * 	PARAMETERS - int[] a, int x, int y
	 *	RETURN TYPE - void
	 */
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		
		a[x] = a[y];
		a[y] = temp;
	}

	
	/*	DESCRIPTION - Prints array.
	 * 	PARAMETERS - int[] a
	 *	RETURN TYPE - void
	 */
	public static void printArray(int[] a)  {
		
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
	}
	 

}
