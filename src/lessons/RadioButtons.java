package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButtons {

	// variables
	private JFrame frame;
	private JTextField textField;
	JRadioButton male = new JRadioButton("Male");
	JRadioButton female = new JRadioButton("Female");
	JRadioButton other = new JRadioButton("Other");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtons window = new RadioButtons();
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
	public RadioButtons() {
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
		
		textField = new JTextField();
		textField.setBounds(259, 112, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Click Me!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(male.isSelected())
					textField.setText("Male selected.");
				
				if(female.isSelected())
					textField.setText("Female selected.");
				
				if(other.isSelected())
					textField.setText("Other selected.");
			}
		});
		btnNewButton.setBounds(259, 176, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				female.setSelected(false);
				other.setSelected(false);
			}
		});
		male.setBounds(40, 76, 109, 23);
		frame.getContentPane().add(male);
		male.setSelected(true);		// turn male radio button on by default
		
		
		female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				male.setSelected(false);
				other.setSelected(false);
			}
		});
		
		
		female.setBounds(40, 111, 109, 23);
		frame.getContentPane().add(female);
		other.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				male.setSelected(false);
				female.setSelected(false);
			}
		});
		
		
		other.setBounds(40, 147, 109, 23);
		frame.getContentPane().add(other);
	}

}
