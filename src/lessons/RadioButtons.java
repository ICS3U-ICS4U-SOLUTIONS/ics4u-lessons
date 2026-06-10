package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButtons {

	// global variables
	private JFrame frame;
	private JTextField textField;
	JRadioButton fooRadio = new JRadioButton("foo");
	JRadioButton barRadio = new JRadioButton("bar");
	JRadioButton fubarRadio = new JRadioButton("fubar");
	

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
		textField.setBounds(118, 220, 215, 17);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(fooRadio.isSelected())
					textField.setText("foo selected");
				
				if(barRadio.isSelected())
					textField.setText("bar selected");
				
				if(fubarRadio.isSelected())
					textField.setText("fubar selected");
			}
		});
		btnClickMe.setBounds(249, 163, 89, 23);
		frame.getContentPane().add(btnClickMe);
		fooRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (fooRadio.isSelected())  {
					
					barRadio.setSelected(false);
					fubarRadio.setSelected(false);
				}
				
				else
					fooRadio.setSelected(true);
			}
		});
		fooRadio.setSelected(true);
		
		
		fooRadio.setBounds(41, 81, 109, 23);
		frame.getContentPane().add(fooRadio);
		barRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (barRadio.isSelected())  {
					
					fooRadio.setSelected(false);
					fubarRadio.setSelected(false);
				}
				
				else
					barRadio.setSelected(true);
			}
		});

		
		
		barRadio.setBounds(41, 121, 109, 23);
		frame.getContentPane().add(barRadio);
		fubarRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (fubarRadio.isSelected())  {
					
					fooRadio.setSelected(false);
					barRadio.setSelected(false);
				}
				
				else					
					fubarRadio.setSelected(true);
			}
		});
		
		
		fubarRadio.setBounds(41, 163, 109, 23);
		frame.getContentPane().add(fubarRadio);
	}
}
