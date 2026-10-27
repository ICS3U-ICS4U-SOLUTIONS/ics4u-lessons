package studentDatabaseSolutions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInventory {

	public static Student[] studentList;
	
	private JFrame frame;
	private JTextField searchTextField;
	private JTextField studentTextField;
	private JTextField gradeTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInventory window = new StudentInventory();
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
	public StudentInventory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Grades");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(151, 11, 152, 34);
		frame.getContentPane().add(lblNewLabel);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(191, 63, 175, 20);
		frame.getContentPane().add(searchTextField);
		searchTextField.setColumns(10);
		
		studentTextField = new JTextField();
		studentTextField.setBounds(191, 111, 175, 20);
		frame.getContentPane().add(studentTextField);
		studentTextField.setColumns(10);
		
		gradeTextField = new JTextField();
		gradeTextField.setBounds(191, 163, 175, 20);
		frame.getContentPane().add(gradeTextField);
		gradeTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Search (first name)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 66, 161, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Student");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(20, 114, 114, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Grade");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(20, 166, 114, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				studentList = StudentDBMethods.loadStudentsFromFile("StudentGrades.txt");
				int studentIndex = StudentDBMethods.searchStudents(studentList, searchTextField.getText(), 0);
				
				if (studentIndex == -1)  {
					
					studentTextField.setText("<no matches>");
					gradeTextField.setText("<no grade>");	
				}
				
				else  {
					
					studentTextField.setText(studentList[studentIndex].getFirstName() + " " + studentList[studentIndex].getLastName());
					gradeTextField.setText(studentList[studentIndex].getGrade());	
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(50, 213, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				searchTextField.setText("");
				studentTextField.setText("");
				gradeTextField.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(176, 213, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(307, 213, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
