package com.corejava.arrays;

import java.util.Arrays;

public class FindAnagramUsingArrays {

	public static boolean isAnagramUsingArrays(String s1, String s2) {
		boolean isAnagram= false;
		
		if(s1==null||s2==null||s1.length()!=s2.length()) {
			return isAnagram;
		}
		char[] arrayOfS1= s1.toLowerCase().toCharArray();
		char[] arrayOfS2= s2.toLowerCase().toCharArray();
		
		Arrays.sort(arrayOfS1);
		Arrays.sort(arrayOfS2);
		
		if(Arrays.equals(arrayOfS1, arrayOfS2)) {
			isAnagram=true;
		}		
		return isAnagram;
	}
}
