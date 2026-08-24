package com.corejava.datastructures;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContainsDuplicateTest {

    @Test
    public void testStandardDuplicates() {
        int[] nums = {1, 2, 3, 1};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        Assert.assertTrue(result, "Array with duplicates should return true.");
    }

    @Test
    public void testAllDistinct() {
        int[] nums = {1, 2, 3, 4};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        Assert.assertFalse(result, "Array with all distinct elements should return false.");
    }

    @Test
    public void testAllIdentical() {
        int[] nums = {1, 1, 1, 1};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        Assert.assertTrue(result, "Array with identical elements should return true.");
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        Assert.assertFalse(result, "Single-element array should return false.");
    }

    @Test
    public void testNullInput() {
        boolean result = ContainsDuplicate.containsDuplicate(null);
        Assert.assertFalse(result, "Null input should safely return false.");
    }
}
