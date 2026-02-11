package lessons;

public class TwoDimensionalArrays {

	public static void main(String[] args) {

		/*
		 * 2D Arrays are array's that hold arrays.
		 * Think of it like a spreadsheet with rows and columns.
		 * First identifier are the number of rows.
		 * Second identifier are the number of columns.
		 */
		
		// SYNTAX:
		// dataType[][] arrayIdentifier = new datatype[rowSize][columnSize]
		
		// Examples:
		String[][] foo = new String[3][2];
		
		// Assign data to 2D array:
		foo[0][0] = "cheese";
		foo[0][1] = "socks";
		foo[1][0] = "bar";
		foo[1][1] = "apples";
		foo[2][0] = "foo";
		foo[2][1] = "fubar";
		
		// access single element
		System.out.println(foo[1][0]);
		
		// print number of rows
		System.out.println("ROWS: " + foo.length);
		
		// print number of columns
		System.out.println("COLUMNS: " + foo[0].length);

		
		// loop through the rows
		for(int i=0; i<foo.length; i++)  {
			
			// loop through the columns
			for(int j=0; j<foo[0].length; j++)  {

				System.out.println(foo[i][j]);
			}
			
		}

		// Initializing 2D Array upon creation
		int[][] myArray =  {
				
			{2, 5, 2, 1, 6, 8, 43 },
			{2, 5, 2, 1 }, 
			{2, 5, 2, 1 , 34, 4, 45, 6, 76, 7, 87, 8}
		};
		
		System.out.println("ROWS: " + myArray.length);
		System.out.println("COLUMNS 0: " + myArray[0].length);
		System.out.println("COLUMNS 1: " + myArray[1].length);
		System.out.println("COLUMNS 2: " + myArray[2].length);
	}

}
