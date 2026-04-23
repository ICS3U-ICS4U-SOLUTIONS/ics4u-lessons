package lessons;

public class Debugger {

	public static void main(String[] args) {

		System.out.println("Hello");
		System.out.println("World!");
		myMethod();
		System.out.println("foo");
		System.out.println("bar");
	}

	public static void myMethod()  {
		
		int localInt = 0;
		
		for(int i=0; i<10; i++)
		
			localInt = localInt + i;
	}
	
}
