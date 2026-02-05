package lessons;

// need these two imports for images
import javax.swing.Icon;
import javax.swing.ImageIcon;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

	// variables
	private JFrame frame;
	static JButton[] buttons = new JButton[9];  // to hold game board buttons
	
	// gameBoard will be used to track x's and o's (0 = no pick, 1 = X, 2 = O)
	int[] gameBoard = new int[9];
	
	ImageIcon x = new ImageIcon(getClass().getResource("/resources/x.png"));
	ImageIcon o = new ImageIcon(getClass().getResource("/resources/o.png"));
	ImageIcon blank = new ImageIcon(getClass().getResource("/resources/blank.png"));	
	
	boolean xTurn = false;
	boolean oTurn = false;
	static boolean gameOver = false;
	
	// we moved the Info label outside from the initialize method
	// so it can be visible in all other methods that we create
	JLabel lblNewLabel_1 = new JLabel("First player picks X or O to start/reset.");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setBounds(50, 50, 376, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(132, 11, 124, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton zeroButton = new JButton("");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// zeroButton code start
				
				//buttonCode(0);
				
				// zeroButton code end
				
			}
		});
		zeroButton.setBounds(26, 45, 90, 90);
		frame.getContentPane().add(zeroButton);
		
		JButton oneButton = new JButton("");
		oneButton.setBounds(132, 45, 90, 90);
		frame.getContentPane().add(oneButton);
		
		JButton twoButton = new JButton("");
		twoButton.setBounds(235, 45, 90, 90);
		frame.getContentPane().add(twoButton);
		
		JButton threeButton = new JButton("");
		threeButton.setBounds(26, 153, 90, 90);
		frame.getContentPane().add(threeButton);
		
		JButton fourButton = new JButton("");
		fourButton.setBounds(132, 153, 90, 90);
		frame.getContentPane().add(fourButton);
		
		JButton fiveButton = new JButton("");
		fiveButton.setBounds(235, 153, 90, 90);
		frame.getContentPane().add(fiveButton);
		
		JButton sixButton = new JButton("");
		sixButton.setBounds(26, 264, 90, 90);
		frame.getContentPane().add(sixButton);
		
		JButton sevenButton = new JButton("");
		sevenButton.setBounds(132, 264, 90, 90);
		frame.getContentPane().add(sevenButton);
		
		JButton eightButton = new JButton("");
		eightButton.setBounds(235, 264, 90, 90);
		frame.getContentPane().add(eightButton);
		
		// put all buttons into array
		// this must be done here, after buttons
		// have been created
		buttons[0] = zeroButton;
		buttons[1] = oneButton;
		buttons[2] = twoButton;
		buttons[3] = threeButton;
		buttons[4] = fourButton;
		buttons[5] = fiveButton;
		buttons[6] = sixButton;
		buttons[7] = sevenButton;
		buttons[8] = eightButton;
		
		/*	DESCRIPTION ...
		 * 
		 */
		JButton xButton = new JButton("X");
		xButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// x button code start
				
				xTurn = true;
				oTurn = false;
				initializeGame();
				
				// x button code end
			}
		});
		xButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		xButton.setBounds(40, 385, 60, 43);
		frame.getContentPane().add(xButton);
		
		
		/*	DESCRIPTION ...
		 * 
		 */
		JButton oButton = new JButton("O");
		oButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// o button code start
				
				xTurn = false;
				oTurn = true;
				initializeGame();
				
				// o button code end
			}
		});
		oButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		oButton.setBounds(147, 385, 60, 43);
		frame.getContentPane().add(oButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// exit button code start
				
				System.exit(0);
				
				// exit button code end
				
			}
		});
		exitButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		exitButton.setBounds(236, 395, 89, 23);
		frame.getContentPane().add(exitButton);
		
		lblNewLabel_1.setBounds(54, 457, 242, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
	
	/*
	 * 	DESCRIPTION - initializes game
	 *  PARAMETERS - none
	 *  RETURN TYPE - void
	 */
	public void initializeGame()  {
		
		// check if game is over
		gameOver = false;
		
		for(int i=0; i<buttons.length; i++ )  {
			
			buttons[i].setIcon(blank);
		}
		
		// reset gameBoard
		for(int i=0; i<gameBoard.length; i++)  {
			
			gameBoard[i] = 0;
		}
		
		// test print
		for(int i=0; i<gameBoard.length; i++)  {
			
			System.out.println(gameBoard[i]);
		}
	}
	
	
	/*	DESCRIPTION - Button behavior
	 *  PARAMETERS - int square
	 *  RETURN TYPE - void
	 */	
	public void buttonCode(int square)  {
		
		// check if game is over, if true, do nothing
		if(gameOver == true )  {
			
			return;
		}
		
		
	}
	
	
	
	
}
