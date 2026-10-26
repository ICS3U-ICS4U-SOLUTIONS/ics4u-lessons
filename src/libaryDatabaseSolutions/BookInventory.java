package libaryDatabaseSolutions;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookInventory {

	// To make visible in all methods
	public static Book[] bookList;
	
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookInventory window = new BookInventory();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		// Load the book inventory
		bookList = libaryDatabaseSolutions.BookDbMethods.loadBooksFromFile("BookList.txt");
	}

	/**
	 * Create the application.
	 */
	public BookInventory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("St.FX Learning Commons");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(105, 24, 246, 34);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(146, 95, 229, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(146, 126, 229, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Book Reference #");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(28, 98, 108, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Book Title");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(28, 129, 108, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton button1 = new JButton("Search");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// int searchResult = binarySearch(bookList, textField1.getText(), 0, bookList.length - 1);
				int bookIndex = libaryDatabaseSolutions.BookDbMethods.linearRecursiveBookSearch(bookList, textField1.getText(), 0);
				
				if (bookIndex == -1)  {
					
					textField2.setText("Book not found.");
		        	textField3.setText("Author not found.");
				}
				
				else  {
					
					textField2.setText(bookList[bookIndex].getTitle());
		        	textField3.setText(bookList[bookIndex].getAuthor());
		        }
			}
		});
		button1.setBounds(72, 191, 89, 23);
		frame.getContentPane().add(button1);
		
		JLabel lblNewLabel_2 = new JLabel("Search catalogue by reference # only.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(162, 77, 261, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton button2 = new JButton("Clear");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
			}
		});
		button2.setBounds(171, 191, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_1_1.setBounds(270, 191, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(146, 157, 229, 20);
		frame.getContentPane().add(textField3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Author");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(28, 160, 108, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
	}
	
}