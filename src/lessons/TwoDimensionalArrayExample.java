package lessons;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		
		// variables
		double[][] inventory = new double[4][2];
		
		inventory[0][0] = 50;
		inventory[0][1] = 0.99;
		inventory[1][0] = 70;
		inventory[1][1] = 1.49;
		inventory[2][0] = 60;
		inventory[2][1] = 2.49;
		inventory[3][0] = 40;
		inventory[3][1] = 1.79;
		
		System.out.println(totalChocolateBars(inventory));
		System.out.println(totalValueInventory(inventory));
		
	}
	
	
	/*
	 *  DESCRIPTION - Returns total retail value of chocolate bars.
	 *  PARAMETERS - double[][] x
	 *  RETURN TYPE - double
	 */
	public static double totalValueInventory(double[][] x)  {
		
		double totalValue = 0.0;
		
		// loop through all rows
		for(int i=0; i<x.length; i++)  {
			
			totalValue = totalValue + (x[i][0] * x[i][1]);
		}
		
		return totalValue;
	}
	
	
	
	
	/*
	 * 	DESCRIPTION - Returns total number of chocolate bars in inventory.
	 *  PARAMETERS - double[][] x
	 * 	RETURN TYPE - double
	 */
	public static double totalChocolateBars(double[][] x)  {
	
		double totalChocolateBars = 0;
		
		for(int i=0; i<x.length; i++)  {
			
			totalChocolateBars = totalChocolateBars + x[i][0];
		}
		
		
		return totalChocolateBars;
	}
	
	
	
	// 1. How many chocolate bars do we have in the entire inventory?
	// 2. What is the total retail value of all the chocolate bars?

}
