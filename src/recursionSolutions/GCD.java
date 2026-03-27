package recursionSolutions;

public class GCD {

	public static void main(String[] args) {
	
		System.out.println(GCD(9, 3));
	}
	
	
	public static int GCD(int x, int y)  {
		
		// error case
		if (x < y)
			return -1;
		
		// base cases
		else if (x == y)
			return x;
		
		else if (y == 0)
			return x;
		
		// recursive call
		else
			return GCD(y, x%y);
	}
	

}
