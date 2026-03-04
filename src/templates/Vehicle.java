package templates;

abstract class Vehicle {
	
	// data members
	protected double price;
	protected String make;
	protected int year;
	
	// default constructor
	public Vehicle()  {
		
		this.price = 0.0;
		this.make = "";
		this.year = 0;
	}

	
	// DESCRIPTION - parameterized constructor
	// PARAMETERS - double p, String m, int y
	// RETURN - void
	public Vehicle(double p, String ma, int y)  {
		
		this.price = p;
		this.make= ma;
		this.year = y;
	}
	
	// get methods
	public double getPrice()  {
		
		return this.price;
	}
	
	public String getMake()  {
		
		return this.make;
	}
	
	public int getYear()  {
		
		return this.year;
	}
	
	// set methods
	public void setPrice(double p)  {
		
		this.price = p;
	}
	
	public void setMake(String ma)  {
		
		this.make = ma;
	}
	
	public void setYear(int y)  {
		
		this.year = y;
	}
	
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.price + "." + this.make 
				+ "." + this.year;
	}
	

}
