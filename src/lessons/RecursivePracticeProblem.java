package lessons;

public class RecursivePracticeProblem {

	public static void main(String[] args) {

		countUp(1, 4);
	}

	public static void countUp(int x, int y)  {
		
		// error case
		if(x > y)  {
			
			System.out.println(-1);
		}
			
		// base/stop case(s)
		if(x == y)  {
			
			System.out.println(x);
		}
		
		System.out.print(x);  // "calculation"
		countUp(x+1, y);  // recursive call
	}
}
