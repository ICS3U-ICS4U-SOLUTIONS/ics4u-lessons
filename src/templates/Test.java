package templates;

public class Test {

	public static void main(String[] args) {

		Car[] myArray = new Car[5];
		
	
		
		myArray[0] = new Car(35400.00, "Subaru", 2024, 32000);
		myArray[1] = new Car(3243200.00, "Toyota", 2023, 32000);
				
				
		System.out.println(myArray[0].getMake());
	

	}

}
