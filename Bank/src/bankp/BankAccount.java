package bankp;

public class BankAccount {

	int bal=200;
	
	
	int depositCash(int amt){
		
		bal=bal+amt;
		return bal;
		
	}
	
	int withdrawCash(int amt){
		bal=bal-amt;	
		return bal;
		
	}
	
	
	int getBalance(){
		return bal;
	}

}
