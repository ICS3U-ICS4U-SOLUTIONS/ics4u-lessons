package fileIO;
import java.util.ArrayList;
import java.io.*;

public class FileInput {

	public static void main(String[] args) {

		// LESSON - reading .txt file into an ArrayList
		//			then convert ArrayList to an Array
	
		// variables
		ArrayList<String> colours = new ArrayList();
		BufferedReader br = null;
		String word = "";
		
		try  {
			
			// open file
			br = new BufferedReader(new FileReader("colours.txt"));
			
			// iterate through file (in the buffer) until we hit end of file (null)
			// add each word into ArrayList
			while ( (word = br.readLine()) != null ) {
				
				colours.add(word);
			}
			
			// close the file (memory management)
			br.close();
		}
		
		catch (Exception e)  {
			
			e.printStackTrace();
		}

		// print ArrayList
		for (int i=0; i<colours.size(); i++)  {
			
			System.out.println(colours.get(i));
		}
		
		// create Array, move contents of ArrayList to Array, clear ArrayList
		String[] myArray = new String[colours.size()];
		colours.toArray(myArray);
		colours.clear();
		
		// print Array
		for(int i=0; i<myArray.length; i++)  {
			
			System.out.println(myArray[i]);
		}
			
	}

}
