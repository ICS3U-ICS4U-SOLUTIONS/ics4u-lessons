package lessons;

public class Factorial {

	public static void main(String[] args) {

		int n = 3;
		
		System.out.println(factorialWhileLoop(n));
		System.out.println(factorialForLoop(n));
		System.out.println(factorialRecursive(n));
	}
	
	/* DESCRIPTION - Returns n! for integers n>=0. Returns sentinal value (-1) for errors.
	 * PARAMETERS - int n
	 * RETURN - int
	 */
	public static int factorialRecursive(int n)  {
	
		// error case, n<0
		if (n < 0)
			return -1;
		
		// base/stop case
		else if (n==0)
			return 1;
		
		// a recursive method will call itself
		else
			return n * factorialRecursive(n-1);
		
	}
	
	
	/* DESCRIPTION - Returns n! for integers n>=0. Returns sentinal value (-1) for errors.
	 * PARAMETERS - int n
	 * RETURN - int
	 */
	public static int factorialForLoop(int n)  {

		// variable(s)
		int answer = 1;
		
		// error case, n<0
		if (n < 0)
			return -1;

		// smallest case (base case)
		if (n==0 || n==1)
			return answer;
		
		// processing
		for(int i=n; i>1; i--)
			answer = answer * i;
		
		return answer;
	}

	/* DESCRIPTION - Returns n! for integers n>=0. Returns sentinal value (-1) for errors.
	 * PARAMETERS - int n
	 * RETURN - int
	 */
	public static int factorialWhileLoop(int n)  {
		
		// variable(s)
		int answer = 1;
		
		// error case, n<0
		if (n < 0)
			return -1;

		// smallest case (base case)
		if (n==0 || n==1)
			return answer;
		
		// processing
		while(n > 1) 
			answer = answer * n--;
		
		return answer;
	}
	
	
}
