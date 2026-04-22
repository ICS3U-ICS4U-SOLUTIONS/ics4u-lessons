package sorting;

public class BubbleSort {

	public static int numSwaps = 0;
	public static int numComparisons = 0;
	
	public static void main(String[] args) {

		// unsorted array
		int[] myArray = {5, 2, 3, 1, 4, 9, 6, 7, 8, 0};
		printArray(myArray);
		swap(myArray, 2, 5); // test swap method
		printArray(myArray);
		bubbleSort(myArray, false);
		printArray(myArray);
		System.out.println("SWAPS: " + numSwaps);
		System.out.println("COMPARISONS: " + numComparisons);
	}
	
	
	/*	DESCRIPTION - Sorts int[] in ascending or descending order (true/false).
	 * 	PARAMETERS - int[] a, boolean ascending
	 *	RETURN TYPE - void
	 */
	public static void bubbleSort(int[] a, boolean order)  {
		
		boolean ascending = order;
		boolean swapped = true;
		
		// sort ascending order
		if (ascending == true)  {
			
			while(swapped == true)  {
				
				swapped = false;
				
				for(int i=0; i<a.length-1; i++)  {
					
					numComparisons++;
					
					if(a[i] > a[i+1])  {
						
						swap(a, i, i+1);
						numSwaps++;
						
						swapped = true;
					}
				}
			}
		}
		
		
		// sort descending order
		if (ascending == false)  {
					
			while(swapped == true)  {
						
				swapped = false;
						
				for(int i=0; i<a.length-1; i++)  {
							
					numComparisons++;
							
					if(a[i] < a[i+1])  {
								
						swap(a, i, i+1);
						numSwaps++;
								
						swapped = true;
					}
				}
			}
		}
		
		
		
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
