package javaReviewSolutions;

public class ProblemTwentySix {

	// counts letters, spaces, numbers and other chars in String
	public static void main(String[] args) {

		// variables
		String sentence = "No phones in %^&& class 1986 or food or drinks Zack";
		int letters = 0;
		int numbers = 0;
		int spaces = 0;
		int other = 0;
		
		// iterate through sentence
		
		for (int i=0; i< sentence.length(); i++)  {
		
			if (Character.isLetter(sentence.charAt(i)) == true) {
				letters++;
			}
			
			else if (Character.isDigit(sentence.charAt(i)) == true) {
				numbers++;
			}
			
			else if (Character.isSpaceChar(sentence.charAt(i)) == true) {
				spaces++;
			}
			
			else
				other++;
		}
	
		System.out.println("Letters: " + letters);
		System.out.println("Numbers: " + numbers);
		System.out.println("Spaces: " + spaces);
		System.out.println("Other: " + other);
	}

}
