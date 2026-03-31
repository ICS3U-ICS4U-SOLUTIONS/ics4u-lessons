package recursionSolutions;

public class Fibonacci {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8
		int n = 6;
		System.out.println(fibonacciWhileLoop(n));
		System.out.println(fibonacciForLoop(n));
		System.out.println(fibonacciRecursive(n));
	}
	
	
	// DESCRIPTION - Returns value of Fibonacci sequence number.
	//				 Returns -1 for negative input.
	// PARAMETERS - int n
	// RETURN TYPE - int
	public static int fibonacciWhileLoop(int x)  {
		
		// variables
		int first = 0;
		int second = 1;
		int last = 0;
		
		// error case
		if (x < 1)
			return -1;
		
		if (x == 1)
			return first;
		
		if (x == 2)
			return second;
		
		while (x > 2)  {
			
			last = first + second;
			first = second;
			second = last;
			x--;
		}
		
		return last;
	}
	
	
	public static int fibonacciForLoop(int n)  {
		
		// variables
		int first = 0;
		int second = 1;
		int last = 0;
		
		// error case
		if (n < 1)
			return -1;
		
		if (n == 1)
			return first;

		if (n == 2)
			return second;

		for (int i=2; i<n; i++)  {
			
			last = first + second;
			first = second;
			second = last;
		}
		
		return last;
	}
	
	
	public static int fibonacciRecursive(int x)  {
		
		// variables
		int first = 0;
		int second = 1; 
		
		// error case
		if (x < 1)
			return -1;
		
		// base cases
		if (x == 1)       // x = 0
			return first;
		
		if (x == 2)
			return second;     // x = 1
		
		// SINCE: fib(1) = 0 and fib(2) = 1
		// THEN:  fib(3) = fib(1) + fib(2)
		// THEREFORE:
		return fibonacciRecursive(x-2) + fibonacciRecursive(x-1);
	}
}
