import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class AdminMenu_UI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu_UI window = new AdminMenu_UI();
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
	public AdminMenu_UI() {
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
		
		JLabel lblSelectAnOption = new JLabel("Select an Option below");
		lblSelectAnOption.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSelectAnOption.setBounds(106, 11, 218, 25);
		frame.getContentPane().add(lblSelectAnOption);
		
		JRadioButton rdbtnCreate = new JRadioButton("Create ");
		rdbtnCreate.setBounds(17, 62, 109, 23);
		frame.getContentPane().add(rdbtnCreate);
		
		JRadioButton rdbtnRetrieve = new JRadioButton("Retrieve");
		rdbtnRetrieve.setBounds(17, 88, 109, 23);
		frame.getContentPane().add(rdbtnRetrieve);
		
		JRadioButton rdbtnUpdate = new JRadioButton("Update");
		rdbtnUpdate.setBounds(17, 114, 109, 23);
		frame.getContentPane().add(rdbtnUpdate);
		
		JRadioButton rdbtnDelete = new JRadioButton("Delete");
		rdbtnDelete.setBounds(17, 140, 109, 23);
		frame.getContentPane().add(rdbtnDelete);
		
		JCheckBox chckbxOfficer = new JCheckBox("Officer");
		chckbxOfficer.setBounds(6, 183, 59, 23);
		frame.getContentPane().add(chckbxOfficer);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Commuter");
		chckbxNewCheckBox.setBounds(67, 183, 75, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBounds(314, 212, 89, 23);
		frame.getContentPane().add(btnContinue);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Add Warrant");
		rdbtnNewRadioButton.setBounds(260, 62, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Remove Warrent");
		rdbtnNewRadioButton_1.setBounds(260, 88, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
