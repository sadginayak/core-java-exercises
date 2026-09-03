package com.corejava.datastructures;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
public class FindCommonTestIdsTest {

	
	@Test
    public void testCommonTestIdsStandard() {
        int[] chromeRuns = {105, 101, 108, 102, 103};
        int[] firefoxRuns = {102, 108, 101, 110, 112};
        
        int[] expected = {101, 102, 108};
        int[] actual = FindCommonTestIds.findCommonTestIdsAndSort(chromeRuns, firefoxRuns);
        
        assertEquals(actual, expected, "Should return common test IDs sorted in ascending order.");
    }

    @Test
    public void testWithDuplicatesInInputs() {
        int[] chromeRuns = {105, 101, 101, 108, 102};
        int[] firefoxRuns = {102, 102, 108, 101, 110};
        
        int[] expected = {101, 102, 108}; // Duplicates should be filtered out
        int[] actual = FindCommonTestIds.findCommonTestIdsAndSort(chromeRuns, firefoxRuns);
        
        assertEquals(actual, expected, "Should handle duplicate entries and keep results unique.");
    }

    @Test
    public void testNoIntersection() {
        int[] chromeRuns = {101, 102, 103};
        int[] firefoxRuns = {201, 202, 203};
        
        int[] expected = {};
        int[] actual = FindCommonTestIds.findCommonTestIdsAndSort(chromeRuns, firefoxRuns);
        
        assertEquals(actual, expected, "Should return an empty array when no IDs match.");
    }

    @Test
    public void testNullInputs() {
        int[] chromeRuns = {101, 102};
        
        int[] resultNull1 = FindCommonTestIds.findCommonTestIdsAndSort(null, chromeRuns);
        int[] resultNull2 = FindCommonTestIds.findCommonTestIdsAndSort(chromeRuns, null);
        
        assertNotNull(resultNull1);
        assertEquals(resultNull1.length, 0, "Should handle null first array safely.");
        
        assertNotNull(resultNull2);
        assertEquals(resultNull2.length, 0, "Should handle null second array safely.");
    }
}
