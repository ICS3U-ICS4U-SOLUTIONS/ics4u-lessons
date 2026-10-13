package lessons;

public class GreatestCommonFactor {

	public static void main(String[] args) {

		System.out.println(calculateGCF(18, 4));
	}

	
	// DESCRIPTION - Calculates GCF for 2 positive integers, where x > y.
	// PARAMETERS - int x, int y
	// RETURN - int
	public static int calculateGCF(int x, int y)  {
		
		// error case(s) - first number must be bigger
		if (x < y)
			return -1;
		
		// error case(s) - can't have 0's or negatives
		if (x < 1 || y < 1)
			return -1;
		
		// base/stop case - both numbers are same
		if (x == y)
			return x;
		
		// base/stop case - y is GCF
		if (x%y == 0)
			return y;
		
		// recursive call
		return calculateGCF(y, x%y);
	}
	
}
