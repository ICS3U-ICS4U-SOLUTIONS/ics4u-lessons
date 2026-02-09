package lessons;

public class OneDimensionalArrays {

	public static void main(String[] args) {

		/*
		 * Java arrays are single identifiers with indexes beginning at 0.
		 * Holds ELEMENTS of any SINGLE TYPE (primitives, objects).
		 * Static (not dynamic), can't grow or shrink after creation.
		 */

		// Syntax
		// dataType[] arrayIdentifer = new[arraySize];
		
		// Examples:
		String[] myStringArray = new String[3];
		int[] myIntArray = new int[7];
		int[] myIntArray2 = {34, 5, 2, 123, 45, 5, 45, 2, 43};  // initialized
		
		// Adding elements to array
		myStringArray[0] = "foo";
		myStringArray[1] = "bar";
		myStringArray[2] = "fubar";
		
		// access all elements in array
		for(int i=0; i<myStringArray.length; i++)  {
			
			System.out.println(myStringArray[i]);
		}
		
	}

}
