package lessons;
import java.util.ArrayList;
import java.util.Comparator;	// for sorting ArrayLists

public class ArrayListSorting {

	public static void main(String[] args) {

		// variables
		ArrayList<String> row1 = new ArrayList();
		
		row1.add("B");
		row1.add("A");
		row1.add("C");
		row1.add("E");
		row1.add("D");
		System.out.println(row1);
		
		// sort from alphabetically, or smallest to largest (numbers)
		row1.sort((Comparator.naturalOrder()));
		System.out.println(row1);
		
		// sort backwards
		row1.sort((Comparator.reverseOrder()));
		System.out.println(row1);
		
		
	}

}
