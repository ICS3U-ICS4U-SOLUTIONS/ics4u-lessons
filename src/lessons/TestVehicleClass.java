package lessons;
import templates.Car;
import templates.Vehicle;

public class TestVehicleClass {

	public static void main(String[] args) {

		Vehicle myVehicle = new Vehicle(23432.00, "Honda", 2010);
		System.out.println(myVehicle);
	}

}
