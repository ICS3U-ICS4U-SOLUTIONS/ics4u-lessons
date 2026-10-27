package studentDatabaseSolutions;

public class Student extends Person {
	
	// data members
	private String grade;

	// default constructor
	public Student()  {
		
		super();
		this.grade = "";
	}
	
	// parameterized constructor
	public Student(String fn, String ln, String g)  {
	
		super(fn, ln);
		this.grade = g;
	}
	
	// get method
	public String getGrade()  {
		
		return this.grade;
	}
	

	// set method
	public void setGrade(String g)  {
		
		this.grade = g;
	}
	

	// over-ride .toString()
	public String toString()  {
		
		return super.toString() + "." + this.grade;
	}
	
}