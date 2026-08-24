package com.corejava.strings;

public class PalindromeWithTwoPointers {

	
	public static boolean isPalindromeWithPointers(String s) {
		if(s==null||s.isBlank()) {
			return false;
		}
		
		int left=0;
		int right=s.length()-1;
		
		
		while(left<right) {
			char cLeft= Character.toLowerCase(s.charAt(left));
			char cRight= Character.toLowerCase(s.charAt(right));
			
			// 1. If characters don't match, it's not a palindrome
			if(cLeft!=cRight) {
				return false;
			}
			// 2. Move pointers closer to the center
            left++;
            right--;
		}
	// 3. If loop finishes without returning false, it's a valid palindrome
			return true;
	}
}
