package lessons;

public class OneDimensionalArrays {

	public static void main(String[] args) {

		// single identifier with indexes (starting at 0)
		// holds ELEMENTS of any SINGLE TYPE (primitives, objects)
		// not dynamic, can't grow after creation

		// Examplees:
		String[] bar = new String[69];
		int[] foo = new int[13];
		
		// Intialze array upon creation
		int[] fubar = {3, 45, 65, 4, 65, 5};
		
		// access single element
		System.out.println(fubar[0]);
		
		// length of array
		System.out.println(fubar.length);
		
		// loop through array, use .length method to avoid
		// index out of bounds error
		for(int i=0; i<fubar.length; i++)  {
			
			System.out.println(fubar[i]);
		}
		
		/*  PRACTICE ASSIGNMENT
		    1. Store 12 integers into an array.
			2. List all integers in array and the sum of all integers.
			3. List even integers in array and the sum of even integers.
			4. List odd integers in array and the sum of odd integers.
			5. Exit

		 */
	}

}
