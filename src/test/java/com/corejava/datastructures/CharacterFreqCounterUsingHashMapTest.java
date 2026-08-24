package com.corejava.datastructures;
import org.testng.annotations.*;

import com.corejava.datastructures.CharacterFreqCounterUsingHashMap;

import static org.testng.Assert.*;

public class CharacterFreqCounterUsingHashMapTest {
	
	@Test
	public void findNumberOfOccurancesInString_Test() {
		assertEquals(CharacterFreqCounterUsingHashMap.freqCountInString("aabbccbae"),"a3b3c2e1");
	}
	@Test
	public void findNumberOfOccurancesInString_AllSameTest() {
		assertEquals(CharacterFreqCounterUsingHashMap.freqCountInString("aaaa"),"a4");
	}
	@Test
	public void findNumberOfOccurancesInString_AllUniqueTest() {
		assertEquals(CharacterFreqCounterUsingHashMap.freqCountInString("abcde"),"a1b1c1d1e1");
	}
	@Test
    public void testCharacterFrequency_NullInput() {
        assertEquals(CharacterFreqCounterUsingHashMap.freqCountInString(null), null);
    }
}
