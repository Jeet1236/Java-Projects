package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class SwingPractice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingPractice frame = new SwingPractice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingPractice() {
		setTitle("My First Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Submit");
		contentPane.add(rdbtnNewRadioButton);
		
		JTextArea txtrHelloWorld = new JTextArea();
		txtrHelloWorld.setText("Hello world, swing is amazing");
		txtrHelloWorld.setColumns(10);
		txtrHelloWorld.setTabSize(70);
		contentPane.add(txtrHelloWorld);
	}

}
