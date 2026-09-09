package sandbox;
import java.util.Scanner;

public class U2A1_1DArrays {

	public static void main(String[] args) {

		// variables
		int choice = 0;
		int[] myArray = new int[12];
		
		
		while(choice !=5 )  {
		
			choice = displayMenuAndReturnChoice();
			
			if (choice == 1)
				enterTwelveIntegers(myArray);
			
		}
	
		System.out.println("Exiting program.");
	}
	
	
	
	/*  PRACTICE ASSIGNMENT
    1. Store 12 integers into an array.
	2. List all integers in array and the sum of all integers.
	3. List even integers in array and the sum of even integers.
	4. List odd integers in array and the sum of odd integers.
	5. Exit

 */
	

	// DESCRIPTION - Displays main menu, returns user choice (1-5)
	// PARAMETERS - NA
	// RETURN TYPE - int
	public static int displayMenuAndReturnChoice()  {
		
		// variables
		int selection = 0;
		Scanner sc = new Scanner(System.in);
		
		while ((selection < 1) || (selection > 5))  {
			
			System.out.println("Menu");
			System.out.println("1. Enter 12 integers.");
			System.out.println("2. List 12 integers and sum.");
			System.out.println("3. List even integers and sum.");
			System.out.println("4. List odd integers and sum.");
			System.out.println("5. Exit.");
			
			try  {
				
				String temp = sc.nextLine();
				selection = Integer.parseInt(temp);
			}
			
			catch(Exception e)  {
				
				System.out.println("Invalid choice.");
			}
		}

		return selection;	// temporary
	}
	
	
	// DESCRIPTION - Prompts user to enter 12 ints, stores in array
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void enterTwelveIntegers(int[] a)  {
		
		// variables
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++)  {
			
			
		}

		

	}
	
	
	// DESCRIPTION - Lists all integers in array, displays sum
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void listAllIntegersAndSum(int[] a)  {
		
	
	}
	
	
	// DESCRIPTION - Lists even integers in array, displays sum
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void listEvenIntegersAndSum(int[] a)  {
		
		
	}
	
	
	// DESCRIPTION - Lists odd integers in array, displays sum
	// PARAMETERS - int[] a
	// RETURN TYPE - void
	public static void listOddIntegersAndSum(int[] a)  {
		
		
	}
	
	
}
