package lessons;

public class StringCompareToMethod {

	public static void main(String[] args) {

		// Compares two Strings lexicographically.
		// Single letters: 
		// 0 - means they are the same
		// negative value - object is to the left of argument
		// positive value - object is to the right of argument
	//	System.out.println("z".compareTo("a"));   
		
		// Multiple letters: compares first mis-matched letters
		// everything else is ignored
	/*	System.out.println("aa".compareTo("ab"));
		System.out.println( "xxb".compareTo("xxa"));
		System.out.println( "abc".compareTo("abc"));
		System.out.println( "xyxya".compareTo("xyxyc"));
		System.out.println( "xyxyc".compareTo("xyxya"));
		System.out.println( "xyxyx".compareTo("xyxyx"));
		System.out.println( "xyxyaxyxy".compareTo("xyxydxyxy"));
	*/	
		
		// If the length of the Strings are different:
	//	System.out.println("a".compareTo("aa"));
	//	System.out.println("abc".compareTo("abcdef"));
	//	System.out.println("abcdef".compareTo("abc"));
		
		// case sensitivity
		System.out.println("A".compareToIgnoreCase("a"));
	}

}
