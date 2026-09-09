package lessons;

public class PassByValue {

	public static void main(String[] args) {

		int myInteger = 13;
		
		changeInteger(myInteger);

		System.out.println(myInteger);
	}

	
	public static int changeInteger(int a)  {
		
		a = 123123123;
		return a;
	}
	
}
