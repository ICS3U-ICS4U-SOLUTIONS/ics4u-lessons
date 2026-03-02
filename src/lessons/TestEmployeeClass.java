package lessons;
import objects.Employee;

public class TestEmployeeClass {

	public static void main(String[] args) {

		// variables
		Employee myEmployee1 = new Employee();
		Employee myEmployee2 = new Employee();
		Employee myEmployee3 = new Employee("Matthew", "Douglas", 500);
		Employee myEmployee4 = new Employee(453);
				
		// set employee1 data members
		myEmployee1.setFirstName("John");
		myEmployee1.setLastName("Doe");
		myEmployee1.setEmployeeNumber(13);
		System.out.println(myEmployee1.getFirstName());
		System.out.println(myEmployee1.getLastName());
		System.out.println(myEmployee1.getEmployeeNumber());

		// set employee2 data members
		myEmployee2.setFirstName("Jane");
		myEmployee2.setLastName("Mary");
		myEmployee2.setEmployeeNumber(7);
		System.out.println(myEmployee2.getFirstName());
		System.out.println(myEmployee2.getLastName());
		System.out.println(myEmployee2.getEmployeeNumber());
		
		// display employee3 data members
		System.out.println(myEmployee3.getFirstName());
		System.out.println(myEmployee3.getLastName());
		System.out.println(myEmployee3.getEmployeeNumber());
		
		// print myEmployee1
		System.out.println("MYEMLOYEE1: ");
		System.out.println(myEmployee1);
		System.out.println(myEmployee1.toString());
	}

}
