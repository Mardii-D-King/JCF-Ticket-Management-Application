import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class WelcomeScreen_UI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen_UI window = new WelcomeScreen_UI();
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
	public WelcomeScreen_UI() {
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
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the JCF");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWelcomeToThe.setBounds(75, 41, 274, 38);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JLabel lblApplication = new JLabel("Application");
		lblApplication.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblApplication.setBounds(132, 114, 160, 29);
		frame.getContentPane().add(lblApplication);
	}
}
