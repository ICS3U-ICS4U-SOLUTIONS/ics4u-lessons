package recursionSolutions;

public class DisplayLetters {

	public static void main(String[] args) {

		displayLetters(0, "fubar");
	}

	/*	DESCRIPTION - Displays all letters in String on separate lines.
	 * 	PARAMETERS - int n, String s
	 *  RETURN - void
	 */
	public static void displayLetters(int index, String s)  {
		
		// error case 1
		if (index<0)
			return;
	
		// error case 2
		if (index >= s.length())
			return;
		
		// base/stop case
		if (index>s.length()-1)
			return;
		
		// processing
		System.out.println(s.charAt(index));
		displayLetters(index+1, s);
	}
	
}
