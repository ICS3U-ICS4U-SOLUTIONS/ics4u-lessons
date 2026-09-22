package sandbox;

public class Casting {

	public static void main(String[] args) {

		// casting - changing 1 type to another
		
		// int to String
		int myInteger1 = 13;
		String myString1 = Integer.toString(myInteger1);

		// String to int
		String myString2 = "7";
		int myInteger2 = Integer.parseInt(myString2);
		
		// double to String
		double myDouble3 = 13.3;
		String myString3 = Double.toString(myDouble3);
		
		// String to double
		String myString4 = "56.5";
		double myDouble4 = Double.parseDouble(myString4);
		
		// int to double (auto-casted / auto-promoted, no data loss)
		int myInteger5 = 7;
		double myDouble5 = 7;
		
		// double to int (truncates d
		double myDouble6 = 4.9;
		int myInteger6 = (int)myDouble6;
		
		System.out.println(myInteger6);	
	}

}
