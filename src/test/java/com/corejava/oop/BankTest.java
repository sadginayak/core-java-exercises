package com.corejava.oop;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

    private Bank bank;
    private SavingsAccount savingsAccount;
    private CurrentAccount currentAccount;

    // This runs automatically before every single test method to give us a fresh bank setup
    @BeforeEach
    public void setUp() {
        bank = new Bank();
        savingsAccount = new SavingsAccount("Jo-101", "John", 1000.0);
        currentAccount = new CurrentAccount("Ni-101", "Nick", 1000.0);
    }

    @Test
    public void testAddSavingsAccountSuccessfully() {
        // Act: Add the account
        bank.addAccount(savingsAccount);
        // Assert: Verify it was added by checking if we can find it back
        Account retrievedAccount = bank.findAccount("Jo-101");
        assertNotNull(retrievedAccount);
        assertEquals("John", retrievedAccount.getCustomerName());
    }
    
    @Test
    public void testAddCurrentAccountSuccessfully() {
        // Act: Add the account
        bank.addAccount(currentAccount);
        // Assert: Verify it was added by checking if we can find it back
        Account retrievedAccount = bank.findAccount("Ni-101");
        assertNotNull(retrievedAccount);
        assertEquals("Nick", retrievedAccount.getCustomerName());
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
        bank.addAccount(savingsAccount);

        // Act & Assert: Try to add another account with the exact same account number ("Jo-101")
        SavingsAccount duplicateAccount = new SavingsAccount("Jo-101", "Hary", 500.0);
        
        assertThrows(IllegalArgumentException.class, () -> {
            bank.addAccount(duplicateAccount);
        });
    }
    
    @Test
    public void testTransferMoney() {
    	bank.addAccount(savingsAccount);
    	bank.addAccount(currentAccount);
    	bank.transferMoney("Jo-101", "Ni-101", 500.0);
    	assertEquals(500.0, savingsAccount.getBalance());
        assertEquals(1500.0, currentAccount.getBalance());
    }
    
    @Test
    public void testTransferInsufficientFundsThrowsException() {
        bank.addAccount(savingsAccount); // Balance is 1000.0
        bank.addAccount(currentAccount);
        
        // Try to transfer more than available balance
        assertThrows(InsufficientBalanceException.class, () -> {
            bank.transferMoney("Jo-101", "Ni-101", 1500.0);
        });
    }
    @Test
    public void testTransferSameAccountThrowsException() {
        bank.addAccount(savingsAccount); // Balance is 1000.0
        bank.addAccount(currentAccount);
        
        // Try to transfer more than available balance
        assertThrows(IllegalArgumentException.class, () -> {
            bank.transferMoney("Jo-101", "Jo-101", 500.0);
        });
    }
    @Test
    public void testTransferInvalidAccountThrowsException() {
        bank.addAccount(savingsAccount); // Balance is 1000.0
        bank.addAccount(currentAccount);
        
        // Try to transfer more than available balance
        assertThrows(IllegalArgumentException.class, () -> {
            bank.transferMoney("Jo-101", "Ko-101", 500.0);
        });
    }
}
