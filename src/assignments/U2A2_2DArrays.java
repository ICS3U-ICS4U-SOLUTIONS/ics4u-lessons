package assignments;
import assignments.U2A2_2DArrays_Methods;


public class U2A2_2DArrays {
	
	public static void main(String[] args) {

		// variables
		String[][] studentTests = new String[15][6];
		int studentIndex = 0;
		String allData = "";
		
		studentIndex = U2A2_2DArrays_Methods.addStudent("Alec", "Irving", "73", "81", "88", "94", studentIndex, studentTests);
		
		
		allData = U2A2_2DArrays_Methods.listStudents(studentTests);
		
		System.out.println(allData);
	}

}
