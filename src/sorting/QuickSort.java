package sorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] myArray = {2, 3, 6, 0, 1, 5, 4};

		printArray(myArray);

	}

	
	/*  DESCRIPTION - Prints array.
     *  PARAMETERS - int[] array
   	 *  RETURN - void
   	 */
	public static void printArray(int[] array)  {
		
		for(int i=0; i<array.length; i++)
            	System.out.print(array[i] + " ");
		
		System.out.println();
	}
	
	
	/*  DESCRIPTION - Swaps element x with element y.
	 *  PARAMETERS - int[] array, int x, int y
	 *  RETURN - void
	 */
    public static void swap(int[] a, int x, int y)  {
            
    	int temp = a[x];
    	a[x] = a[y];
    	a[y] = temp;
    }
	
	
	/*  DESCRIPTION - Sorts int[] in ascending order.
	 *  PARAMETERS - int[] array, int left, int right
	 *  RETURN - void
	 */
//	public static void quickSort(int[] array, int left, int right)
	
	

    

	/*  DESCRIPTION - Returns index of first value bigger than pivot, starting from the left.
 	 * 				  Returns -1 if no element is bigger than pivot.
 	 *  PARAMETERS - int[] array, int left, int right
 	 *  RETURN - int
 	*/
//public static int getItemFromLeftIndex(int[] array, int left, int right)

	
	/*  DESCRIPTION - Returns index of first value smaller than pivot, starting from the right.
	 * 				  Returns -1 if no element is smaller than pivot.
	 *  PARAMETERS - int[] array, int left, int right
	 *  RETURN - int
	 */
//	public static int getItemFromRightIndex(int[] array, int left, int right)

	
	

    	/*  DESCRIPTION - Moves pivot (right-most element) to correct location in sorted list.
    	 *  			  Moves values < pivot to leftof pivot.  Moves all values > pivot to right of pivot.
    	 *  			  Returns index of pivot. a.length > 1.
     	 *  PARAMETERS - int[] array, int left, int right
     	 *  RETURN - int
     	*/
 //  	public static int partition(int[] array, int left, int right)


	
	


	
	
	
	

    
    
 

	
}
