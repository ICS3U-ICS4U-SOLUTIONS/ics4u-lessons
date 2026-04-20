package lessons;

public class MyMethods {
	
	
	
	/*	DESCRIPTION - Swaps values a[x] with a[y].
	 * 	PARAMETERS - int[] a, int x, int y
	 *	RETURN - void
	 */
	public static void swapIntegers(int[] a, int x, int y)  {
		
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
