package lessons;

import java.util.ArrayList;
import java.io.*;

public class FileOutput {

	public static void main(String[] args) {

		// variables
		String[] food = {"milk", "bread", "butter", "cheese", "yogurt"};

		// must use try/catch when writing data to files
		try  {
			
			// create file
			FileOutputStream fout = new FileOutputStream("C:\\users\\e28166\\desktop\\food.txt" );
			
			// create buffer for file
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			// used to write contents from buffer/memory to file
			OutputStreamWriter out = new OutputStreamWriter(bout);

			// write contents of array to file
			for(int i=0; i<food.length; i++)
				out.write(food[i] + "\n");
			
			// close file writer
			out.flush();
			out.close();
		}
		
		catch (Exception e)  {
			
			System.out.println("Failed to write file.");
		}
		
	}

}
