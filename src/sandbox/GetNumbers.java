package sandbox;

import java.util.Scanner;

public class GetNumbers {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String[] myList = new String[3];
				
		for(int i=0; i<myList.length; i++)  {
					
			System.out.println("Enter name " + (i) + ":");
			myList[0] = sc.next();
		}

	}

}
