package lessons;

public class BubbleSort {

	static int swaps = 0;
	static int comparisons = 0;
	
	public static void main(String[] args) {
		
		int[] myArray = {4, 3, 7, 2, 9, 6, 2, 0};
		printArray(myArray);
		bubbleSortIntsAscending(myArray);
		System.out.println();
		printArray(myArray);	
		System.out.println();
		System.out.println("SWAPS: " + swaps);
		System.out.println("COMPARISONS: " + comparisons);
		System.out.println();
				
		int[] myArray2 = {4, 3, 7, 2, 9, 6, 2, 0};
		printArray(myArray2);
		System.out.println();
		swaps = 0;
		comparisons = 0;
		betterBubbleSort(myArray2);
		printArray(myArray2);
		System.out.println();
		System.out.println("SWAPS: " + swaps);
		System.out.println("COMPARISONS: " + comparisons);
			
	}

	
	// DESCRIPTION - Sorts int[] a in ascending order.
	// PARAMETERS - int[] a
	// RETURN - void 
	public static void bubbleSortIntsAscending(int[] a)  {
		
		boolean swapped = true;	
		
		while(swapped == true)  {
			
			swapped = false;
			
			for(int i=0; i<a.length - 1; i++)  {
				
				comparisons++;
				
				if (a[i] > a[i +1])  {
					
					swap(a, i, i+1);
					swaps++;
					swapped = true;
				}	
			}
		}
	}
	
	
	// DESCRIPTION - Sorts int[] a in ascending order.
	// PARAMETERS - int[] a
	// RETURN - void 
	public static void betterBubbleSort(int[] a)  {
		
		boolean swap = true;
		int stopIndex = a.length;
		
		while (swap == true)  {
			
			swap = false;
			
			stopIndex--;
			
			for (int i=0; i<stopIndex; i++)  {
				
				comparisons++;
				
				if (a[i] > a[i+1])  {
					swap(a, i, i+1);
					swap = true;
					swaps++;
				}
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
