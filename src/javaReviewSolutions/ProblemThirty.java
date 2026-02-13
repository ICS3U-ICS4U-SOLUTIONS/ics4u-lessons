package javaReviewSolutions;

public class ProblemThirty {

	// find smallest of three numbers
	public static void main(String[] args) {
		
		int num1 = 13;
		int num2 = 14;
		int num3 = 6;
		
		System.out.println(smallestOfThree(num1, num2, num3));
		
	}

	// DESCRIPTION - returns the smallest of three integers
	// PARAMETERS - int x, int y, int z
	// RETURN TYPE - int
	public static int smallestOfThree(int x, int y, int z)  {
		
		return Math.min(Math.min(x, y), z);
	}

}
