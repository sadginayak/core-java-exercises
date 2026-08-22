package com.corejava.strings;
import java.util.*;

/**
 * Finds the last non-repeating character in a given string.
 * The search is case-insensitive (all characters are evaluated in lowercase).
 * 
 * Algorithm approach:
 * 1. Validates null or blank input strings.
 * 2. Populates a frequency map of all characters using a LinkedHashMap.
 * 3. Iterates backward through the original string from right to left, 
 *    returning the first character encountered that has a frequency count of 1.
 *
 * @param s the input string to be evaluated
 * @return the last non-repeating character, or a space (' ') if no unique character 
 *         exists or if the input string is null/blank
 */
public class LastNonRepeatingCharacterUsingMaps {

	public static char findLastNonRepeatingCharacter(String s) {
		char lastChar=' ';
		if(s==null||s.isBlank()) {
			return lastChar;
		}
		Map<Character,Integer> freqCountMap= new LinkedHashMap<>();
		
		for(char c:s.toLowerCase().toCharArray()) {
			freqCountMap.put(c, freqCountMap.getOrDefault(c, 0)+1);
		}
		/*
		 * for(var entry:freqCountMap.entrySet()) { if(entry.getValue()==1) {
		 * lastChar=entry.getKey(); } }
		 */
		
		for(int i=s.length()-1;i>=0;i--) {
			char c=Character.toLowerCase(s.charAt(i));
			if(freqCountMap.get(c)==1) {
				lastChar=c;
				return lastChar;
			}
		}

		System.out.println("No unique character");

		return lastChar;
	}
}
