package com.corejava.strings;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class LastNonRepeatingCharacterUsingMapsTest {
	
	@Test
	public void testLastNonRepeatingChar() {
		char result=LastNonRepeatingCharacterUsingMaps.findLastNonRepeatingCharacter("sshhhheetal");
		assertEquals(result, 'l');	
	}
	@Test
	public void testLastNonRepeatingChar_nonunique() {
		char result=LastNonRepeatingCharacterUsingMaps.findLastNonRepeatingCharacter("aabbccdd");
		assertEquals(result, ' ');	
	}
	@Test
	public void testLastNonRepeatingChar_allunique() {
		char result=LastNonRepeatingCharacterUsingMaps.findLastNonRepeatingCharacter("abcd");
		assertEquals(result, 'd');	
	}
	@Test
	public void testLastNonRepeatingChar_singlechar() {
		char result=LastNonRepeatingCharacterUsingMaps.findLastNonRepeatingCharacter("z");
		assertEquals(result, 'z');	
	}
	@Test
	public void testLastNonRepeatingChar_uppercase() {
		char result=LastNonRepeatingCharacterUsingMaps.findLastNonRepeatingCharacter("AAaBbCDd");
		assertEquals(result, 'c');	
	}
	@Test
	public void testLastNonRepeatingChar_emptyString() {
		char result=LastNonRepeatingCharacterUsingMaps.findLastNonRepeatingCharacter(" ");
		assertEquals(result, ' ');	
	}
	@Test
	public void testLastNonRepeatingChar_nullString() {
		char result=LastNonRepeatingCharacterUsingMaps.findLastNonRepeatingCharacter(null);
		assertEquals(result, ' ');	
	}
	

}
