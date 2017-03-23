
public abstract class Users {

	protected String Username;
	protected String Password;
	protected String Firstname;
	protected String Lastname;
	protected String Type;
	
	public Users()
	{
		Username = "Mardii";
		Password = "p@$$word";
		Firstname = "Mardon";
		Lastname = "Bailey";
		Type = "Officer";
	}
	
	public Users(String un, String pass, String fn, String ln)
	{
		Username = un;
		Password = pass;
		Firstname = fn;
		Lastname = ln;
	}
	
	public Users(Users obj)
	{
		Username = obj.Username;
		Password = obj.Password;
		Firstname = obj.Firstname;
		Lastname = obj.Lastname;
	}
	
	public void Display()
	{
		
	}
}
