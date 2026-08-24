package com.corejava.strings;

//Input: "aabbccbae"
//Output: "a2b2c2b1a1e1"

/**
 * Compresses a given string using Run-Length Encoding (RLE).
 * Consecutive repeating characters are replaced by the character 
 * followed by the count of their consecutive occurrences.
 * 
 * <p>Example: {@code "aabbccbae"} becomes {@code "a2b2c2b1a1e1"}</p>
 *
 * @param s the input string to be compressed; must not be null or blank
 * @return the run-length encoded compressed string, or the original input 
 *         if it is null or blank
 */
public class RunLengthEncoder {

	
	public static String findNumberOfOccurancesInString(String s) {
		
		if(s==null||s.isBlank()) {
			return s;
		}
		
		StringBuilder sb= new StringBuilder();
		int count =1;
		
		for(int i=1;i<s.length();i++) {
			
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
			else{
				sb.append(s.charAt(i-1)).append(count);
				count=1;
			}
		}
		sb.append(s.charAt(s.length()-1)).append(count);
		
		return sb.toString();
		
	}
	
}
