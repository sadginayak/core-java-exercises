package com.corejava.oop;

public class CurrentAccount extends Account {
	
	
	// Define an overdraft limit (e.g., account can go negative up to -500.0)
    private static final double OVERDRAFT_LIMIT = 500.0;
    
	public CurrentAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
	}

	@Override
	public void withdraw(double amount) {
		// 1. Validate amount
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }

        // 2. Check overdraft limit (balance minus amount cannot drop below -OVERDRAFT_LIMIT)
        if ((balance - amount) < -OVERDRAFT_LIMIT) {
            throw new InsufficientBalanceException("Withdrawal denied. Exceeded maximum overdraft limit of $" + OVERDRAFT_LIMIT);
        }

        // 3. Perform withdrawal (balance can become negative)
        this.balance -= amount;
		
	}

}
