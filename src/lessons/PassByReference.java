package lessons;

public class PassByReference {

	public static void main(String[] args) {
		
		int[] myArray = {13};
		
		changeIntegerInArray(myArray);
		
		System.out.println(myArray[0]);
	}

	
	public static void changeIntegerInArray(int[] a)  {
		
		a[0] = 435;
	}
	
}
