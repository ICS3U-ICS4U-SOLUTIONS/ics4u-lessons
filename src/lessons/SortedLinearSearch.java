package lessons;

public class SortedLinearSearch {
	
	static int counter = 0;
	
	public static void main(String[] args) {

		String[] sortedArray = {"black", "blue", "green", "orange", "peach", "purple",
				"red", "salmon", "white"};
		
		System.out.println(linearSortedSearch(sortedArray, "blue"));
		System.out.println("COUNTER: " + counter);
		
		System.out.println("blue".compareToIgnoreCase("green"));
	}
	
	// DESCRIPTION - Returns index of p in a. Returns -1 if not in list. 
	// PARAMETERS - String[] a, String p
	// RETURN - int
	public static int linearSortedSearch(String[] a, String p)  {
		
		for(int i=0; i<a.length; i++)  {
			
			counter++;
			
			// exact match found, return index
			if(p.compareToIgnoreCase(a[i]) == 0)
				return i;

			// past point where "pattern" should be, stop loop
			if(p.compareToIgnoreCase(a[i]) > 0)
				break;	
		}
		
		// pattern not found
		return -1;
	}

}
