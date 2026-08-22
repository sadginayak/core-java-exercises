package com.corejava.strings;
import java.util.*;
/**
 * Finds the first non-repeating character in a given string.
 * The search is case-insensitive (all characters are converted to lowercase).
 * Preserves the original character sequence order using a LinkedHashMap.
 *
 * @param s the input string to be evaluated
 * @return the first non-repeating character, or a space (' ') if no unique character 
 *         exists or if the input string is null/empty
 */
public class FirstNonRepeatingCharacterUsingMaps {

	
	public static char findFirstNonRepeatingCharacter(String s) {
		 char firstChar=' ';
		 
		 if(s==null||s.isBlank()) {
			 return firstChar; 
		 }
		 Map<Character,Integer> countFreqMap= new LinkedHashMap<>();
		 
		 for(char c:s.toLowerCase().toCharArray()) {
			 countFreqMap.put(c, countFreqMap.getOrDefault(c, 0)+1);
		 }
		 for(var entry:countFreqMap.entrySet()) {
			 if(entry.getValue()==1) {
				 firstChar=entry.getKey();
				 break;
			 }
		 }
		 if(firstChar==' ') {
			 System.out.println("no non repeating char is present");
		 }
		 return firstChar;
	}
}
