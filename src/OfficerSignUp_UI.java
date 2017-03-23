import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OfficerSignUp_UI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblPassword;
	private JTextField textField_3;
	private JLabel lblConfirmPassword;
	private JTextField textField_4;
	private JLabel lblBadge;
	private JTextField textField_5;
	private JLabel lblPrecinct;
	private JTextField textField_6;
	private JButton btnRegister;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OfficerSignUp_UI window = new OfficerSignUp_UI();
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
	public OfficerSignUp_UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 739, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOfficersRegistrationForm = new JLabel("Officers Registration Form");
		lblOfficersRegistrationForm.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblOfficersRegistrationForm.setBounds(175, 11, 359, 37);
		frame.getContentPane().add(lblOfficersRegistrationForm);
		
		JLabel lblFirstname = new JLabel("Firstname: ");
		lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFirstname.setBounds(23, 75, 74, 31);
		frame.getContentPane().add(lblFirstname);
		
		textField = new JTextField();
		textField.setBounds(96, 77, 114, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastname = new JLabel("Lastname: ");
		lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastname.setBounds(231, 75, 74, 31);
		frame.getContentPane().add(lblLastname);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(302, 76, 114, 33);
		frame.getContentPane().add(textField_1);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(439, 75, 77, 31);
		frame.getContentPane().add(lblUsername);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(514, 76, 127, 33);
		frame.getContentPane().add(textField_2);
		
		lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(23, 134, 74, 31);
		frame.getContentPane().add(lblPassword);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(96, 136, 114, 31);
		frame.getContentPane().add(textField_3);
		
		lblConfirmPassword = new JLabel("Confirm Password: ");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirmPassword.setBounds(229, 132, 127, 31);
		frame.getContentPane().add(lblConfirmPassword);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(355, 136, 114, 31);
		frame.getContentPane().add(textField_4);
		
		lblBadge = new JLabel("Badge:  ");
		lblBadge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBadge.setBounds(23, 199, 56, 31);
		frame.getContentPane().add(lblBadge);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(96, 201, 114, 31);
		frame.getContentPane().add(textField_5);
		
		lblPrecinct = new JLabel("Precinct: ");
		lblPrecinct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecinct.setBounds(231, 197, 74, 31);
		frame.getContentPane().add(lblPrecinct);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(304, 199, 114, 31);
		frame.getContentPane().add(textField_6);
		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(589, 270, 89, 31);
		frame.getContentPane().add(btnRegister);
	}

}
