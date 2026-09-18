package lessons;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		// ArrayLists are dynamic, not fixed in size
		// Can store objects of any (same) type
		// Can not store primitives
		// Access elements using methods
		// indexes 0 to n-1 (like arrays)
		// Must import ArrayList library, contains many methods
		
		// SYNTAX:  ArrayList<Object-Type> listName = new ArrayList();		// cleanest
		// 			ArrayList<Object-Type> listName = new ArrayList<>();
		//			ArrayList<Object-Type> listName = new ArrayList<Object-Type>();
		//			ArrayList<Object-Type> listName = new ArrayList<Object-Type>(<size>);
		
		// EXAMPLE:
		ArrayList<String> students = new ArrayList();
		
		// add students
		students.add("David");
		students.add("Alec");
		students.add("Albert");
		students.add("Ryan");
		
		// display list size
		System.out.println(students.size());
		
		// access elements
		System.out.println(students.get(3));
		
		// loop through list
		for(int i=0; i<students.size(); i++)
			System.out.println(students.get(i));
		
		// new list of ints
		ArrayList<Integer> myIntegers = new ArrayList();
		Integer myIntegerObject = 13;	// wrapper class
		int myIntPrimitive = 7;
		
		// primitives get wrapped into wrapper-classes when put into ArrayLists
		myIntegers.add(myIntegerObject);
		myIntegers.add(myIntPrimitive);
		
		/*	Useful methods (can look up online, google "Oracle Java ArrayLists)
		 * 
		 *  add(value)  // appends at end of list
		 *  add(index, value)  // inserts value at index
		 *  clear()		// removes all elements
		 *  indexOf(value)	// returns first value where index is found, -1 if not found
		 *  get(index)	// returns value at index
		 *  remove(index)  // removes value at index, everything else past element is shifted left
		 *  set(index, value)  // replaces value at index with value
		 *  toString()	// returns String representation of list
		 *  
		 *  NOTE - .toString() is called by default if you print ANY object
		 */
		

	}

}
