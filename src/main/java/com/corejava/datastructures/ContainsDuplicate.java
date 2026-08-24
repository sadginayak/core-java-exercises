package com.corejava.datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * Checks whether an integer array contains any duplicate elements.
 * Utilizes a HashSet for O(1) lookups and returns true the moment 
 * a duplicate is encountered (early exit).
 *
 * @param inputArray the integer array to check
 * @return true if any value appears at least twice, false otherwise
 */
public class ContainsDuplicate {
	//int[] inputArray={1,2,3,1,4};
	  public static boolean containsDuplicate(int[] inputArray)
	  {
	    if(inputArray==null||inputArray.length<2){
	      return false;
	    }    
	    Map<Integer,Integer> arrayMap=new HashMap<>();
	    for(int i=0;i<=inputArray.length-1;i++){
	      
	      // If the set already contains the number, we can exit right now!
	      if(arrayMap.containsKey(inputArray[i])){
	        return true;
	      }
	      arrayMap.put(inputArray[i],i);
	    }
	    return false;
	  }
}
