package libaryDatabaseSolutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class BookDbMethods {

	// DESCRIPTION - Returns Book[] populated with Book objects from file.
	// PARAMETERS - String fileName
	// RETURN TYPE - Book[]
	public static Book[] loadBooksFromFile(String fileName)  {
		
		ArrayList<Book> bookArrayList = new ArrayList<Book>();
		String reference, title, author;
		BufferedReader br = null;

	    try  {
	    	
	        br = new BufferedReader(new FileReader(fileName));
	        
	        while ((reference = br.readLine()) != null )  {
	        	
	        	title = br.readLine();
	        	author = br.readLine();
	        	
	        	bookArrayList.add(new Book(reference, title, author));
	        }
	    } 

	    catch(Exception e)  {
	    	
	        e.printStackTrace();
	    } 

	    finally  {
	    	
	        try  {
	            br.close();
	        } 

	        catch (Exception ex)  {
	            ex.printStackTrace();
	        }
	    }

	    // initialize array
	    Book[] bookArray = new Book[bookArrayList.size()];

	    // copy all elements from ArrayList to array
	    bookArrayList.toArray(bookArray);
	    
	    // clear ArrayList
	    bookArrayList.clear();
	    
	    return bookArray;
	}
	
	
 	// DESCRIPTION - Returns index if book detected in database, else -1.
	// PARAMETERS - Book[] array, String pattern, int index
	// RETURN TYPE - int
	public static int linearRecursiveBookSearch(Book[] array, String refNum, int index)  {
		
		// error case
		if (index <  0 || index == array.length)
			return -1;
		
		// base case(s)
		if (array[index].getRefNum().equals(refNum))
			return index;
		
		// processing
		return linearRecursiveBookSearch(array, refNum, index+1);
	}
	
	
}
