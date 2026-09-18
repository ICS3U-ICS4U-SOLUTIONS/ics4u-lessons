package assignments;
import assignments.U2A2_2DArrays_Methods;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class U2A3_2DArrays {

	// variables
	private String[][] studentGrades = new String[15][6];
	int counter = 0;
	private JFrame frame;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField testOne;
	private JTextField testTwo;
	private JTextField testThree;
	private JTextField testFour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2A3_2DArrays window = new U2A3_2DArrays();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public U2A3_2DArrays() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		firstName = new JTextField();
		firstName.setBounds(138, 91, 86, 20);
		frame.getContentPane().add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setBounds(346, 91, 86, 20);
		frame.getContentPane().add(lastName);
		lastName.setColumns(10);
		
		testOne = new JTextField();
		testOne.setBounds(138, 139, 86, 20);
		frame.getContentPane().add(testOne);
		testOne.setColumns(10);
		
		testTwo = new JTextField();
		testTwo.setBounds(138, 170, 86, 20);
		frame.getContentPane().add(testTwo);
		testTwo.setColumns(10);
		
		testThree = new JTextField();
		testThree.setBounds(138, 210, 86, 20);
		frame.getContentPane().add(testThree);
		testThree.setColumns(10);
		
		testFour = new JTextField();
		testFour.setBounds(138, 241, 86, 20);
		frame.getContentPane().add(testFour);
		testFour.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(38, 94, 90, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Test 1");
		lblNewLabel_1.setBounds(38, 142, 74, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Test 2");
		lblNewLabel_2.setBounds(38, 173, 74, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Test 3");
		lblNewLabel_3.setBounds(38, 213, 74, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Test 4");
		lblNewLabel_4.setBounds(38, 244, 74, 17);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Last Name");
		lblNewLabel_5.setBounds(256, 94, 80, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Student Grades");
		lblNewLabel_6.setBounds(256, 40, 101, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// code starts here

				String temp = "";
				
				counter = U2A2_2DArrays_Methods.addStudent(firstName.getText(), "Irving", "85", "55", "66", "55", counter, studentGrades);
				temp = U2A2_2DArrays_Methods.listStudents(studentGrades);
				
				System.out.println(temp);
				// code ends here
			}
		});
		addButton.setBounds(343, 189, 89, 23);
		frame.getContentPane().add(addButton);
	}
}
