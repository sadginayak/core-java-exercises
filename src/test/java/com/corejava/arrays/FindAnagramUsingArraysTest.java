package com.corejava.arrays;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class FindAnagramUsingArraysTest {

	@Test
	public void testValidAnagrams() {
		
		//Standard
		assertTrue(FindAnagramUsingArrays.isAnagramUsingArrays("listen", "silent"));
		//Different Casing
		assertTrue(FindAnagramUsingArrays.isAnagramUsingArrays("Triangle", "inTegral"));
	}
	@Test
	public void testInvalidAnagrams() {
		assertFalse(FindAnagramUsingArrays.isAnagramUsingArrays("false", "truep"));
		//Different length
		assertFalse(FindAnagramUsingArrays.isAnagramUsingArrays("falsecase", "truep"));
	}
	@Test
	public void testEdgeCases() {
		assertFalse(FindAnagramUsingArrays.isAnagramUsingArrays("listen", null));
		assertFalse(FindAnagramUsingArrays.isAnagramUsingArrays(null, "silent"));
		assertFalse(FindAnagramUsingArrays.isAnagramUsingArrays(null, null));
	}
}
