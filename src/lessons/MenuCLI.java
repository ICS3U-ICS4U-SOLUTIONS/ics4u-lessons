package lessons;
import java.util.Scanner;

public class MenuCLI {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int userChoice = 0;
		final int DEPOSIT_CHOICE = 1;
		final int EXIT_CHOICE = 4;
		double balance = 0.0;
		double depositAmount = 0.0;
		
		while(userChoice != 4)  {
		
			// print menu
			System.out.println("Welcome to the bank.");
			System.out.println("Menu:");
			System.out.println("1. Deposit");
			System.out.println("2. Witdraw");
			System.out.println("3. Balance");
			System.out.println("4. Exit");
			System.out.println("Choice: ");
			
			try {
				
				userChoice = sc.nextInt();
			}
			
			catch(Exception e)  {
				
				System.out.println("Invalid entry.  Returning to main menu.");
			}
			
			if(userChoice == DEPOSIT_CHOICE)  {
				
				System.out.println("Enter amount to deposit: ");
				
				try {
					
					depositAmount = sc.nextDouble();
				}
				
				catch(Exception e)  {
					
					System.out.println("Invalid entry.  Returning to main menu.");
				}
						
				balance = depositMethod(depositAmount, balance);
			}
			
		}
	}
	
	
	/*
	 * DESCRIPTION - Adds deposit to balance.
	 * PARAMETERS - double x, double y
	 * RETURN TYPE - double
	 */
	public static double depositMethod(double x, double y)  {
		
		return  x + y;	
	}
	
	
	
	
}
