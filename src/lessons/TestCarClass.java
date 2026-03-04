package lessons;
import templates.Car;

public class TestCarClass {

	public static void main(String[] args) {

		Car myCar1 = new Car();
		
		
		myCar1.setPrice(34232.99);
		System.out.println(myCar1.getPrice());
		
		myCar1.setMake("Beetle");
		System.out.println(myCar1.getMake());
		
		myCar1.setYear(2001);
		System.out.println(myCar1.getYear());
		
		myCar1.setMileage(122100);
		System.out.println(myCar1.getMileage());
		
		System.out.println(myCar1);
		
		Car myCar2 = new Car(23432.00,  "Honda", 2010, 94000);
		System.out.println(myCar1);
		
		
	}

}
