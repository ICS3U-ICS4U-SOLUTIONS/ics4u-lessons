package javaReviewSolutions;

public class ProblemThirtyFive {

	public static void main(String[] args) {
		
		System.out.println(sumDigits(113));
	}

	
	// DESSCRIPTION - Sum digits in an integer 
	// PARAMETERS - int n
	// RETURN TYPE - int
	public static int sumDigits(int n)  {
		
		int sum = 0;
		
		while (n > 0)  {
			
			sum = sum + (n % 10);
			n = n / 10;
		}
		
		return sum;
	}
}
