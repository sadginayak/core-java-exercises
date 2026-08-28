package com.corejava.datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Utility class for finding common test execution IDs across different browser runs (Array Intersection).
 * 
 * <p><b>Algorithm & Performance:</b>
 * This implementation utilizes a {@link HashSet}  and a 
 * {@link TreeSet} to ensure automatic sorting and uniqueness.
 * 
 * <p><b>Edge Case Handling:</b>
 * <ul>
 *   <li>Returns an empty array {@code new int[0]} if either input array is null.</li>
 *   <li>Automatically eliminates duplicate IDs from both input and output sets.</li>
 * </ul>
 * 
 * @author Sadgi Nayak
 */
public class FindCommonTestIds {
	
	public static int[] findCommonTestIdsAndSort(int[] inputArray1,int[] inputArray2){

	    if(inputArray1==null||inputArray2==null){
	      return new int[0];
	    }

	    Set<Integer> input2Set=new HashSet<>();
	    Set<Integer> commonTestIds=new TreeSet<>();
	    for(int i:inputArray2){
	      input2Set.add(i);
	    }
	    //System.out.println(input2Set);

	    for(int i=0;i<=inputArray1.length-1;i++){
	        if(input2Set.contains(inputArray1[i])){
	          commonTestIds.add(inputArray1[i]);
	         // input2Set.remove(id);
	        }
	    }
	    return commonTestIds.stream().mapToInt(Integer::intValue).toArray();
	  }

}
