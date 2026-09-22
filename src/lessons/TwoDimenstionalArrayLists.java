package lessons;
import java.util.ArrayList;

public class TwoDimenstionalArrayLists {

	public static void main(String[] args) {

		// ArrayLists (used for rows)
		ArrayList<String> row1 = new ArrayList();
		ArrayList<String> row2 = new ArrayList();
		ArrayList<String> row3 = new ArrayList();
		ArrayList<String> row4 = new ArrayList();
		
		// ArrayList of ArrayLists
		ArrayList<ArrayList<String>> myList = new ArrayList();
		
		// Add information to row1
		row1.add("2008");
		row1.add("Honda");
		row1.add("Prelude");
		row1.add("Gold");
		row1.add("10000");
		
		// Add row1 to ArrayList
		myList.add(row1);
		
		// Add information to row2
		row2.add("2006");
		row2.add("Chrysler");
		row2.add("Caravan");
		row2.add("Blue");
		row2.add("44198");
		
		// Add row2 to ArrayList
		myList.add(row2);
		
		// Add information to row3
		row3.add("2007");
		row3.add("Ford");
		row3.add("Explorer");
		row3.add("Red");
		row3.add("22550");
		
		// Add row3 to ArrayList
		myList.add(row3);
		
		// Add information to row4
		row4.add("2000");
		row4.add("Volkswagen");
		row4.add("Beetle");
		row4.add("Silver");
		row4.add("62582");
		
		// Add row4 to ArrayList
		myList.add(row4);
		
		// print the lists
		for(int i=0; i<myList.size(); i++)  {
			
			for(int j=0; j<row1.size(); j++)  {
				
				System.out.print(myList.get(i).get(j) + " ");
			}
		
			System.out.println();
		}

	}

}
