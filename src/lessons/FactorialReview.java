package lessons;

public class FactorialReview {

	public static void main(String[] args) {

		int n = 2;
		//System.out.println(factorialWhileLoop(n));
		//System.out.println(factorialForLoop(n));
		System.out.println(factorialRecursive(n));
		
	}

	
	// DESCRIPTION - Calculates n! for integers n>=0
	// PARAMETERS - int n
	// RETURN - int
	public static int factorialRecursive(int n)  {
	
		// error case, return sentinel value -1
		if (n < 0)
			return -1;
		
		// base / stop case
		else if ( n==0 || n==1 )
			return 1;
		
		return n * factorialRecursive(n-1);
	
	}
	
	/*
	 * 	factorialRecursive(-13) = -1
	 *  factorialRecursive(0) = 1
	 *  factorialRecursive(1) = 1
	 *  factorialRecursive(2) = 2
	 *  factorialRecursive(3) = 6
	 *  
	 *  
	 *  
	 */
	
	
	
	// DESCRIPTION - Calculates n! for integers n>=0
	// PARAMETERS - int n
	// RETURN - int
	public static int factorialForLoop(int n)  {
		
		// variables 
		int answer = 1;
		
		// error case, return sentinel value -1
		if (n < 0)
			return -1;
		
		// base cases
		if (n==0 || n==1)
			return answer;
		
		// processing
		for(int i=n; i>1; i--)
			answer = answer * i;
	
		return answer;	
	}
	
	// DESCRIPTION - Calculates n! for integers n>=0
	// PARAMETERS - int n
	// RETURN - int
	public static int factorialWhileLoop(int n)  {
		
		// variables 
		int answer = 1;
		
		// error case, return sentinel value -1
		if (n < 0)
			return -1;
		
		// base cases
		if (n==0 || n==1)
			return answer;
		
		// processing
		while (n > 1)
			answer = answer * n--;
		
		return answer;
	}
	
	
}
