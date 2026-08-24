package com.corejava.strings;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PalindromeWithTwoPointersTest {

	@Test
	public void isPalindrom_test() {
		assertTrue(PalindromeWithTwoPointers.isPalindromeWithPointers("level"));
	}
	@Test
	public void isNotPalindrom_test() {
		assertFalse(PalindromeWithTwoPointers.isPalindromeWithPointers("sadgi"));
	}
	@Test
	public void isNumericPalindrom_test() {
		assertTrue(PalindromeWithTwoPointers.isPalindromeWithPointers("121"));
	}
	@Test
	public void isSpacePalindrom_test() {
		assertFalse(PalindromeWithTwoPointers.isPalindromeWithPointers("    "));
	}
	@Test
	public void isUpperCasePalindrom_test() {
		assertTrue(PalindromeWithTwoPointers.isPalindromeWithPointers("LeVEl"));
	}
	@Test
	public void isNullPalindrom_test() {
		assertFalse(PalindromeWithTwoPointers.isPalindromeWithPointers(null));
	}
	@Test
	public void isCharPalindrom_test() {
		assertTrue(PalindromeWithTwoPointers.isPalindromeWithPointers("s"));
	}
}
