package voting;

public class Readylamp extends BallotUnit{

	String unit = "on";
	
	
	public void glows(){
		if(unit == "on")
		{
			System.out.println("The lamp glows");
			
		}
		else
		{
			System.out.println("Put the unit on");	
		}
	}
}
