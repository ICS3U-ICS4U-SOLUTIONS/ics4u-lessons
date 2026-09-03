package javaReviewSolutions;

import java.util.Scanner;

public class ProblemFour {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int product = 0;
		
		System.out.println("Enter first num: ");
		num1 = sc.nextInt();

		System.out.println("Enter seccond num: ");
		num2 = sc.nextInt();
		
		// processing
		product = num1 * num2;
		
		// output
		System.out.println(product);
		
	}

}
