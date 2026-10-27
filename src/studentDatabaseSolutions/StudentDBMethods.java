package studentDatabaseSolutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class StudentDBMethods {
	
	// DESCRIPTION - Returns Student[] populated with Student objects from file;
	// PARAMETERS - String fileName;
	// RETURN - Student[]
	public static Student[] loadStudentsFromFile(String fileName)  {
		
		ArrayList<Student> studentArrayList = new ArrayList<Student>();
		String firstAndLastName, firstName, lastName, grade;
		BufferedReader br = null;

	    try  {
	    	
	        br = new BufferedReader(new FileReader(fileName));
	        
	        while ((firstAndLastName = br.readLine()) != null )  {
	        	
	        	String[] names = firstAndLastName.split(" ");
	        	firstName = names[0];
	        	lastName = names[1];
	        	grade = br.readLine();
	        	
	        	studentArrayList.add(new Student(firstName, lastName, grade));
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
	    Student[] studentArray = new Student[studentArrayList.size()];

	    // copy all elements from ArrayList to array
	    studentArrayList.toArray(studentArray);
	    
	    // clear ArrayList
	    studentArrayList.clear();
	    
	    return studentArray;
	}
	
	
	// DESCRIPTION - Returns index of Student in Student[] matching first name, -1 if not found.
	// PARAMETERS - Student[] a, String firstName, int index
	// RETURN - int
	public static int searchStudents(Student[] a, String firstName, int index)  {
			
		// STOP/BASE CASE 1 - Exact match, return index.
		if (a[index].getFirstName().compareToIgnoreCase(firstName) == 0)
			return index;
			
		// STOP/BASE CASE 2 - Past point where student should be in sorted list.
		if (a[index].getFirstName().compareToIgnoreCase(firstName) > 0)
			return -1;
			
		// RECURSIVE CALL
		return searchStudents(a, firstName, index + 1);
	}
	
}
