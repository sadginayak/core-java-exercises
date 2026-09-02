package com.corejava.arrays;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FindDuplicateNumAndSortArrayTest {

	@Test
	public void findDuplicateNumAndSortArrayTest() {
		int[] inputArray={9,9,1,4,3,7,6,6,5,2,2,0,11,0};
		int[] output= {0, 2, 6, 9};
		int[] result=FindDuplicateNumAndSortArray.findDuplicateNumAndSortArray(inputArray);
		assertEquals(result,output,"Verify the sorted Array is matching.");
	}
	
	@Test
    public void ArrayWithNoDuplicatesTest() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {};
        
        int[] actual = FindDuplicateNumAndSortArray.findDuplicateNumAndSortArray(input);
        
        assertEquals(actual, expected, "An array with no duplicates should return an empty array.");
    }
	@Test
    public void ArrayWithAllDuplicatesTest() {
        int[] input = {4, 4, 2, 2, 1, 1};
        int[] expected = {1, 2, 4};
        
        int[] actual = FindDuplicateNumAndSortArray.findDuplicateNumAndSortArray(input);
        
        assertEquals(actual, expected, "All duplicate values should be captured and sorted properly.");
    }
}
