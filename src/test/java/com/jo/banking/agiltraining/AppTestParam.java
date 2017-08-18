package com.jo.banking.agiltraining;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AppTestParam {

	@Parameters(name="{0} is palindrome?= {1}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {{"madam",true},{"not palin",false}});
	};
	
	@Parameter(0)
	public  String input;
	@Parameter(1)
	public Boolean  output;
	
	@Test
	public void isPalinParamTest()
	{
		Assert.assertSame(Palindrome.isPalindrome(input), output);
	}
}
