package com.jo.banking.agiltraining;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    
	@Test
    public void testAppSuccess()
    {
    	Assert.assertTrue(Palindrome.isPalindrome("mad am"));
    }
    @Test
    public void testAppFailure()
    {
    	Assert.assertFalse(Palindrome.isPalindrome("madam1"));
    }
}
