package com.corejava.strings;

public class ReverseStringUsingStringBuilder {
	
	public static String reverseString(String s) {
		
		String reverseString="";
		if(s==null||s.isBlank()) {
			return reverseString;
		}
		StringBuilder sb= new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
