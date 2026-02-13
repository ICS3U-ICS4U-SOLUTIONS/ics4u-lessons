package javaReviewSolutions;

public class ProblemThirtyThree {

	public static void main(String[] args) {
		
		System.out.println(vowelCount("hippopotamus"));
	}
	
	// DESSCRIPTION - Counts all vowels in a String 
	// PARAMETERS - String s
	// RETURN TYPE - int
	public static int vowelCount(String s)  {
		
		int count = 0;
		
		for (int i=0; i<s.length(); i++)  {
			
			if ( (s.charAt(i) == 'a') 
				 ||  (s.charAt(i) == 'e') 
				 ||  (s.charAt(i) == 'i') 
				 ||  (s.charAt(i) == 'o') 
				 ||  (s.charAt(i) == 'u') )  {
	
				count++;
			}
		}
		
		return count;
	}

}
