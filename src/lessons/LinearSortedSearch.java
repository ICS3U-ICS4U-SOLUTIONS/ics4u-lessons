package lessons;

public class LinearSortedSearch {

	// GLOBAL COUNTER
	static int counter = 0;

	public static void main(String[] args) {	
		
		String[] sortedArray = {"black", "blue", "brown", "green",
				"orange", "peach", "red", "salmon", "white"};
		
		System.out.println(sortedLinearSearch(sortedArray, "auburn"));
		System.out.println(counter);

	}

	/*	DESCRIPTION - Returns true if search pattern is found at least
	 * 				  once inside array.
	 *  PARAMETERS - String[] array, String pattern
	 *  RETURN - boolean
	 */
	public static boolean sortedLinearSearch(String[] array, String pattern)  {
	
		// loop through entire array
		for(int i=0; i<array.length; i++)  {
			
			counter++;	// just to see how many iterations
			
			// look for a match, but stop if you go past where it's supposed to be
			if(array[i].compareTo(pattern) == 0 )
				return true;
			
			if(array[i].compareTo(pattern) > 0 )
				return false;
		}
		
		return false;
	}
	
}
