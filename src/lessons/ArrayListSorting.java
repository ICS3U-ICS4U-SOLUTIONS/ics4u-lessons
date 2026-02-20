package lessons;
import java.util.ArrayList;		// for ArrayLists
import java.util.Comparator; 	// for Sorting ArrayLists

public class ArrayListSorting {

	public static void main(String[] args) {

		ArrayList<String> row1 = new ArrayList();
		
		row1.add("B");
		row1.add("A");
		row1.add("C");
		row1.add("E");
		row1.add("D");
		System.out.println(row1);   // same as System.out.println(row1.toString());
		
		// sort ArrayList in ascending (going up) order
		row1.sort((Comparator.naturalOrder()));
		System.out.println(row1);
		
		// sort ArrayList in descending (goind down) order
		row1.sort((Comparator.reverseOrder()));
		System.out.println(row1);
		


	}

}
