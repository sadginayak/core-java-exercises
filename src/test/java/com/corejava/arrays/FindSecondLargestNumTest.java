package com.corejava.arrays;
import org.testng.annotations.Test;
import java.util.Optional;

import static org.testng.Assert.*;

public class FindSecondLargestNumTest {

    @Test
    public void testStandardArray() {
        int[] input = {30, 5, 25, 8, 35, 15};
        Optional<Integer> result = FindSecondLargestNum.findSecondLargestNum(input);
        
        assertTrue(result.isPresent(), "Result should be present");
        assertEquals(result.get(), Integer.valueOf(30), "Second largest number should be 30");
    }

    @Test
    public void testArrayWithDuplicateMaxValues() {
        int[] input = {35, 5, 25, 8, 30, 35};
        Optional<Integer> result = FindSecondLargestNum.findSecondLargestNum(input);
        
        assertTrue(result.isPresent(), "Result should be present");
        assertEquals(result.get(), Integer.valueOf(30), "Second largest number should be 30");
    }

    @Test
    public void testNegativeNumbers() {
        int[] input = {-5, -10, -2, -20};
        Optional<Integer> result = FindSecondLargestNum.findSecondLargestNum(input);
        
        assertTrue(result.isPresent(), "Result should be present for negative numbers");
        assertEquals(result.get(), Integer.valueOf(-5), "Second largest number should be -5");
    }

    @Test
    public void testAllIdenticalElements() {
        int[] input = {7, 7, 7, 7};
        Optional<Integer> result = FindSecondLargestNum.findSecondLargestNum(input);
        
        assertFalse(result.isPresent(), "Result should be empty when all elements are identical");
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] input = {42};
        Optional<Integer> result = FindSecondLargestNum.findSecondLargestNum(input);
        
        assertFalse(result.isPresent(), "Result should be empty for length < 2");
    }

    @Test
    public void testNullArray() {
        Optional<Integer> result = FindSecondLargestNum.findSecondLargestNum(null);
        
        assertFalse(result.isPresent(), "Result should be empty for a null array");
    }
}