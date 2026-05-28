package sorting;

public class MergeSort {

	public static int counter = 0;
	
	public static void main(String[] args) {

		int[] myArray = { 20, 47, 15, 8, 9, 4, 40, 30, 12, 17 };

		myArray = mergeSort(myArray);

		for (int i=0; i<myArray.length; i++)
			System.out.print(myArray[i] + " ");
	}
	
	
	/*  DESCRIPTION - Sorts int[] in ascending order.
	 *  PARAMETERS - int[] a
	 *  RETURN - int[]
	 */
	public static int[] mergeSort(int[] a)  {
		
		// stop case
		if (a.length == 1)
			return a;
		
		// create arrayOne, populate with left half of a[]
		int[] arrayOne = new int[a.length/2];
		
		for (int i=0; i<a.length/2; i++)
			arrayOne[i] = a[i];
		
		// create arrayTwo, populate with right half of a[]
		int[] arrayTwo = null;
		
		if (a.length%2 == 0)  // if a.length even
			arrayTwo = new int[a.length/2];
		
		else  // if a.length odd
			arrayTwo = new int[a.length/2 + 1];

		int j = 0;
		
		for (int i=a.length/2; i<a.length; i++)  {
			arrayTwo[j] = a[i];
			j++;
		}
		
		// sort arrayOne
		arrayOne = mergeSort(arrayOne);

		// sort arrayTwo
		arrayTwo = mergeSort(arrayTwo);

		// merge arrayOne with arrayTwo
		return merge(arrayOne, arrayTwo);
	}
		
	
	/*  DESCRIPTION - Merges int[] a with int[] b in ascending order.
	 *  PARAMETERS - int[] a, int[] b
	 *  RETURN - int[]
	 */
	public static int[] merge(int[] a, int[] b)  {
		
		// indexes for 3 arrays
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		// new array
		int[] c = new int[a.length + b.length];
		
		// compare and move first elements of a and b until a or b empty
		while ((aIndex < a.length) && (bIndex < b.length))  {
			
			if (a[aIndex] < b[bIndex])  {
				
				c[cIndex] = a[aIndex];
				aIndex++;
				cIndex++;
			}
				
			else  {
				
				c[cIndex] = b[bIndex];
				bIndex++;
				cIndex++;
			}
		}
		
		// a is empty, copy the rest of b into c
		if (aIndex == a.length)  {
			
			while(bIndex < b.length)  {
				
				c[cIndex] = b[bIndex];
				bIndex++;
				cIndex++;
			}	
		}
		
		// b is empty, copy rest of a into c
		else  {
			
			while(aIndex < a.length)  {
				
				c[cIndex] = a[aIndex];
				aIndex++;
				cIndex++;
			}	
		}
		
		return c;
	}
}