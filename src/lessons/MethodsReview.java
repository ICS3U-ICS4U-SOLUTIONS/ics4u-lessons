package lessons;

public class MethodsReview {

	public static void main(String[] args) {

		//printHelloWorld();
		
		int foo = sumOfThreeNumbers(2, 4, 1);
		
	}
	
	
	//	DESCRIPTION - Returns sum of double arguments.
	// 	PARAMETERS - double x, double y, idoublent z
	//  RETURN - double
	public static double sumOfThreeNumbers(double x, double y, double z)  {
		
		return x + y + z;
	}
	
	
	//	DESCRIPTION - Returns sum of int arguments.
	// 	PARAMETERS - int x, int y, int z
	//  RETURN - int
	public static int sumOfThreeNumbers(int x, int y, int z)  {
		
		return x + y + z;
	}
	

	//	DESCRIPTION - Displays "Hello World!" to console.
	// 	PARAMETERS - none
	//  RETURN - void
	public static void printHelloWorld()  {
		
		System.out.println("Hello World!");
	}
	
}
