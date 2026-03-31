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
		if (x == y)
			return x;
		
		if (y == 0)
			return x;
		
		// recursive call
		return GCD(y, x%y);
	}
	

}
