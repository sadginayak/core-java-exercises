package com.corejava.oop;

public class BankMain {

	public static void main(String[] args) {


		System.out.println("--- Starting Bank system --- ");
		
		SavingsAccount savingsAccount = new SavingsAccount("SN-001", "Sadgi Nayak", 1000.00);
		System.out.println("Savings account Created for: " + savingsAccount.getCustomerName());
        System.out.println("Initial Balance: $" + savingsAccount.getBalance() + "\n");
        
        System.out.println("Testing valid Deposit.");
        savingsAccount.deposit(500.00);
        System.out.println("New amount after deposit:"+ savingsAccount.getBalance()+ "\n");
        
        System.out.println("Testing invalid deposit");
        try {
        	savingsAccount.deposit(-100);
        }catch(IllegalArgumentException e) {
        	System.out.println("Expected exception: " + e.getMessage());
        }
        
        System.out.println("\n"+"Testing insuffcient balance");
        try {
        	savingsAccount.withdraw(1450);
        } catch(InsufficientBalanceException e){
        	System.out.println("Expected exception: "+e.getMessage()); 	
        }
        
        System.out.println("\n"+"Testing valid withdrawal");
        savingsAccount.withdraw(100.0);
        System.out.println("New balance: "+savingsAccount.getBalance()+ "\n");
        
        // Current Account Testing
        
        // Notice how we use the parent 'Account' reference type!
        Account myCurrent = new CurrentAccount("CA-2001", "Sadgi Nayak", 200.0);
        System.out.println("Current Account Created for: " + myCurrent.getCustomerName());
        System.out.println("Initial Balance: $" + myCurrent.getBalance() + "\n");

        // Test valid overdraft withdrawal
        System.out.println("--- Testing Current Account Overdraft ---");
        myCurrent.withdraw(400.0);
        System.out.println("Withdrew $400.0 into overdraft. New Balance: $" + myCurrent.getBalance());

        // Test exceeding overdraft limit
        System.out.println("\n--- Testing Exceeded Overdraft Exception ---");
        try {
            // Balance is -200. Trying to withdraw another 400 makes it -600 (exceeds -500 limit)
            myCurrent.withdraw(400.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught Expected Exception: " + e.getMessage());
        }

        System.out.println("\nFinal Current Account Balance: $" + myCurrent.getBalance());
        
	}

}
