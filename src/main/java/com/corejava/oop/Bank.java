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
    	
    	if(sourceAccount==null||targetAccount==null) {
    		throw new IllegalArgumentException("Account does not exist.");
    	}
    	sourceAccount.withdraw(amount);
    	targetAccount.deposit(amount);
    }
	
}
