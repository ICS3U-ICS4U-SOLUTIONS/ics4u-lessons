package lessons;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {

		// variables
		final int ROWS = 4;
		final int COLS = 2;
		double[][] inventory = new double[ROWS][COLS];
		double numBars = 0;
		double totalRetailValue = 0.0;
		
		// Mars Bars
		inventory[0][0] = 5;  // quantity
		inventory[0][1] = 1;  // price
		
		// Kit Kat
		inventory[1][0] = 12;  // quantity
		inventory[1][1] = 0.5; // price

		// O Henry
		inventory[2][0] = 4;  // quantity
		inventory[2][1] = 2.5;// price

		// Snickers
		inventory[3][0] = 20;  // quantity
		inventory[3][1] = 3;   // price
		
		// calculate total number chocolate bars
		for(int i=0; i<inventory.length; i++)  {
			
			numBars = numBars + inventory[i][0];
		}
		
		System.out.println("Total chocolate bars: " + (int)numBars);

		// total retail value
		for(int i=0; i<inventory.length; i++)  {
	
			totalRetailValue = totalRetailValue + (inventory[i][0] * inventory[i][1]);
		}
		
		System.out.println("Total retail value: $" + totalRetailValue);
		
	}

}
