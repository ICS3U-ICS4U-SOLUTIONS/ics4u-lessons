package javaReviewSolutions;

public class ProblemTwentyFive {

	// reverse a String
	public static void main(String[] args) {
		
		// variables
		String sentence = "The quick brown fox";
		String reversedString = "";

		// convert String to array 
		char[] letters = sentence.toCharArray();
		
		// iterate through array backwards, append to new String
		for (int i=sentence.length() - 1; i>=0; i--)  {
			
			reversedString = reversedString + letters[i];
		}
		
		System.out.println(reversedString);
		
		
		

	}

}
