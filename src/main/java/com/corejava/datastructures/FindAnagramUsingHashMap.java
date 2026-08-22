package com.corejava.datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * Determines whether two strings are valid anagrams of each other using a frequency map.
 * The comparison is case-insensitive and checks that both strings have equal lengths 
 * and identical character counts.
 * 
 * Algorithm approach:
 * 1. Validates null checks and ensures lengths are identical.
 * 2. Counts frequencies of all characters in the first string.
 * 3. Decrements counts using the second string; removes keys when their count reaches zero.
 * 4. Returns true if the map is completely empty at the end.
 *
 * @param s1 the first input string
 * @param s2 the second input string
 * @return true if s1 and s2 are anagrams, false otherwise
 */
public class FindAnagramUsingHashMap {
	
	
	public static boolean findStringsAreAnagramusingHashMap(String s1, String s2){

		boolean isAnagram = false;//defining a return variable 
	
		//edge case - if the string is null or length is not equal then fail
		if(s1==null || s2==null || s1.length()!=s2.length()){
			System.out.println("s1 and s2 are empty or length unequal" + s1 + s2);
			return isAnagram;
		}
		
		Map<Character, Integer> s1FrequecyCount = new HashMap<>();
		
		for (char c:s1.toLowerCase().toCharArray()) {
			
			s1FrequecyCount.put(c, s1FrequecyCount.getOrDefault(c, 0) + 1);
		}

		
		for (char c2:s2.toLowerCase().toCharArray()) {
			
			if(!s1FrequecyCount.containsKey(c2)) {
				System.out.println("string input is not same");
				return false;
			}
			s1FrequecyCount.put(c2, s1FrequecyCount.get(c2) - 1);
			
			
			if(s1FrequecyCount.get(c2)==0) {
				s1FrequecyCount.remove(c2);
			}
		}
		
		if(s1FrequecyCount.isEmpty()) {
			isAnagram= true;
		}
		return isAnagram;
	}
}
