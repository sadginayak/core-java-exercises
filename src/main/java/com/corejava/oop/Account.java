package com.corejava.oop;


/**
 * Represents a generic Bank Account. 
 * This is an abstract base class that encapsulates core account properties 
 * and defines common banking behaviors while leaving specific rules 
 * (like withdrawals) to concrete child classes.
 */	
public abstract class Account {
	
	
	private String accountNumber;
	private String customerName;
	protected double balance;
	
	/**
	 * Constructs a new Account with the specified details.
	 * 
	 * @param accountNumber the unique account identifier
	 * @param customerName  the name of the account holder
	 * @param balance       the starting balance of the account
	 */
	public Account(String accountNumber, String customerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getBalance() {
		return balance;
	}
	
	/**
	 * Abstract method to withdraw a specified amount. 
	 * Must be implemented by child classes to enforce specific account rules.
	 * 
	 * @param amount the amount to withdraw
	 */
	public abstract void withdraw(double amount);
	
	/**
	 * Deposits a specified amount into the account.
	 * Validates that the amount is greater than zero before updating the balance.
	 * 
	 * @param amount the amount to deposit
	 * @throws IllegalArgumentException if the deposit amount is zero or negative
	 */
	public void deposit(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("Deposit Amount must be greator than zero.");
		}
		this.balance+=amount;
	}
}
