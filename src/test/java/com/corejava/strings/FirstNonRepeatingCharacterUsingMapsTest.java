package com.corejava.strings;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class FirstNonRepeatingCharacterUsingMapsTest {

	@Test
	public void testFirstNonRepeatingChar() {
		char result=FirstNonRepeatingCharacterUsingMaps.findFirstNonRepeatingCharacter("sshhhheetal");
		assertEquals(result, 't');	
	}
	@Test
	public void testFirstNonRepeatingChar_nonunique() {
		char result=FirstNonRepeatingCharacterUsingMaps.findFirstNonRepeatingCharacter("aabbccdd");
		assertEquals(result, ' ');	
	}
	@Test
	public void testFirstNonRepeatingChar_allunique() {
		char result=FirstNonRepeatingCharacterUsingMaps.findFirstNonRepeatingCharacter("abcd");
		assertEquals(result, 'a');	
	}
	@Test
	public void testFirstNonRepeatingChar_singlechar() {
		char result=FirstNonRepeatingCharacterUsingMaps.findFirstNonRepeatingCharacter("z");
		assertEquals(result, 'z');	
	}
	@Test
	public void testFirstNonRepeatingChar_uppercase() {
		char result=FirstNonRepeatingCharacterUsingMaps.findFirstNonRepeatingCharacter("AAaBcC");
		assertEquals(result, 'b');	
	}
	@Test
	public void testFirstNonRepeatingChar_emptyString() {
		char result=FirstNonRepeatingCharacterUsingMaps.findFirstNonRepeatingCharacter("");
		assertEquals(result, ' ');	
	}
	@Test
	public void testFirstNonRepeatingChar_nullString() {
		char result=FirstNonRepeatingCharacterUsingMaps.findFirstNonRepeatingCharacter(null);
		assertEquals(result, ' ');	
	}
	
}
