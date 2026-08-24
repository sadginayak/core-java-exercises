package com.corejava.strings;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


import java.util.Optional;

public class SortStringTest {

    @Test
    public void testSortString_HappyPathTest() {
    	// "Sadgi" converted to lower case and sorted should be "adgis"
        Optional<String> result = SortString.sortGivenString("Sadgi");
        assertTrue(result.isPresent());
        assertEquals(result.get(), "adgis");
    }

    @Test
    public void testSortString_AlreadySortedTest() {
    	Optional<String> result = SortString.sortGivenString("abcde");
        assertTrue(result.isPresent());
        assertEquals(result.get(), "abcde");
    }

    @Test
    public void testSortString_ReverseOrderTest() {
    	Optional<String> result = SortString.sortGivenString("edcba");
        assertTrue(result.isPresent());
        assertEquals(result.get(), "abcde");
    }

    @Test
    public void testSortString_BlankInputTest() {
        Optional<String> result = SortString.sortGivenString("   ");
        assertFalse(result.isPresent(), "Result should be empty for blank input");
    }

    @Test
    public void testSortString_SingleCharacterTest() {
        Optional<String> result = SortString.sortGivenString("a");
        assertTrue(result.isPresent());
        assertEquals(result.get(), "a");
    }
    @Test
    public void testSortString_NullInputTest() {
        Optional<String> result = SortString.sortGivenString(null);
        assertFalse(result.isPresent(), "Result should be empty for null input");
    }
}