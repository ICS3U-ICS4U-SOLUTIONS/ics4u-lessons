package lessons;
import java.util.ArrayList;		// must import library

public class ArrayLists {

	public static void main(String[] args) {
		
		/*
		 * Arraylist's are Objects, must import a library.
		 * Can't store primitives, only objects.
		 * Access elements using methods.
		 * Indexes are like arrays (0 to n-1)
		 * Dynamic - grows and shrinks.
		 * Many predefined methods.
		 */
		
		/*
		 * SYNTAX TO CREATE ARRAYLISTS:
		 * 
		 * 1. ArrayList<Object-Type> identifier = new ArrayList<Object-Type>(<size>);
		 * 2. ArrayList<Object-Type> identifier = new ArrayList<Object-Type>();
		 * 3. ArrayList<Object-Type> identifier = new ArrayList<>();
		 * 4. ArrayList<Object-Type> identifier = new ArrayList();
		 */
		
		// variables
		ArrayList<String> myStringArrayList = new ArrayList();
		
		// add Strings to Array List
		myStringArrayList.add("Neema");
		myStringArrayList.add("Bob");
		myStringArrayList.add("Nancy");
		myStringArrayList.add("Charlie");
		
		// access all elements using for loop
		for(int i=0; i<myStringArrayList.size(); i++)  {
			
			System.out.println(myStringArrayList.get(i));
		}
		
		System.out.println(myStringArrayList.toString());
		
		/*
		 
		COMMON/USEFUL ARRAYLIST METHODS:
		
		add(value) // appends at end of list
		add(index, value)  // insert at index, shift everything after right
		clear()  // removes all elements
		indexOf(value)  // returns first index where value is found, -1 if not found
		get(index)  // returns value at index
		remove(index)  // removes value at index, shifting rest left
		set(index, value)  // replaces value at index with value
		size() // returns number elements in list
		toString()  // returns string representation of list

		*/
		
		
	}

}
