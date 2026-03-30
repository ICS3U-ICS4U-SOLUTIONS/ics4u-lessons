package lessons;

public class UnsortedLinearSearch {

	public static void main(String[] args) {

		String[] unSortedArray = {"peach", "blue", "salmon", "brown", "green", "orange", 
				"purple", "red", "black", "white"};
		
		System.out.println(unSortedLinearSearch(unSortedArray, "hazel"));
	}
	
	/*	DESCRIPTION - Returns true if search pattern is found at least once in Array.
	 * 	PARAMETERS - String[] array, String pattern
	 * 	RETURN - boolean
	 */
	public static boolean unSortedLinearSearch(String[] array, String pattern)  {
		
		for(int i=0; i<array.length; i++)  {
			
			if (array[i].equals(pattern))
				return true;
		}
		
		return false;
	}
}
