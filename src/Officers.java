
public class Officers extends Users{

	protected int Badge;
	protected String Precinct;
	
	public Officers()
	{
		Username = "Police";
		Password = "PoPo50";
		Firstname = "Detective";
		Lastname = "Bailey";
		Badge = 12;
		Precinct = "Gotham";
	}
	
	public Officers(String un, String pass, String fn, String ln, int badge, String precinct)
	{
		super(un,pass,fn,ln);
		Badge = badge;
		Precinct = precinct;
	}
	
	public void Create_ticket()
	{
		
	}
	
	public void View_Outstanding_ticket()
	{
		
	}
	
	public void Check_for_warrent()
	{
		
	}
	
	public void Display()
	{
		
	}
}
