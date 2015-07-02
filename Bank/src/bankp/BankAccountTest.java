package bankp;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	
	BankAccount ba = new BankAccount();

	@Test
	public void testDepositCash() {
		//fail("Not yet implemented");
		assertEquals(300,ba.depositCash(100));
	}

	@Test
	public void testWithdrawCash() {
		//fail("Not yet implemented");
		assertEquals(100,ba.withdrawCash(100));
	}



	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		assertEquals(200,ba.getBalance());

	}

}

