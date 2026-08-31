package com.corejava.oop;

import static org.testng.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

    private BankMain bank;
    private SavingsAccount sampleAccount;

    // This runs automatically before every single test method to give us a fresh bank setup
    @BeforeEach
    public void setUp() {
        bank = new BankMain();
        sampleAccount = new SavingsAccount("SA-101", "Sadgi", 1000.0);
    }

    @Test
    public void testAddAccountSuccessfully() {
        // Act: Add the account
        bank.addAccount(sampleAccount);
        // Assert: Verify it was added by checking if we can find it back
        Account retrievedAccount = bank.findAccount("SA-101");
        assertNotNull(retrievedAccount);
        assertEquals("Sadgi", retrievedAccount.getCustomerName());
    }

    @Test
    public void testAddNullAccountThrowsException() {
        // Assert: Verify that passing null throws an IllegalArgumentException
         assertThrows(IllegalArgumentException.class, () -> {
            bank.addAccount(null);
        });
    }

    @Test
    public void testAddDuplicateAccountNumberThrowsException() {
        // Arrange: Add the account the first time
        bank.addAccount(sampleAccount);

        // Act & Assert: Try to add another account with the exact same account number ("SA-101")
        SavingsAccount duplicateAccount = new SavingsAccount("SA-101", "Kush", 500.0);
        
        assertThrows(IllegalArgumentException.class, () -> {
            bank.addAccount(duplicateAccount);
        });
    }
}
