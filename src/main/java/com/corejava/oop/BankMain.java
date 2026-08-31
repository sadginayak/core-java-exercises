package com.corejava.oop;

import java.util.HashMap;
import java.util.Map;

public class BankMain {

	private Map<String, Account> accounts;
	
	public BankMain() {
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
	
}
