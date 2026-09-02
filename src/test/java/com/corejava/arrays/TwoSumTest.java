package com.corejava.arrays;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TwoSumTest {

	@Test
	public void findTwoSumHappyPathTest() {
		int[] num= {2,2,15,7,1};
		int target =9;
		int[] output= {1,3};
		
		int[] result= TwoSum.twoSums(num, target);
		assertEquals(result, output,"Two sum indices should match.");
	}
	
	@Test
    public void testEdgeCaseNullOrEmpty() {
        // Test null array
        int[] resultNull = TwoSum.twoSums(null, 9);
        assertTrue(resultNull.length == 0, "Null array should return an empty array.");

        // Test array with fewer than 2 elements
        int[] resultShort = TwoSum.twoSums(new int[]{5}, 5);
        assertTrue(resultShort.length == 0, "Array with less than 2 elements should return an empty array.");
    }
}
