import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Users_Menu_UI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Users_Menu_UI window = new Users_Menu_UI();
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
	public Users_Menu_UI() {
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
		
		JLabel lblLoginAs = new JLabel("Login As...");
		lblLoginAs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblLoginAs.setBounds(131, 11, 155, 37);
		frame.getContentPane().add(lblLoginAs);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(141, 72, 118, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOfficer = new JButton("Officer");
		btnOfficer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnOfficer.setBounds(141, 127, 118, 31);
		frame.getContentPane().add(btnOfficer);
		
		JButton btnCommutors = new JButton("Commuter");
		btnCommutors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCommutors.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCommutors.setBounds(117, 178, 169, 31);
		frame.getContentPane().add(btnCommutors);
	}
}
