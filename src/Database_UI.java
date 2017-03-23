import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.border.BevelBorder;

public class Database_UI {

	//private JFrame frame;
	static String fn;
	static String ln;
	static String un;
	static String pass;
	static String badge;
	static String prec;
	static boolean warrant;
	static boolean found = false;
	protected static String temp;
	
	public static void main(String[] args){
		
		 
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Database_UI window = new Database_UI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		*/
		
		
		JFrame frame = new JFrame();
		JTable table = new JTable();
		
		
		Object[] columns = {"Firstname","Lastname","Username","Password","Badge","Precinct"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		table.setBackground(Color.cyan);
		table.setForeground(Color.white);
		Font font = new Font("", 1, 12);
		table.setFont(font);
		table.setRowHeight(30);
		
		JTextField textfname = new JTextField();
		JTextField textlname = new JTextField();
		JTextField textuname = new JTextField();
		JTextField textpass = new JTextField();
		JTextField textBadge  = new JTextField();
		JTextField textPrec = new JTextField();
		
		JButton btnCreate = new JButton("Create");
		JButton btnRetrieve = new JButton("Retrieve");
		JButton btnUpdate = new JButton("Update");
		JButton btnDelete = new JButton("Delete");
		
		
		textfname.setBounds(101, 262, 100, 25);
		textlname.setBounds(288, 262, 100, 25);
		textuname.setBounds(472, 262, 100, 25);
		textpass.setBounds(101, 298, 100, 25);
		textBadge.setBounds(288, 298, 100, 25);
		textPrec.setBounds(472, 298, 100, 25);
		
		
		btnCreate.setBounds(497, 21, 87, 25);
		btnRetrieve.setBounds(497, 71, 87, 25);
		btnUpdate.setBounds(497, 127, 87, 25);
		btnDelete.setBounds(497, 192, 87, 25);
		
		
		JScrollPane pane =  new JScrollPane(table);
		pane.setBounds(29, 17, 458, 211);
		
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(pane);
		
		frame.getContentPane().add(textfname);
		frame.getContentPane().add(textlname);
		frame.getContentPane().add(textuname);
		frame.getContentPane().add(textpass);
		frame.getContentPane().add(textBadge);
		frame.getContentPane().add(textPrec);
		
		frame.getContentPane().add(btnCreate);
		frame.getContentPane().add(btnRetrieve);
		frame.getContentPane().add(btnUpdate);
		frame.getContentPane().add(btnDelete);
		
		JLabel Firstname = new JLabel("Firstname: ");
		Firstname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Firstname.setBounds(29, 260, 108, 25);
		frame.getContentPane().add(Firstname);
		
		JLabel lblLastname = new JLabel("Lastname: ");
		lblLastname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastname.setBounds(211, 260, 87, 25);
		frame.getContentPane().add(lblLastname);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(398, 260, 90, 25);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(29, 296, 90, 25);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("Badge: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(211, 298, 75, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPrecinct = new JLabel("Precinct: ");
		lblPrecinct.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecinct.setBounds(398, 298, 89, 20);
		frame.getContentPane().add(lblPrecinct);
		
		//Array of Items in the comboBox
		String[] items = {"All","Firstname","Lastname","Username","Badge","Precinct"};
		
		
		JComboBox<?> cb =  new JComboBox<Object>(items);
		
		cb.setBounds(582, 71, 62, 25);
		frame.getContentPane().add(cb);
		
		JPanel panel = new JPanel();
		
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 26, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Username: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 74, 62, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Badge:");
		lblNewLabel_4.setBounds(10, 131, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Precinct:");
		lblNewLabel_5.setBounds(10, 193, 62, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblFirstname = new JLabel("Mardon");
		lblFirstname.setBounds(83, 27, 62, 14);
		panel.add(lblFirstname);
		
		JLabel lblLastname_1 = new JLabel("Bailey");
		lblLastname_1.setBounds(155, 27, 62, 14);
		panel.add(lblLastname_1);
		
		JLabel lblUsername_1 = new JLabel("Mardii");
		lblUsername_1.setBounds(83, 75, 62, 14);
		panel.add(lblUsername_1);
		
		JLabel lblBadge = new JLabel("100");
		lblBadge.setBounds(83, 131, 46, 14);
		panel.add(lblBadge);
		
		JLabel lblGotham = new JLabel("Gotham");
		lblGotham.setBounds(83, 193, 85, 14);
		panel.add(lblGotham);
		
		JButton btnCancelFilterSearch = new JButton("Cancel Filter Search");
		btnCancelFilterSearch.setVisible(false);
		btnCancelFilterSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCancelFilterSearch.setVisible(false);
				
				btnCreate.setEnabled(true);
				btnUpdate.setEnabled(true);
				btnDelete.setEnabled(true);
				
				textfname.setText("");
				textlname.setText("");
				textuname.setText("");
				textpass.setText("");
				textBadge.setText("");
				textPrec.setText("");
				
				textfname.setVisible(true);
				textlname.setVisible(true);
				textuname.setVisible(true);
				textpass.setVisible(true);
				textBadge.setVisible(true);
				textPrec.setVisible(true);
				
				Firstname.setVisible(true);
				lblLastname.setVisible(true);
				lblUsername.setVisible(true);
				lblPassword.setVisible(true);
				lblNewLabel_1.setVisible(true);
				lblPrecinct.setVisible(true);
			}
		});
		btnCancelFilterSearch.setBounds(250, 334, 161, 25);
		frame.getContentPane().add(btnCancelFilterSearch);
		
		
		Object[] row = new Object[6];
		
		btnCreate.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//An array to store user input
				row[0] = textfname.getText();
				row[1] = textlname.getText();
				row[2] = textuname.getText();
				row[3] = textpass.getText();
				row[4] = textBadge.getText();
				row[5] = textPrec.getText();						
				
				fn = (String) row[0];
				ln = (String) row[1];
				un = (String) row[2];
				pass = (String) row[3];
				badge = (String) row[4];
				prec = (String) row[5];
				
								
				//Check if a the intended table exists, if not create it, it it exist add records
				Object[] prime = new Object[6];
							
				try
				{
										
					Class.forName("org.postgresql.Driver");
					
					String url = "jdbc:postgresql://localhost:5432/postgres";
					Connection con = DriverManager.getConnection(url, "postgres", "p@$$w0rd");
					Statement st = con.createStatement();
					
					String create = "CREATE TABLE IF NOT EXISTS public.Officers(Firstname varchar(40), Lastname varchar(40), Username varchar(40), Password varchar(40), Badge varchar(40), Precinct varchar(40))";
					st.execute(create);
					
					//Check if Badge already exist
					
					String retrieve = "SELECT * FROM Officers";
					ResultSet rs = st.executeQuery(retrieve);
					
				
					if(!rs.next())
					{
						System.out.println("No records");
						
						if((fn.length() > 0) && (ln.length() > 0) && (pass.length() > 0) && (badge.length() > 0) && (prec.length() > 0))
						{
							String add = "INSERT INTO Officers values('"+fn+"','"+ln+"','"+un+"','"+pass+"','"+badge+"','"+prec+"')";
							st.execute(add);
						
							JOptionPane.showMessageDialog(null, "Record added successfully");	
							
							model.addRow(row);
						}
						
						else{
						
							JOptionPane.showMessageDialog(null, "Nothing added");
						
						}
						
						
						
					}
					
					else{
						
					do
					{
						System.out.println("Checking");
							
						prime[0] = rs.getString(1);
						prime[1] = rs.getString(2);
						prime[2] = rs.getString(3);
						prime[3] = rs.getString(4);
						prime[4] = rs.getString(5);
						prime[5] = rs.getString(6);
						
						System.out.println(badge);
						System.out.println(prime[4]);
						
						
						if(badge.equals(prime[4]))
						{
							System.out.println("Is the same");
							found = true;
							break;
						}
						
						else
						{
							System.out.println("Is not the sane");
							found = false;
						}
					}while(rs.next());
					
					System.out.println(found);
					
					
					
					if(found == false)
					{
						if((fn.length() > 0) && (ln.length() > 0) && (pass.length() > 0) && (badge.length() > 0) && (prec.length() > 0))
						{
							
							String add = "INSERT INTO Officers values('"+fn+"','"+ln+"','"+un+"','"+pass+"','"+badge+"','"+prec+"')";
							st.execute(add);
							model.addRow(row);
							JOptionPane.showMessageDialog(null, "Record added successfully");
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Nothing added\nSome required fields are empty");
						}
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "Badge Already Exists");
					}
					}	
				}
				
				catch(Exception e0)
				{
					e0.printStackTrace();
					
					System.out.println("Error Creating/populating table");
					
				}
			
				textfname.setText("");
				textlname.setText("");
				textuname.setText("");
				textpass.setText("");
				textBadge.setText("");
				textPrec.setText("");
				
				//Display contents in table
				
				
			}});
				
		
		Object[] rec = new Object[6];
		btnRetrieve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dm = (DefaultTableModel)table.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged(); // notifies the JTable that the model has changed
				
			String item = cb.getSelectedItem().toString();
		
			System.out.println(item);
			
					switch(item)
					{
					
						case "Firstname":
							try
							{
								Class.forName("org.postgresql.Driver");
								
								String url = "jdbc:postgresql://localhost:5432/postgres";
								Connection con = DriverManager.getConnection(url, "postgres", "p@$$w0rd");
								Statement st = con.createStatement();
								
								
							String retrieve = "SELECT * FROM Officers WHERE Firstname LIKE '"+textfname.getText()+"' ";
							
							ResultSet rs = st.executeQuery(retrieve);
							
							
							while(rs.next())
							{
								rec[0] = rs.getString(1);
								rec[1] = rs.getString(2);
								rec[2] = rs.getString(3);
								rec[3] = rs.getString(4);
								rec[4] = rs.getString(5);
								rec[5] = rs.getString(6);
								
								
									model.addRow(rec);
								
							}
							
							if(textfname.getText().equals(rec[0]))
							{
							JOptionPane.showMessageDialog(null, "Retrieval Successful");
							}
							
							else{
								JOptionPane.showMessageDialog(null, "No records with that Firstname");
							}
						}
						
						catch(Exception e0)
						{
							e0.printStackTrace();
							
							System.out.println("Error Retrieving table");
							
						}

							  break;
							  
						case "Lastname":
							try
							{
								Class.forName("org.postgresql.Driver");
								
								String url = "jdbc:postgresql://localhost:5432/postgres";
								Connection con = DriverManager.getConnection(url, "postgres", "p@$$w0rd");
								Statement st = con.createStatement();
								System.out.println(item);
							
							String retrieve = "SELECT * FROM Officers WHERE Lastname LIKE '"+textlname.getText()+"' ";
							
							ResultSet rs = st.executeQuery(retrieve);
							
							while(rs.next())
							{
								rec[0] = rs.getString(1);
								rec[1] = rs.getString(2);
								rec[2] = rs.getString(3);
								rec[3] = rs.getString(4);
								rec[4] = rs.getString(5);
								rec[5] = rs.getString(6);
								
								model.addRow(rec);
								
							}
							if(textlname.getText().equals(rec[1]))
							{
							JOptionPane.showMessageDialog(null, "Retrieval Successful");
							}
							
							else{
								JOptionPane.showMessageDialog(null, "No records with that Lastname");
							}
						}
						
						catch(Exception e0)
						{
							e0.printStackTrace();
							
							System.out.println("Error Retrieving table");
							
						}
					
							  break;
							  
						case "Username":
							try
							{
								Class.forName("org.postgresql.Driver");
								
								String url = "jdbc:postgresql://localhost:5432/postgres";
								Connection con = DriverManager.getConnection(url, "postgres", "p@$$w0rd");
								Statement st = con.createStatement();
								System.out.println(item);
							
							String retrieve = "SELECT * FROM Officers WHERE Username LIKE '"+textuname.getText()+"' ";
							
							ResultSet rs = st.executeQuery(retrieve);
							
							while(rs.next())
							{
								rec[0] = rs.getString(1);
								rec[1] = rs.getString(2);
								rec[2] = rs.getString(3);
								rec[3] = rs.getString(4);
								rec[4] = rs.getString(5);
								rec[5] = rs.getString(6);
								
								model.addRow(rec);
								
							}
							if(textuname.getText().equals(rec[2]))
							{
							JOptionPane.showMessageDialog(null, "Retrieval Successful");
							}
							
							else{
								JOptionPane.showMessageDialog(null, "No records with that Username");
							}
						}
						
						catch(Exception e0)
						{
							e0.printStackTrace();
							
							System.out.println("Error Retrieving table");
							
						}
							 
							  break;
							  
						case "Badge":
							try
							{
								Class.forName("org.postgresql.Driver");
								
								String url = "jdbc:postgresql://localhost:5432/postgres";
								Connection con = DriverManager.getConnection(url, "postgres", "p@$$w0rd");
								Statement st = con.createStatement();
								
							
							String retrieve = "SELECT * FROM Officers WHERE Badge LIKE '"+textBadge.getText()+"' ";
							
							ResultSet rs = st.executeQuery(retrieve);
							
							while(rs.next())
							{
								rec[0] = rs.getString(1);
								rec[1] = rs.getString(2);
								rec[2] = rs.getString(3);
								rec[3] = rs.getString(4);
								rec[4] = rs.getString(5);
								rec[5] = rs.getString(6);
								
								model.addRow(rec);
								
							}
							if(textBadge.getText().equals(rec[4]))
							{
							JOptionPane.showMessageDialog(null, "Retrieval Successful");
							}
							
							else{
								JOptionPane.showMessageDialog(null, "No records with that Badge");
							}
						}
						
						catch(Exception e0)
						{
							e0.printStackTrace();
							
							System.out.println("Error Retrieving table");
							
						}
							  
							  break;
							  
						case "Precinct":
							try
							{
								Class.forName("org.postgresql.Driver");
								
								String url = "jdbc:postgresql://localhost:5432/postgres";
								Connection con = DriverManager.getConnection(url, "postgres", "p@$$w0rd");
								Statement st = con.createStatement();
								
							
							String retrieve = "SELECT * FROM Officers WHERE Precinct LIKE '"+textPrec.getText()+"' ";
							
							ResultSet rs = st.executeQuery(retrieve);
							
							while(rs.next())
							{
								rec[0] = rs.getString(1);
								rec[1] = rs.getString(2);
								rec[2] = rs.getString(3);
								rec[3] = rs.getString(4);
								rec[4] = rs.getString(5);
								rec[5] = rs.getString(6);
								
								model.addRow(rec);						
							}
							
							if(textPrec.getText().equals(rec[5]))
							{
							JOptionPane.showMessageDialog(null, "Retrieval Successful");
							}
							
							else{
								JOptionPane.showMessageDialog(null, "No records with that Precinct");
							}
						}
						
						catch(Exception e0)
						{
							e0.printStackTrace();
							
							System.out.println("Error Retrieving table");
							
						}
							 
							  break;
							  
						case "All":
							try
							{
								Class.forName("org.postgresql.Driver");
								
								String url = "jdbc:postgresql://localhost:5432/postgres";
								Connection con = DriverManager.getConnection(url, "postgres", "p@$$w0rd");
								Statement st = con.createStatement();
								
							
							String retrieve = "SELECT * FROM Officers";
							
							ResultSet rs = st.executeQuery(retrieve);
							
							while(rs.next())
							{
								rec[0] = rs.getString(1);
								rec[1] = rs.getString(2);
								rec[2] = rs.getString(3);
								rec[3] = rs.getString(4);
								rec[4] = rs.getString(5);
								rec[5] = rs.getString(6);
								
								model.addRow(rec);
							}
						}
						
						catch(Exception e0)
						{
							e0.printStackTrace();
							
							System.out.println("Error Retrieving table");
							
						}
						break;
					}
						
					}					
		});
		
		
		btnUpdate.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
						
				//An array to store user input
				row[0] = textfname.getText();
				row[1] = textlname.getText();
				row[2] = textuname.getText();
				row[3] = textpass.getText();
				row[4] = textBadge.getText();
				row[5] = textPrec.getText();						
				
				fn = (String) row[0];
				ln = (String) row[1];
				un = (String) row[2];
				pass = (String) row[3];
				badge = (String) row[4];
				prec = (String) row[5];
				
								
				//Check if a the intended table exists, if not create it, it it exist add records
				Object[] prime = new Object[6];
							
				try
				{
										
					Class.forName("org.postgresql.Driver");
					
					String url = "jdbc:postgresql://localhost:5432/postgres";
					Connection con = DriverManager.getConnection(url, "postgres", "p@$$w0rd");
					Statement st = con.createStatement();
				
					
					//Check if Badge already exist
					
					String retrieve = "SELECT * FROM Officers";
					ResultSet rs = st.executeQuery(retrieve);
				
					if(!rs.next())
					{
						System.out.println("No records to Update");
					}
					
					else{
						
					do
					{
						System.out.println("Checking");
							
						prime[0] = rs.getString(1);
						prime[1] = rs.getString(2);
						prime[2] = rs.getString(3);
						prime[3] = rs.getString(4);
						prime[4] = rs.getString(5);
						prime[5] = rs.getString(6);
						
						System.out.println(badge);
						System.out.println(prime[4]);
						
						
						//Also check to see if textfields are empty before printing the info from the textbox
						if(badge.equals(prime[4]))
						{
							System.out.println("Is the same");
							found = true;
							break;
						}
						
						else
						{
							System.out.println("Is not the sane");
							found = false;
						}
						
					}while(rs.next());
					
					System.out.println(found);
					
					
					
					if(found == false)
					{
					
						if((fn.length() > 0) && (ln.length() > 0) && (pass.length() > 0) && (badge.length() > 0) && (prec.length() > 0))
						{
						String update = "UPDATE Officers set Firstname = '"+textfname.getText()+"' , Lastname = '"+textlname.getText()+"', "
								+ "Username = '"+textuname.getText()+"', Password = '"+textpass.getText()+"', "
								+ "Badge = '"+textBadge.getText()+"', Precinct = '"+textPrec.getText()+"' "
								+ "WHERE Badge = '"+temp+"' ";
								st.execute(update);
								
								model.addRow(row);

								JOptionPane.showMessageDialog(null, "Table Updated");
						}
						
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "Badge Already Exists");
					}
					}	
				}
				
				catch(Exception e0)
				{
					e0.printStackTrace();
					
					System.out.println("Error Updating table");
					
				}
				
			}});
		
		
		btnDelete.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int i = table.getSelectedRow();
				
				if(i >= 0)
				{
					model.removeRow(i);
				}
				
				else
				{
					System.out.println("Delete Error");				
				}
				
				
				try
				{
					Class.forName("org.postgresql.Driver");
					
					String url = "jdbc:postgresql://localhost:5432/postgres";
					Connection con = DriverManager.getConnection(url, "postgres", "p@$$w0rd");
					Statement st = con.createStatement();
					
					String delete = "DELETE FROM Officers WHERE Badge = '"+textBadge.getText()+"'";
					
					String bage = textBadge.getText();
					
					if(bage.length() > 0)
					{
					st.execute(delete);
						
					
					JOptionPane.showMessageDialog(null, "Record Deleted");
					}
				}
				
				catch(Exception e0)
				{
					e0.printStackTrace();
					
					System.out.println("Error Deleting Record");
					
				}
			}});
		
	
		
		
		table.addMouseListener(new MouseAdapter(){
			
			@Override
			public void mouseClicked(MouseEvent e){
				
				
				
				int i = table.getSelectedRow();
				textfname.setText(model.getValueAt(i, 0).toString());
				textlname.setText(model.getValueAt(i, 1).toString());
				textuname.setText(model.getValueAt(i, 2).toString());
				textpass.setText(model.getValueAt(i, 3).toString());
				textBadge.setText(model.getValueAt(i, 4).toString());
				textPrec.setText(model.getValueAt(i, 5).toString());
				
				frame.getContentPane().add(panel);
				temp = textBadge.getText();
				
				lblFirstname.setText(textfname.getText());
				lblLastname_1.setText(textlname.getText());
				lblUsername_1.setText(textuname.getText());
				lblBadge.setText(textBadge.getText());
				lblGotham.setText(textPrec.getText()); 
				
				panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
				panel.setBounds(667, 17, 395, 238);
				panel.setLayout(null);
			}
		});
		
						
		frame.setSize(1104,407);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		cb.addItemListener(new ItemListener () {
		    public void itemStateChanged(ItemEvent e) {
		    	
		    	if(e.getStateChange() == ItemEvent.SELECTED)
		    	{
		    		String get = (String) e.getItem();
		    		
		    		switch(get)
		    		{
		    			case "Firstname":
		    				
		    				btnCancelFilterSearch.setVisible(true);
		    				
		    				textfname.setVisible(true);
		    				textlname.setVisible(false);
							textuname.setVisible(false);
							textpass.setVisible(false);
							textBadge.setVisible(false);
							textPrec.setVisible(false);
							
							Firstname.setVisible(true);
							lblLastname.setVisible(false);
							lblUsername.setVisible(false);
							lblPassword.setVisible(false);
							lblNewLabel_1.setVisible(false);
							lblPrecinct.setVisible(false);
							
							textfname.setText("");
							textlname.setText("");
							textuname.setText("");
							textpass.setText("");
							textBadge.setText("");
							textPrec.setText("");
							
							btnCreate.setEnabled(false);
							btnUpdate.setEnabled(false);
							btnDelete.setEnabled(false);
							
							break;
							
		    			case "Lastname":
		    				btnCancelFilterSearch.setVisible(true);
		    				
		    				textfname.setVisible(false);
		    				textlname.setVisible(true);
							textuname.setVisible(false);
							textpass.setVisible(false);
							textBadge.setVisible(false);
							textPrec.setVisible(false);
							
							Firstname.setVisible(false);
							lblLastname.setVisible(true);
							lblUsername.setVisible(false);
							lblPassword.setVisible(false);
							lblNewLabel_1.setVisible(false);
							lblPrecinct.setVisible(false);
							
							textfname.setText("");
							textlname.setText("");
							textuname.setText("");
							textpass.setText("");
							textBadge.setText("");
							textPrec.setText("");
							
							btnCreate.setEnabled(false);
							btnUpdate.setEnabled(false);
							btnDelete.setEnabled(false);
							break;
							
		    			case "Username":
		    				btnCancelFilterSearch.setVisible(true);
		    				
		    				textfname.setVisible(false);
							textlname.setVisible(false);
							textuname.setVisible(true);
							textpass.setVisible(false);
							textBadge.setVisible(false);
							textPrec.setVisible(false);
							
							Firstname.setVisible(false);
							lblLastname.setVisible(false);
							lblUsername.setVisible(true);
							lblPassword.setVisible(false);
							lblNewLabel_1.setVisible(false);
							lblPrecinct.setVisible(false);
							
							textfname.setText("");
							textlname.setText("");
							textuname.setText("");
							textpass.setText("");
							textBadge.setText("");
							textPrec.setText("");
							
							btnCreate.setEnabled(false);
							btnUpdate.setEnabled(false);
							btnDelete.setEnabled(false);
							break;
							
		    			case "Badge":
		    				btnCancelFilterSearch.setVisible(true);
		    				
		    				textfname.setVisible(false);
		    				textlname.setVisible(false);
							textuname.setVisible(false);
							textpass.setVisible(false);
							textBadge.setVisible(true);
							textPrec.setVisible(false);
							
							Firstname.setVisible(false);
							lblLastname.setVisible(false);
							lblPassword.setVisible(false);
							lblUsername.setVisible(false);
							lblNewLabel_1.setVisible(true);
							lblPrecinct.setVisible(false);
							
							textfname.setText("");
							textlname.setText("");
							textuname.setText("");
							textpass.setText("");
							textBadge.setText("");
							textPrec.setText("");
							
							btnCreate.setEnabled(false);
							btnUpdate.setEnabled(false);
							btnDelete.setEnabled(false);
							break;
							
		    			case "Precinct":
		    				btnCancelFilterSearch.setVisible(true);
		    				
		    				textfname.setVisible(false);
		    				textlname.setVisible(false);
							textuname.setVisible(false);
							textpass.setVisible(false);
							textBadge.setVisible(false);
							textPrec.setVisible(true);
							
							Firstname.setVisible(false);
							lblLastname.setVisible(false);
							lblPassword.setVisible(false);
							lblUsername.setVisible(false);
							lblNewLabel_1.setVisible(false);
							lblPrecinct.setVisible(true);
							
							textfname.setText("");
							textlname.setText("");
							textuname.setText("");
							textpass.setText("");
							textBadge.setText("");
							textPrec.setText("");
							
							btnCreate.setEnabled(false);
							btnUpdate.setEnabled(false);
							btnDelete.setEnabled(false);
							break;
		    		}
		    		
		    	}
		    	
		    }
		});
		
		
	}
	}
