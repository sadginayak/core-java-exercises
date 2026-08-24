package com.corejava.arrays;
import java.util.*;
public class TwoSum {

	
	//nums = {2, 2, 15, 7, 2} with target = 9
	//output = {1,3}
	
	public static int[] twoSums(int[] inputArray,int target) {
		
		if(inputArray==null||inputArray.length<2) {
			return new int[0];
		}
		Map<Integer,Integer> newmap= new HashMap<>();
		
		for(int i=0;i<=inputArray.length;i++) {
			int isPresentNum= target - inputArray[i];
			
			if(newmap.containsKey(isPresentNum)) {
				return new int[] {newmap.get(isPresentNum),i};
			}
			newmap.put(inputArray[i], i);
		}	
		return new int[0];
	}
}
