package templates;

public class Car {

	// data members
	private double price;
	private String make;
	private int year;
	private int mileage;
	
	// default constructor
	public Car()  {
		
		this.price = 0.0;
		this.make = "";
		this.year = 0;
		this.mileage = 0;
	}

	
	// DESCRIPTION - parameterized constructor
	// PARAMETERS - double p, String m, int y, int m
	// RETURN - void
	public Car(double p, String ma, int y, int mi)  {
		
		this.price = p;
		this.make= ma;
		this.year = y;
		this.mileage = mi;
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
	
	public int getMileage()  {
		
		return this.mileage;
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
	
	public void setMileage(int mi)  {
		
		this.mileage = mi;
	}
	
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.price + "." + this.make 
				+ "." + this.year + "." + this.mileage;
	}
	
}
