package sorting;

public class SelectionSort {

	
	// DESCRIPTION - Sorts int[] a in ascending order.
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void selectionSort(int[] a)  {
		
		for (int i=0; i<a.length-1; i++)  {
			
			for (int j=i+1; j<a.length-1; j++)  {
				
				if (a[i] > a[j+1])
					swap(a, i, j+1);
			}
		}
	}
	
	// DESCRIPTION - Sorts int[] a in ascending order.
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void selectionSortRecursive(int[] a, int i)  {
		
		// error case
		if ((i < 0) || (i > a.length-1))  {

			System.out.println("Invalid index.");
			return;
		}
		
		// base case / stop case
		if(i == a.length-1)
			return;
		
		// do one pass
		for (int j=i; j<a.length-1; j++)  {
			
			if (a[i] > a[j+1])
				swap(a, i, j+1);
		}
		
		selectionSortRecursive(a, i+1);
	}

	
	// DESCRIPTION - Sorts array of integers in ascending order.
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void betterSelectionSort(int[] a)  {
		
		for(int i=0; i<a.length-1; i++)  {
			
			int smallestItem = i;
			
			for(int j=i+1; j<a.length; j++)  {
				
				if(a[smallestItem] > a[j])
					smallestItem = j;
			}
			
			if (i != smallestItem)
				swap(a, i, smallestItem);
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
