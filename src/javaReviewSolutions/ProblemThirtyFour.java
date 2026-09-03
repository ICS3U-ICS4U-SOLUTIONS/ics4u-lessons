package javaReviewSolutions;

public class ProblemThirtyFour {

	public static void main(String[] args) {
		
		
		System.out.println(wordCount("Zack always eats."));

	}

	// DESSCRIPTION - Counts all words in a String 
	// PARAMETERS - String s
	// RETURN TYPE - int
	public static int wordCount(String s)  {
		
		int counter = 0;
		
		for (int i=0; i<s.length(); i++)  {
			
			if (s.charAt(i) == ' ')
				counter++;
		}
		
		counter++;
		
		return counter;
	}
	
}
