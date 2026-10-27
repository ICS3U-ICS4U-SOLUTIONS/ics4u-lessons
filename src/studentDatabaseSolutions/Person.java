package studentDatabaseSolutions;

public abstract class Person {
	
	// variables
	private String firstName;
	private String lastName;
	
	// default constructor
	public Person()  {
		
		this.firstName = "";
		this.lastName = "";
	}

	// parameterized constructor
	public Person(String fn, String ln)  {
		
		this.firstName = fn;
		this.lastName = ln;
	}
	
	// get methods
	public String getFirstName()  {
		return this.firstName;
	}
	
	public String getLastName()  {
		return this.lastName;
	}
	
	// set methods
	public void setFirstName(String fn)  {
		this.firstName = fn;
	}
	
	public void setLastName(String ln)  {
		this.lastName = ln;
	}
	
	// over-ride .toString()
	public String toString()  {
		return this.firstName + "." + this.lastName;
	}
	
}
