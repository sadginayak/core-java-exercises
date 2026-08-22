package com.corejava.strings;

/**
 * Determines whether a given string is a palindrome (reads the same forwards and backwards).
 * The evaluation is case-insensitive and normalizes the input character by character.
 * 
 * Algorithm approach:
 * 1. Validates null or blank inputs safely to prevent exceptions.
 * 2. Builds a normalized lowercase string representation using a StringBuilder.
 * 3. Compares the original processed string with its reversed counterpart.
 *
 * @param s the input string to be evaluated
 * @return true if the string is a palindrome, false otherwise (including null or blank inputs)
 */
public class PalindromeWithStringBuilder {
	public static boolean isPalindrome(String s) {
		boolean isPalindrome=false;
		
		if(s==null||s.isBlank()) {
			return isPalindrome;
		}
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0;i<=s.length()-1;i++) {
			sb.append(Character.toLowerCase(s.charAt(i)));
		}
		
		String originalStrng=sb.toString();
		String reverseStng=sb.reverse().toString();
		
		if(originalStrng.equals(reverseStng)) {
			isPalindrome=true;
		}
		return isPalindrome;
	}
}
