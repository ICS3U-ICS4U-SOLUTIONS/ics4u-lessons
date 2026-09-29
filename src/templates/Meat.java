package templates;

public class Meat extends Food {

	// data members
	private double gramsCreatine;
	
	// default constructor
	public Meat()  {
		
		super();
		this.gramsCreatine = 0;
	}
	
	// parameterized constructor
	public Meat(String co, String t, int ca, double cr)  {
		
		super(co, t, ca);
		this.gramsCreatine = cr;
	}
	
	// get methods
	public double getGramsCreatine()  {
		
		return this.gramsCreatine;
	}
	
	// set methods
	public void setGramsCreatine(double g)  {
		
		this.gramsCreatine = g;
	}
	
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.gramsCreatine;
	}
	
}
