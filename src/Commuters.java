
public class Commuters extends Users{

	protected String DOB;
	protected int TRN;
	protected String Plate;
	protected int Month;
	protected int Day;
	protected int Year;
	protected String Address;
	protected String Offence;
	protected double TotalDue;
	
	public Commuters()
	{
		Username = "Dking";
		Password = "$c@mm@";
		Firstname = "Mardii";
		Lastname = "King";
		Type = "Commuters";
		DOB = "March 7, 1997";
		TRN = 123456789;
		Plate = "1234 AB";
		Month = 7;
		Day = 3;
		Year = 2017;
		Address = "4 StraightA Drive";
		Offence = "Speeding";
		TotalDue = 1234.56;
	}
	
	public Commuters(String un, String pass, String fn, String ln, String dob, int trn, String plate, int mon, int day, int yr, String Add, String offense, double totaldue)
	{
		super(un,pass,fn,ln);
		Username = un;
		Password = pass;
		Firstname = fn;
		Lastname = ln;
		DOB = dob;
		TRN = trn;
		
	}
}
