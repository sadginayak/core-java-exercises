package com.corejava.datastructures;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FindAnagramUsingHashMapTest {

    @Test
    public void testValidAnagrams() {
        // Standard anagram test
        assertTrue(FindAnagramUsingHashMap.findStringsAreAnagramusingHashMap("listen", "silent"));
        
        // Different casing test
        assertTrue(FindAnagramUsingHashMap.findStringsAreAnagramusingHashMap("Triangle", "Integral"));
    }

    @Test
    public void testNonAnagrams() {
        // Same length, different letters
        assertFalse(FindAnagramUsingHashMap.findStringsAreAnagramusingHashMap("hello", "world"));
        
        // Different lengths
        assertFalse(FindAnagramUsingHashMap.findStringsAreAnagramusingHashMap("java", "javascript"));
    }

    @Test
    public void testEdgeCases() {
        // Null checks
        assertFalse(FindAnagramUsingHashMap.findStringsAreAnagramusingHashMap(null, "silent"));
        assertFalse(FindAnagramUsingHashMap.findStringsAreAnagramusingHashMap("listen", null));
        assertFalse(FindAnagramUsingHashMap.findStringsAreAnagramusingHashMap(null, null));
    }
}