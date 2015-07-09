package voting;

public class CandidateButon extends BallotUnit{

	Boolean press=true;
	
	public void votecast(){
		if(press==true)
		{
			System.out.println("You casted the vote");
		}
	}
	
}
