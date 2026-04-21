package fileIO;
import java.util.ArrayList;
import java.io.*;

public class FileOutput {

	public static void main(String[] args) {

		// variables
		String[] food = {"milk", "bread", "butter", "cheese", "yogurt"};
		
		try  {
			
			// create file, buffer and file writer
			FileOutputStream fout = new FileOutputStream("food.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			OutputStreamWriter out = new OutputStreamWriter(bout);
			
			// write contents of Array to file
			for(int i=0; i<food.length; i++)  {
				
				out.write(food[i] + "\n");
			}
			
			// force data to be written
			out.flush();
			
			// clear memory
			out.close();
		}

		catch(Exception e)   {
			
			e.printStackTrace();
		}
		
	}

}
