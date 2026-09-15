package assignments;

public class U2A2_2DArrays_Methods {

	// DESCRIPTION - Displays "Hello World!" to console
	// PARAMETERS - none
	// RETURN TYPE - none
	public static void helloWorld()  {
		
		System.out.println("Hello World!");
	}
	
	
	// DESCRIPTION - Adds first name, last name, test1 score, test2, score, test3 score and test4
	//				 score to String[][], increments and returns counter.
	// PARAMETERS - String first, String last, String t1, String t2, String t3, String t4, int c, String[][] a
	// RETURN TYPE - int
	public static int addStudent(String first, String last, String t1, String t2, String t3, String t4, int c, String[][] a)  {
		
		a[c][0] = first;
		a[c][1] = last;
		a[c][2] = t1;
		a[c][3] = t2;
		a[c][4] = t3;
		a[c][5] = t4;
		
		c++;
		return c;
	}
	
	
	// DESCRIPTION - Returns String containing all data from a[][]
	// PARAMETERS - String[][] a
	// RETURN TYPE - String
	public static String listStudents(String[][] a)  {
		
		String allData = "";
		
		allData = allData + "First Name\tLastName\tTest1\tTest2\tTest3\tTest4\n\n";
		
		
		for(int i=0; i<a.length; i++)  {
			
			// first name
			allData = allData + a[i][0] + "\t\t";

			// last name
			allData = allData + a[i][1] + "\t\t";
			
			// test 1
			allData = allData + a[i][2] + "\t";
			
			// test 2
			allData = allData + a[i][3] + "\t";
			
			// test 3
			allData = allData + a[i][4] + "\t";
			
			// test 4
			allData = allData + a[i][5] + "\n";
		}
		
		return allData;
	}
	
}
