package voting;

public class ProxyController implements Register {
	Controller p;
	@Override
	public void printer_request()
	{
		Boolean permission=false;
		if(permission == true)
		{
			System.out.println("You have permission to print");
			
			p = new Controller();
			p.printer_request();
		}
		else
		{
			System.out.println("You do not have permission to print");
		}
	}
}
