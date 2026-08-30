package com.corejava.oop;


/**
 * Custom exception thrown when a withdrawal is attempted 
 * and the account does not have sufficient funds or violates 
 * minimum balance rules.
 */
public class InsufficientBalanceException extends RuntimeException {

	// Constructor that accepts a custom error message
    public InsufficientBalanceException(String message) {
        super(message);
    }

}
