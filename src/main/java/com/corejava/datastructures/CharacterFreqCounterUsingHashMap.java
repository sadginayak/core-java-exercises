package com.corejava.datastructures;
import java.util.*;

/**
 * Counts the total occurrences of each character in the given string and 
 * returns them sequentially using a LinkedHashMap.
 * 
 * <p>Example: {@code "aabbccbae"} becomes {@code "a3b3c2e1"}</p>
 *
 * @param s the input string to be analyzed; must not be null or blank
 * @xl return a string containing each unique character followed by its total count, 
 *         or the original input if it is null or blank
 */
public class CharacterFreqCounterUsingHashMap {

	public static String freqCountInString(String s) {
		
		if(s==null||s.isBlank()) {
			return s;
		}		
		Map<Character,Integer> freqCountMap=new LinkedHashMap<>();
		StringBuilder sb= new StringBuilder();
		for(char c:s.toCharArray()) {
			freqCountMap.put(c, freqCountMap.getOrDefault(c, 0)+1);
		}
		for(var entry:freqCountMap.entrySet()) {
			sb.append(entry.getKey()).append(entry.getValue());
		}	
		return sb.toString();
	}
	
}
