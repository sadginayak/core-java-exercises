package com.corejava.strings;
import java.util.Optional;

public class SortString {
	public static Optional<String> sortGivenString(String s) {
			
			if(s==null||s.isBlank()) {
				return Optional.empty();
			}	
			char[] charArray= s.toLowerCase().toCharArray();
			//using selection sort
			for(int i=0;i<=charArray.length-1;i++) {
				//boss anchor, moves forward one steps at a time
				char temp=' ';
				for(int j=i+1; j<=charArray.length-1;j++) {
					//always start one step ahead from boss and move all the way to end of array,
					//hunting for anything smaller than the boss, if found swaps.				
					if(charArray[i]>charArray[j]) {
						temp=charArray[i];
						charArray[i]=charArray[j];
						charArray[j]=temp;
					}
				}
			}	
			return Optional.of(new String(charArray));
		}
}
