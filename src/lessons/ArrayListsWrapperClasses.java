package lessons;
import java.util.ArrayList;

public class ArrayListsWrapperClasses {

	public static void main(String[] args) {

		// Wrapper classes are used to "box" up primitives so we can 
		// insert into ArrayLists
		ArrayList<Integer> myList = new ArrayList();
		
		
		int myInt = 13;
		Integer myInteger = 7;
		
		myList.add(myInteger);
		myList.add(myInt);
		
		// Other wrapper classes (needed for ArrayLists)
		Double myDouble = 3.3;
		Long myLong;
		Boolean myBoolean = true;
		Character myCharacter = 'a';
		

	}

}
