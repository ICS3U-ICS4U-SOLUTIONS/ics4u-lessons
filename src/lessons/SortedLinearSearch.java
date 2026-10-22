package lessons;

public class SortedLinearSearch {
	
	static int counter = 0;
	
	public static void main(String[] args) {

		String[] sortedArray = {"black", "blue", "green", "orange", "peach", "purple",
				"red", "salmon", "white"};
		
		System.out.println(linearSortedSearch(sortedArray, "aprocot"));
		System.out.println("COUNTER: " + counter);
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

			// past the point where "pattern" should be
			// in sorted list, stop and return sentinel value
			if(p.compareToIgnoreCase(a[i]) < 0)
				break;		
		}
		
		return -1;
	}

}
