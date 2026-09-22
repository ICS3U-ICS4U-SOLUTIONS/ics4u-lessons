package sandbox;

public class Methods {

	public static void main(String[] args) {


		helloWorld();	
		
		System.out.println(addTwoIntegers(1, 2));
		
	}
	
	
	// DESCRIPTION - Returns sum of a plus b.
	// PARAMETERS - int a, int b
	// RETURN - int
	public static int addTwoIntegers(int a, int b)  {
		
		
		return a + b;
	}
	
	
	// DESCRIPTION - Displays "Hello World!" to console
	// PARAMETERS - none
	// RETURN - void
	public static void helloWorld()  {
		
		System.out.println("Hello World!");
	}
	

}
