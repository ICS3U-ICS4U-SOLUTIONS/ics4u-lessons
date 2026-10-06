package lessons;

public class FibonacciReview {

	public static void main(String[] args) {

		// 	0 	1 	1 	2 	3 	5 	8	 (fibonacci sequence)
		//  1	2	3	4	5	6	7    (sequence numbers)
		
		int n = 7;
	//	System.out.println(fibonacciWhileLoop(n));
		System.out.println(fibonacciForLoop(n));

		
	}

	// DESCRIPTION - Returns value of Fibonacci sequence number.
	// PARAMETERS - int n
	// RETURN - int
	public static int fibonacciForLoop(int n)  {
	
		// variables
		int first = 0;
		int second = 1;
		int last = 0;
		
		// error case
		if (n<1)
			return -1;
		
		else if (n == 1)
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
	
	// DESCRIPTION - Returns value of Fibonacci sequence number.
	// PARAMETERS - int n
	// RETURN - int
	public static int fibonacciWhileLoop(int n)  {
		
		// variables
		int first = 0;
		int second = 1;
		int last = 0;
		
		// error case
		if (n<1)
			return -1;
		
		else if (n == 1)
			return first;
		
		else if (n == 2)
			return second;
		
		while (n>2)  {
			
			last = first + second;
			first = second;
			second = last;
			n--;
		}
		
		return last;
	}
	
	
	
}
