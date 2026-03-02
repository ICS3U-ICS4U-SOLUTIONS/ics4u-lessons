package objects;

public class Employee {
	
	// data members
	String firstName;
	String lastName;
	int employeeNumber;
	
	// default constructor (no parameters, initialize with default values)
	public Employee()  {
		
		this.firstName = "";
		this.lastName = "";
		this.employeeNumber = 0;
	}
	
	// parameterized constructor (used to initialize object)
	public Employee(String fn, String ln, int em)  {
		
		this.firstName = fn;
		this.lastName = ln;
		this.employeeNumber = em;
	}
	
	// get methods
	public String getFirstName()  {
		
		return this.firstName;
	}
	
	public String getLastName()  {
		
		return this.lastName;
	}
	
	public int getEmployeeNumber()  {
		
		return this.employeeNumber;
	}
	
	// set methods
	public void setFirstName(String fn)  {
		
		this.firstName = fn;
	}

	public void setLastName(String ln)  {
		
		this.lastName = ln;
	}
	
	public void setEmployeeNumber(int en)  {
		
		this.employeeNumber = en;
	}
	
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.firstName + "." + this.lastName
				+ this.employeeNumber;
	}
	
}
