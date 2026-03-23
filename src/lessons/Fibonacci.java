package lessons;

public class Fibonacci {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8
		int n = 2;		
		System.out.println(fibonacciWhileLoop(n));
		System.out.println(fibonacciForLoop(n));
		System.out.println(fibonacciRecursive(n));
	}
	
	
	/*	DESCRIPTION - Returns value of Fibonacci sequence number for n>0.
	 * 				  Returns sentinal value (-1) for error cases.
	 *  PARAMETERS - int n
	 *  RETURN - int
	 */
	public static int fibonacciRecursive(int n)  {
	
		// variables
		int first = 0;
		int second = 1;
		
		// error case
		if (n < 1)
			return -1;
		
		// base/stop case(s)
		else if (n==1)
			return first;
		
		else if (n==2)
			return second;
		
		// processing
		return fibonacciRecursive(n-2) + fibonacciRecursive(n-1);	
	}
	
	
	/*	DESCRIPTION - Returns value of Fibonacci sequence number for n>0.
	 * 				  Returns sentinal value (-1) for error cases.
	 *  PARAMETERS - int n
	 *  RETURN - int
	 */
	public static int fibonacciForLoop(int n)  {
		
		// error case
		if (n<1)
			return -1;
		
		// variables
		int first = 0;
		int second = 1;
		int last = 0;
		
		// processing
		if (n == 1)
			return first;
		
		else if (n == 2)
			return second;
		
		for(int i=2; i<n; i++)  {
			last = first + second;
			first = second;
			second = last;
		}
		
		return last;
		
	}
	
	
	/*	DESCRIPTION - Returns value of Fibonacci sequence number for n>0.
	 * 				  Returns sentinal value (-1) for error cases.
	 *  PARAMETERS - int n
	 *  RETURN - int
	 */
	public static int fibonacciWhileLoop(int n)  {
		
		// error case
		if (n<1)
			return -1;
		
		// variables
		int first = 0;
		int second = 1;
		int last = 0;
		
		// processing
		if (n == 1)
			return first;
		
		else if (n == 2)
			return second;
		
		while (n > 2)  {
			last = first + second;
			first = second;
			second = last;
			n--;
		}
		
		return last;
	}

}
