package com.corejava.oop;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	private Map<String, Account> accounts;
	
	public Bank() {
		this.accounts= new HashMap<>();
	}
	
	public void addAccount(Account account) {
		if(account==null) {
			throw new IllegalArgumentException("Account can not be null.");
		}
		if(accounts.containsKey(account.getAccountNumber())) {
			throw new IllegalArgumentException("Account is already added.");
		}
		accounts.put(account.getAccountNumber(), account);
	}
	
    public Account findAccount(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found: " + accountNumber);
        }
        return account;
    }
    
    public void transferMoney(String fromAccountNumber,
            String toAccountNumber,
            double amount) {
    	
    	if(amount<=0) {
    		throw new IllegalArgumentException("Transfer amount must be greater than zero.");
    	}
    	if(fromAccountNumber==null||toAccountNumber==null) {
    		throw new IllegalArgumentException("Account numbers can not be null.");
    	}
    	if(fromAccountNumber.equalsIgnoreCase(toAccountNumber)){
    		throw new IllegalArgumentException("Source account can not be same as target account.");
    	}
    	
    	Account sourceAccount = accounts.get(fromAccountNumber);
        Account targetAccount = accounts.get(toAccountNumber);

        //Withdraw from source
        sourceAccount.withdraw(amount);

        try {
            //Attempt to deposit into target
            targetAccount.deposit(amount);
        } catch (Exception e) {
            // ROLLBACK: If deposit fails for any reason, put the money back!
            sourceAccount.deposit(amount);
            throw new RuntimeException("Transfer failed due to system error. Funds rolled back.", e);
        }
    }
	
}
