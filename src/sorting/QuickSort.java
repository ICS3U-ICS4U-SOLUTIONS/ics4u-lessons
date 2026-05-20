package sorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] myArray = {2, 3, 6, 0, 1, 5, 4};	
		
		quickSort(myArray, 0, myArray.length-1);
		
		
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
	

	/* DESCRIPTION - Uses "Median of Three" method for selecting pivot.  Orders left, middle and right, then swaps middle with right.
 	 * PARAMETERS - int[] array, int left, int right
  	 * RETURN - void
	 */
	public static void pickPivot(int[] array, int left, int right)  {
		
		int middle = (left+right) / 2;
			
		// compare left and middle, swap if necessary
		if (array[left] > array[middle])
			swap(array, left, middle);
		
		// compare middle and right, swap if necessary
		if (array[middle] > array[right])
			swap(array, middle, right);
		
		// compare left and middle, swap if necessary
		if (array[left] > array[middle])
			swap(array, left, middle);
		
		// swap middle with right
		swap(array, middle, right);
		
	}

    
	/*  DESCRIPTION - Returns index of first value bigger than pivot, starting from the left.
 	 * 				  Returns -1 if no element is bigger than pivot.
 	 *  PARAMETERS - int[] array, int left, int right
 	 *  RETURN - int
 	*/
	public static int getItemFromLeftIndex(int[] array, int left, int right)  {
	
		int itemFromLeftIndex = -1;
		
		for(int i=left; i<right; i++)  {
		
			if(array[i] > array[right])  {
				
				itemFromLeftIndex = i;
				break;
			}
		}
		
		return itemFromLeftIndex;
	}

	
	/*  DESCRIPTION - Returns index of first value smaller than pivot, starting from the right.
	 * 				  Returns -1 if no element is smaller than pivot.
	 *  PARAMETERS - int[] array, int left, int right
	 *  RETURN - int
	 */
	public static int getItemFromRightIndex(int[] array, int left, int right)  {
		
		int itemFromRightIndex = -1;
		
		for(int i=right-1; i>=left ; i--)  {
		
			if(array[i] < array[right])  {
				
				itemFromRightIndex = i;
				break;
			}
		}
		
		return itemFromRightIndex;
	}


    /*  DESCRIPTION - Moves pivot (right-most element) to correct location in sorted list.
     *  			  Moves values < pivot to left of pivot.  Moves all values > pivot to right of pivot.
     *  			  Returns index of pivot. a.length > 1.  Returns -1 if sub-list is size 1.
     *  PARAMETERS - int[] array, int left, int right
     *  RETURN - int
     */
   	public static int partition(int[] array, int left, int right)  {
   		
   		// STOP CASE (list size 1)
   		if (left == right)
   			return -1;
   		
   		// variables
   		int itemFromLeftIndex = getItemFromLeftIndex(array, left, right);
   		int itemFromRightIndex = getItemFromRightIndex(array, left, right);
   		
   		// CONDITION 1 - no IFL, pivot in correct location on right
   		if (itemFromLeftIndex == -1)
   			return right;
   		
   		// CONDITION 2 - no IFR, swap pivot with left most position, return index 
   		else if (itemFromRightIndex == -1)  {
   			
   			swap(array, left, right);
   			return left;
   		}
   		
   		// CONDITION 3 - IFL index > IFR index (they cross), swap IFL with PIVOT, stop
   		else if (itemFromLeftIndex > itemFromRightIndex)  {
   			
   			swap(array, itemFromLeftIndex, right);
   			return itemFromLeftIndex;
   		}
   		
   		// CONDITION 4 - IFL index < IFR index
   		else  {
   		
   			swap(array, itemFromLeftIndex, itemFromRightIndex);
   			return partition(array, left, right);
   		}
   	}
   	
   	
	/*  DESCRIPTION - Sorts int[] in ascending order.
	 *  PARAMETERS - int[] array, int left, int right
	 *  RETURN - void
	 */
	public static void quickSort(int[] array, int left, int right)  {
		
		// base / stop case (sublist is size 1)
		if(left == right)
			return;
		
		// base / stop case (no sublist to partition)
		if(left > right)
			return;
		
		// pick pivot
		pickPivot(array, left, right);
		
		// partition
		int pivot = partition(array, left, right);
		
		// quickSort left sublist
		quickSort(array, left, pivot-1);
		
		// quicSort right sublist
		quickSort(array, pivot+1, right);
	}

}
