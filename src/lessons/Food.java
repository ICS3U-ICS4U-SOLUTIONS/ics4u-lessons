package lessons;

public class Food {

	// data members
	String colour;
	String texture;
	int calories;
	
	// default constructor
	public Food()  {
		
		this.colour = "";
		this.texture = "";
		this.calories = 0;
	}
	
	// parameterized constructor
	public Food(String co, String t, int ca)  {
		
		this.colour = co;
		this.texture = t;
		this.calories = ca;
	}
	
	// get methods
	public String getColour()  {
		
		return this.colour;
	}
	
	public String getTexture()  {
		
		return this.texture;
	}
	
	public int getCalories()  {
		
		return this.calories;
	}
	
	// set methods
	public void setColour(String c)  {
		
		this.colour = c;
	}
	
	public void setTexture(String t)  {
		
		this.colour = t;
	}
	
	public void setCalories(int c)  {
		
		this.calories = c;
	}
	
	
	
	
	@Override
	public String toString()  {
		
		return super.toString() + "." + this.colour
				+ "." + this.texture + "." + this.calories;
	}
	
}
