package com.corejava.strings;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class PalindromeWithStringBuilderTest {

	@Test
	public void isPalindrom_test() {
		assertTrue(PalindromeWithStringBuilder.isPalindrome("level"));
	}
	@Test
	public void isNotPalindrom_test() {
		assertFalse(PalindromeWithStringBuilder.isPalindrome("sadgi"));
	}
	@Test
	public void isNumericPalindrom_test() {
		assertTrue(PalindromeWithStringBuilder.isPalindrome("121"));
	}
	@Test
	public void isSpacePalindrom_test() {
		assertFalse(PalindromeWithStringBuilder.isPalindrome("    "));
	}
	@Test
	public void isUpperCasePalindrom_test() {
		assertTrue(PalindromeWithStringBuilder.isPalindrome("LeVEl"));
	}
	@Test
	public void isNullPalindrom_test() {
		assertFalse(PalindromeWithStringBuilder.isPalindrome(null));
	}
	@Test
	public void isCharPalindrom_test() {
		assertTrue(PalindromeWithStringBuilder.isPalindrome("s"));
	}
}
