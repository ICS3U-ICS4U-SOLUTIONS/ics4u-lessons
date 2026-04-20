package lessons;

public class Pointers {

	public static void main(String[] args) {

		int myInteger = 7;
		passByValue(myInteger);
		System.out.println(myInteger);
		
		int[] myArray = {7, 13};
		passByReference(myArray);
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
	}
	
	// When you pass an ARRAY as a PARAMETER into a method, you're
	// copying the MEMORY ADDRESS (a.k.a. reference or pointer) of 
	// the ARRAY into the method.  When you modify the contents of
	// the ARRAY, the values in the array actually CHANGE.
	public static void passByReference(int[] a)  {
		
		a[0] = 88;
		a[1] = 99;
	}
	
	// When you pass a PARAMETER into a method, you're actually
	// making a copy of the ARGUMENT into the local variable.
	public static void passByValue(int n)  {
		
		n = 13;
	}

}
