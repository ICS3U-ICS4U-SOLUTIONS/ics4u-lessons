package sorting;

public class BubbleSort {
	
	// DESCRIPTION - Sorts int[] a in ascending order.
	// PARAMETERS - int[] a
	// RETURN - void 
	public static void bubbleSort(int[] a)  {
		
		boolean swapped = true;	
		
		while(swapped == true)  {
			
			swapped = false;
			
			for(int i=0; i<a.length - 1; i++)  {
				
				if (a[i] > a[i +1])  {
					
					swap(a, i, i+1);
					swapped = true;
				}	
			}
		}
	}
	
	
	// DESCRIPTION - Sorts int[] a in ascending order.
	// PARAMETERS - int[] a
	// RETURN - void 
	public static void betterBubbleSort(int[] a)  {
		
		boolean swaped = true;
		int stopIndex = a.length;
		
		while (swaped == true)  {
			
			swaped = false;
			
			stopIndex--;
			
			for (int i=0; i<stopIndex; i++)  {
				
				if (a[i] > a[i+1])  {
					swap(a, i, i+1);
					swaped = true;
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

}
