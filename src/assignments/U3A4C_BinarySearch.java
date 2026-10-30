package assignments;

public class U3A4C_BinarySearch {

	public static void main(String[] args) {

		int[] sortedIntArray = {0, 2, 3, 4, 7, 13, 17, 22};
		String[] sortedStringArray = {"black", "blue", "brown", "green", "orange", "peach", "purple", "red", "salmon", "white"};

		// processing
		System.out.println(binaryIntSearch(sortedIntArray, 13));
		System.out.println(binaryIntSearch(sortedIntArray, 73));
		System.out.println(binaryStringSearch(sortedStringArray, "green"));
		System.out.println(binaryStringSearch(sortedStringArray, "pink"));
		System.out.println(binaryIntSearchRecursive(sortedIntArray, 17, 0, sortedIntArray.length - 1));
		System.out.println(binaryIntSearchRecursive(sortedIntArray, 73, 0, sortedIntArray.length - 1));
		System.out.println(binaryStringSearchRecursive(sortedStringArray, "black", 0, sortedStringArray.length - 1));
		System.out.println(binaryStringSearchRecursive(sortedStringArray, "pink", 0, sortedStringArray.length - 1));
		
		/*  BEGIN EXPECTED OUTPUT:
		 
	  		5
			-1
			3
			-1
			6
			-1
			0
			-1
			
		 	END EXPECTED OUTPUT  */
		
	}

	
	// DESCRIPTION - Returns array index of pattern if found, else -1.  Duplicates not handled.
	// PARAMETERS - int[] sortedIntArray, int intPattern 
	// RETURN TYPE - int
	public static int binaryIntSearch(int[] sortedIntArray, int intPattern)  {
			        
		// TO BE COMPLETED
		return 0;
	}
	
	
	// DESCRIPTION - Returns array index of pattern if found, else -1.  Duplicates not handled.
	// PARAMETERS - String[] sortedStringArray, String stringPattern 
	// RETURN TYPE - int
	public static int binaryStringSearch(String[] sortedStringArray, String stringPattern)  {
			        
		// TO BE COMPLETED
		return 0;
	}
	
	
	// DESCRIPTION - Returns array index of pattern if found, else -1.  Duplicates not handled.
	// PARAMETERS - int[] sortedIntArray, int intPattern, int left, int right
	// RETURN TYPE - int
	public static int binaryIntSearchRecursive(int[] sortedIntArray, int intPattern, int left, int right)  {
			        
		// TO BE COMPLETED
		return 0;
	}
	
	
	// DESCRIPTION - Returns array index of pattern if found, else -1.  Duplicates not handled.
	// PARAMETERS - String[] sortedStringArray, String stringPattern, int left, int right
	// RETURN TYPE - int
	public static int binaryStringSearchRecursive(String[] sortedStringArray, String stringPattern, int left, int right)  {
			        
		// TO BE COMPLETED
		return 0;
	}
	
}