package lessons;

public class LinearUnsortedSearch {

	// to see how many items searched
	static int counter = 0;
	
	public static void main(String[] args) {

		String[] unSortedArray = {"peach", "blue", "salmon", "brown", "green",
				"orange", "purple", "red", "black", "white"};
		
		System.out.println(unsortedSearch(unSortedArray, "cranberry"));
		System.out.println("NUMBER SEARCHES: " + counter);

	}
	
	// DESCRIPTION - Returns index of String pattern (p) in Array (a) 
	// PARAMETERS - String[] a, String p
	// RETURN - int
	public static int unsortedSearch(String[] a, String p)  {
		
		for(int i=0; i<a.length; i++)  {
			
			counter++;
			
			if (a[i].equals(p))
				return i;
		}
		
		return -1;
	}
		
}
