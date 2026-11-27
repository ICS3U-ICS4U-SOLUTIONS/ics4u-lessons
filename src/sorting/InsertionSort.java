package sorting;

public class InsertionSort {

	
    // DESCRIPTION - Sorts int[] in ascending order.
    // PARAMETERS - int[] array
    // RETURN - void
	public static void insertionSort(int[] a)  {

		for (int i=1; i<a.length; i++)  {
			
			for (int j=i; j>0; j--)  {
				
				if (a[j] < a[j-1]) 
					swap(a, j, j-1);
				
				else				
					break;		// stops after element in correct spot
			}
		}
	}
	

	// DESCRIPTION - Swaps elements in array at index x with index y.
	// PARAMETERS - int[] a, int x, int y
	// RETURN TYPE - int[]	
	public static void swap(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
