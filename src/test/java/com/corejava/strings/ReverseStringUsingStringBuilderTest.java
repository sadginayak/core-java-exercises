package com.corejava.strings;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;
public class ReverseStringUsingStringBuilderTest {

	@Test
	public void findReverseStringTest() {
		assertEquals(ReverseStringUsingStringBuilder.reverseString("Sadgi"),"igdaS","Reverse string is verified.");
	}
	@Test
	public void reverseStringWithAssertJTest() {
		String result= ReverseStringUsingStringBuilder.reverseString("HelloWorld!");
		
		assertThat(result).isNotNull();
	}
	@Test
    public void testReverseWithNullInput() {
        String result = ReverseStringUsingStringBuilder.reverseString(null);
        
        assertThat(result).isEmpty();
    }
	
	@Test
    public void testReverseWithBlankInput() {
        String result = ReverseStringUsingStringBuilder.reverseString("   ");
        
        assertThat(result).isEmpty();
    }
}
