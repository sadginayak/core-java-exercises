package com.corejava.strings;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class RunLengthEncoderTest {
	
	@Test
	public void findNumberOfOccurancesInString_Test() {
		assertEquals(RunLengthEncoder.findNumberOfOccurancesInString("aabbccbae"),"a2b2c2b1a1e1");
	}
	@Test
	public void findNumberOfOccurancesInString_NullTest() {
		assertEquals(RunLengthEncoder.findNumberOfOccurancesInString(null),null,"Null input should return null.");
	}
	@Test
	public void findNumberOfOccurancesInString_BlankTest() {
		String input = "   ";
		assertEquals(RunLengthEncoder.findNumberOfOccurancesInString(input),input, "Blank input should return the original blank string.");
	}
	@Test
	public void findNumberOfOccurancesInString_SingleCharTest() {
		String input = "s";
		assertEquals(RunLengthEncoder.findNumberOfOccurancesInString(input),"s1");
	}
	@Test
    public void findNumberOfOccurancesInString_AllSameCharsTest() {
        assertEquals(RunLengthEncoder.findNumberOfOccurancesInString("aaaaa"), "a5");
    }
	@Test
    public void findNumberOfOccurancesInString_UniqueCharsTest() {
        assertEquals(RunLengthEncoder.findNumberOfOccurancesInString("abcdef"), "a1b1c1d1e1f1");
    }
}
