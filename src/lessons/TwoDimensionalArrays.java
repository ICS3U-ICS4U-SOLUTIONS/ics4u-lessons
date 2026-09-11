package lessons;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		/* 	Two Dimensional Arrays
		
			Array of Arrays.
			Like a Spreadsheet with rows and columns.
			First Identifier are rows, second are columns.
			
			SYNTAX:
			datatype[][] name = new dataType[rows][cols]
		*/
		
		// Example
		int[][] myIntegers = new int[4][6];
		
		// assigning data
		myIntegers[0][0] = 13;
		myIntegers[0][1] = 7;
		myIntegers[0][2] = 4;
		
	//	System.out.println(myIntegers[0][4]);
		
		// determining number of rows
	//	System.out.println(myIntegers.length);
		
		// determining number cols
	//	System.out.println(myIntegers[0].length);
		
		// initializing 2-D arrays with data
		double[][] myDoubles = {
				{2.3, 1.1, 3.2}, {5.5, 4.3, 1.2}
		};
		
	//	System.out.println(myDoubles[1][2]);
		
		// print entire contents of 2D array
		// first loop is for rows
		for(int i=0; i<myDoubles.length; i++) {
			
			// nested loop for cols
			for(int j=0; j<myDoubles[0].length; j++)  {
				
				System.out.println(myDoubles[i][j]);
			}
			
		}
		
	}

}
