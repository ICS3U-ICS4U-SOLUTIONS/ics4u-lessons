package recursionSolutions;

public class Factorial {

	public static void main(String[] args) {

		int n = 3;
		
		//System.out.println(factorialForLoop(n));
		//System.out.println(factorialWhileLoop(n));
		System.out.println(factorialRecursive(4));
		
	}
	
	
	// DESCRIPTION - Returns n!, only for positive integers.
	// PARAMETERS - int n
	// RETURN TYPE - int 
	public static int factorialForLoop(int n)  {
		
		int answer = 1;
		
		// error case (NOTE - negative factorials are possible)
		if (n < 0)
			return -1;
		
		// exception case
		else if (n == 0)
			return answer;
	
		// calculate
		for (int i=n; i>0; i--)
			answer = answer * i;

		return answer;
	}
	
	
	// DESCRIPTION - Returns n!, only for positive integers.
	// PARAMETERS - int n
	// RETURN TYPE - int 
	public static int factorialWhileLoop(int n)  {
		
		int answer = 1;
		
		// error case (NOTE - negative factorials are possible)
		if (n < 0)
			return -1;
		
		// exception case
		else if (n == 0)
			return answer;
	
		// calculate
		while (n > 0) 
			answer = answer * n--;

		return answer;
	}
	
	
	// DESCRIPTION - Returns n!, only for positive integers.
	// PARAMETERS - int n
	// RETURN TYPE - int 
	public static int factorialRecursive(int n)  {
		
		// error case
		if (n < 0)  
			return -1;
		
		// base case (stop case / stop condition)
		else if (n == 0)
			return 1;
		
		else
			return n * factorialRecursive(n-1);
	}
}
