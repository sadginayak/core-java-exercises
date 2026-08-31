package com.corejava.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;

public class CurrentAccountTest {
	
	double depositAmount;
	private Account account;
	
	@BeforeEach
	public void setup() {
		account= new CurrentAccount("SN-158", "Sadgi Nayak", 1000.0);
	}
	
	@Test
	public void testAccountDeposit() {
		depositAmount=500.0;
		account.deposit(depositAmount);
		assertEquals(1500.0,account.getBalance());
	}
	@Test
	public void testZeroDepositThrowsException() {
		depositAmount=0;	
		assertThrows(IllegalArgumentException.class,()->{
			account.deposit(depositAmount);
		});		
	}
	
	@Test
	public void testNegativeDepositThrowsException() {
		depositAmount=-100.0;
	    assertThrows(IllegalArgumentException.class, () -> account.deposit(depositAmount));
	}
	
	@Test
	void testWithdrawalWithinOverdraft() {
		account.withdraw(1200.0); // Results in -200, which is within the 500 overdraft buffer
	    assertEquals(-200.0, account.getBalance());
	}

	@Test
	void testWithdrawalAboveOverdraft() {
	    assertThrows(InsufficientBalanceException.class, () -> account.withdraw(1700.0));
	}
	
	
}
