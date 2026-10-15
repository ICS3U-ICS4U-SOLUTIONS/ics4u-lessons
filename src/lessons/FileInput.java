package lessons;
import java.util.ArrayList;
import java.io.*;

public class FileInput {

	public static void main(String[] args) {

		// variables
		ArrayList<String> colours = new ArrayList();
		BufferedReader br = null;
		String word = "";
		
		// must use try/catch block to read files
		try  {
			
			// place .txt file under src folder in Eclipse
			// load file into memory
			br = new BufferedReader(new FileReader("src/colours.txt")); 
			
			// read contents of text file from memory, line-by-line until EOF
			// add each word to ArrayList
			while( (word = br.readLine()) != null )  {
				
				colours.add(word);
			}
								
			br.close();
		}
		
		catch(Exception e)  {
			
			System.out.println("Failed to read file.");
		}
		
		// temp print ArrayList to see what's inside
//		for(int i=0; i<colours.size(); i++)
//			System.out.println(colours.get(i));
		
		// convert ArrayList to Array
		String[] myArray = new String[colours.size()];
		
		// copy all elements from ArrayList to Array
		colours.toArray(myArray);
		
		// temp print Array to see what's inside
		for(int i=0; i<myArray.length; i++)
			System.out.println(myArray[i]);
		
		// clear ArrayList
		colours.clear();
	}

}
