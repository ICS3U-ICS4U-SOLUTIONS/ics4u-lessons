package sandbox;

public class RoundingToDecimal {

	public static void main(String[] args) {

		double price = 12.345;
	
		price = price * 100;
		price = Math.round(price);
		price = price / 100;
		
		System.out.println(price);
	}

}
