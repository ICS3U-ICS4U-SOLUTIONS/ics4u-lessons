package lessons;

public class TestFoodClass {

	public static void main(String[] args) {

		Food myFood = new Food();
	
		myFood.setCalories(430);
		myFood.setColour("Blue");
		myFood.setTexture("Crunchy");
	
		
		System.out.println(myFood);
		
		Meat myMeat = new Meat();
		System.out.println(myMeat);
		
	}

}
