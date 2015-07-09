package evm;

public class ProxyController implements Register {
	Controller p;
	@Override
	public void voting_request()
	{
		Boolean permission=false;
		if(permission == true)
		{
			System.out.println("You have permission to Vote");
			
			p = new Controller();
			p.voting_request();
		}
		else
		{
			System.out.println("You do not have permission to vote");
		}
	}
}
