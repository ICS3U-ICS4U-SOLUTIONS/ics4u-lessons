package templates;

public class Car extends Vehicle {

	// data members
	private int mileage;
	
	// default constructor
	public Car()  {
		
		super();
		this.mileage = 0;
	}
	
	// DESCRIPTION - parameterized constructor
	// PARAMETERS - double p, String ma, int y, int mi
	// RETURN - void
	public Car(double p, String ma, int y, int mi)  {
		
		super(p, ma, y);
		this.mileage = mi;
	}
	
	// get method
	public int getMileage()  {
		
		return this.mileage;
	}
	
	// set method
	public void setMileage(int mi)  {
		
		this.mileage = mi;
	}
	
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.mileage;
	}
	
}
