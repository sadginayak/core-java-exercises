package com.corejava.oop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class SavingsAccountTest {
	double depositAmount;
    private Account account;
    
	@BeforeEach
    public void setUp() {
        account = new SavingsAccount("SA-101", "Sadgi", 1000.0);
    }
	@Test
	public void testSuccessfulDeposit() {
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
	public void testWithdrawalWithinMinimumBalance() {
	    account.withdraw(400.0); // Leaves 600
	    assertEquals(600.0, account.getBalance());
	}

	@Test
	public void testWithdrawalBelowMinimumBalance() {
	    // Trying to withdraw an amount that breaches the minimum balance limit
	    assertThrows(InsufficientBalanceException.class, () -> account.withdraw(950.0));
	}
}
