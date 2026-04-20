package lessons;
import lessons.MyMethods;

public class TestSwapMethod {

	public static void main(String[] args) {


		int[] myArray = {6, 2, 5, 7, 0, 1, 9, 8, 3, 4};
		
		for(int i=0; i<myArray.length; i++)  {
		
			System.out.print(myArray[i] + " ");
		}
		
		MyMethods.swapIntegers(myArray, 2, 7);
		System.out.println();
		
		for(int i=0; i<myArray.length; i++)  {
			
			System.out.print(myArray[i] + " ");
		}
	}

}
