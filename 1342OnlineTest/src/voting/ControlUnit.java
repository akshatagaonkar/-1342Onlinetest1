package voting;

public class ControlUnit {

	String ctrlunit = "on";
	Boolean ballotbutton = true;
	String beep="on";
	
	public void controlstart(){
	if(ctrlunit == "on")
	{
		if(ballotbutton == true)
		{
			System.out.println("Busy lamp glows");
			
			if(beep=="on")
			{
				System.out.println("Beep is on");
			}
				
		}
		
		
	}
	
}
}
