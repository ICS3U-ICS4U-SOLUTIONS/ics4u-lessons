package lessons;

public class BubbleSort {

	public static void main(String[] args) {

		int[] myArray = {4, 3, 7, 2, 9, 6, 2, 0};
		printArray(myArray);
	//	swap(myArray, 1, 7);
	//	System.out.println();
	//	printArray(myArray);
		
		/*	EXPECTED OUTPUT:
		 *  4, 3, 7, 2, 9, 6, 2, 0
		 *  0, 3, 7, 2, 9, 6, 2, 4
		 */
		
		// bubbleSortIntsAscending(myArray);
		
	}

	// DESCRIPTION - Sorts int[] a in ascending order.
	// PARAMETERS - int[] a
	// RETURN - void 
	public static void bubbleSortIntsAscending(int[] a)  {
		
		boolean swapped = true;	
		
		while(swapped == true)  {
			
			swapped = false;
			
			for(int i=0; i<a.length - 1; i++)  {
				
				
			}
			
			
			
		}
		
		
	}
	
	
	
	// DESCRIPTION - Swaps a[x] and a[y].
	// PARAMETERS - int[] a, int x, int y
	// RETURN - void
	public static void swap(int[] a, int x, int y)  {
		
		// error case - out of bounds index
		if (x > a.length - 1 || y > a.length - 1  || x < 0 || y < 0)
			return;
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	// DESCRIPTION - Displays content of int[] a to console
	// PARAMETERS - int[] a
	// RETURN - void
	public static void printArray(int[] a)  {
		
		for(int i=0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
	
	
}
