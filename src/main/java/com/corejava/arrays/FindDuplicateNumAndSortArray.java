package com.corejava.arrays;
import java.util.*;

//🔹 Write a Java program 
//to find duplicate elements in an array and print the array in sorted order.
//nt arr[] = {9,9,1,4,3,7,6,6,5,2,2,0,11,0};
/**
 * Finds all duplicate elements in an integer array and returns them 
 * in a strictly sorted ascending order as a primitive int array.
 * 
 * <p><strong>Algorithm Steps:</strong></p>
 * <ol>
 *   <li>Validates input for null or insufficient length (&lt; 2).</li>
 *   <li>Populates a {@link java.util.TreeMap} to count element frequencies 
 *       while automatically sorting keys in natural ascending order.</li>
 *   <li>Filters keys whose frequency is greater than 1 into an intermediate list.</li>
 *   <li>Converts the filtered list into a primitive {@code int[]} using Java Streams.</li>
 * </ol>
 * 
 * @param inputArray the source array containing integer values
 * @return a primitive {@code int[]} containing unique duplicate elements sorted in ascending order, 
 *         or an empty array if no duplicates exist or input is invalid.
 */
public class FindDuplicateNumAndSortArray {
	
	public static int[] findDuplicateNumAndSortArray(int[] inputArray) {
		
		if(inputArray==null||inputArray.length<2) {
			return new int[0];
		}

		Map<Integer,Integer> freqCountmap= new TreeMap<>();//to sort the inserted array input
		for(int i:inputArray) {
			freqCountmap.put(i, freqCountmap.getOrDefault(i, 0)+1);
		}
		List<Integer> duplicateNumArray=new ArrayList<>();
		for(var entry:freqCountmap.entrySet()) {
			if(entry.getValue()>1) {
				duplicateNumArray.add(entry.getKey());
			}
		}	
		return duplicateNumArray.stream()
				.mapToInt(Integer::intValue)
				.toArray();
	}
}
