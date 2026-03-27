package recursionSolutions;

import templates.Employee;

public class DisplayEmployees {

	public static void main(String[] args) {

		
		Employee[] employeeDatabase = new Employee[5];
		employeeDatabase[0] = new Employee("John", "Doe", 35002);
		employeeDatabase[1] = new Employee("Fabio", "Doe", 45030);
		employeeDatabase[2] = new Employee("Mary", "Doe", 33400);
		employeeDatabase[3] = new Employee("Olivia", "Doe", 65000);
		employeeDatabase[4] = new Employee("Tom", "Doe", 35070);
		
		displayEmployeeNames(0, employeeDatabase);	

	}
	
	/*	DESCRIPTION - Displays all First and Last names of Employee objects in array.
	 * 	PARAMETERS - int index, Employee[] array
	 *  RETURN - void
	 */
	public static void displayEmployeeNames(int index, Employee[] array)  {
		
		// error case 1
		if (index<0)
			return;
	
		// error case 2
		if (index >= array.length)
			return;
		
		// base/stop case
		if (index>array.length-1)
			return;
		
		// processing
		System.out.println(array[index].getFirstName() + " " + array[index].getLastName());
		displayEmployeeNames(index+1, array);
	}

}
