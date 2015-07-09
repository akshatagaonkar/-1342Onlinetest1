package voting;

public class candidatelamp extends BallotUnit{
	String vote = "BJP";
	
	
	public void glows(){
		if(vote == "BJP")
		{
			System.out.println("voted in favour of candidate");
		}
		
	}

}
