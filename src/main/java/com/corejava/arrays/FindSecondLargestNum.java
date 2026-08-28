package com.corejava.arrays;
import java.util.Optional;
/**
 * Utility class for efficiently finding the second largest element in an integer array.
 * 
 * <p><b>Algorithm & Performance:</b>
 * This implementation utilizes a single-pass linear scan 
 * <p><b>Edge Case Handling:</b>
 * <ul>
 *   <li>Returns {@link Optional#empty()} if the array is null or contains fewer than 2 elements.</li>
 *   <li>Safely handles arrays containing negative numbers using {@link Integer#MIN_VALUE}.</li>
 *   <li>Accounts for duplicate maximum values correctly during traversal.</li>
 * </ul>
 * 
 * @author Sadgi Nayak
 */
public class FindSecondLargestNum {
	public static Optional<Integer> findSecondLargestNum(int[] numArray) {

	      if(numArray==null||numArray.length<2) {
	        return Optional.empty();
	      }
	      int firstLargeNum=Integer.MIN_VALUE;
	      int secondLargeNum=Integer.MIN_VALUE;

	      for(int i=0;i<=numArray.length-1;i++){
	        if(numArray[i]>firstLargeNum){
	            secondLargeNum=firstLargeNum;
	            firstLargeNum=numArray[i];
	        }
	        else if(numArray[i]<firstLargeNum && numArray[i]>secondLargeNum){
	          secondLargeNum=numArray[i];
	        }
	      }
	      //edge case if all elements are same in array
	      if(secondLargeNum==Integer.MIN_VALUE){
	        return Optional.empty();
	      }
	      return Optional.ofNullable(secondLargeNum);
	  }
}

