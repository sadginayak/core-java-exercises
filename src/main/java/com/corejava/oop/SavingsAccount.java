package com.corejava.oop;

public class SavingsAccount extends Account{

	public SavingsAccount(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("Wihtdrawal of amount less or equal to Zero is not allowed.");
		}
		//minimum balance rule
		double minimum_balance=100.0;
		if((balance-amount)<minimum_balance) {
			throw new InsufficientBalanceException("Account does not have sufficient balance.");
		}
		this.balance=this.balance-amount;
	}

}
