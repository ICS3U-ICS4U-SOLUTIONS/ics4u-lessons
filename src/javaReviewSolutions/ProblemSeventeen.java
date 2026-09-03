package javaReviewSolutions;

public class ProblemSeventeen {

	public static void main(String[] args) {

		// variables
		String binaryString = "1010";
		int decimal = 0;
		String hexString = "";
		
		// convert binary String to decimal
		decimal = Integer.parseInt(binaryString, 2);

		// convert decimal to Hex
		hexString = Integer.toHexString(decimal);
		
		// print decimal
		System.out.println(decimal);
		
		
		

	}

}
