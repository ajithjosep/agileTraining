package com.jo.banking.agiltraining;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

	@Test
	public void testIsLeapYearDivBy4NotBy100()
	{
		Assert.assertTrue(LeapYearUtil.isLeapYear(2004));
		Assert.assertTrue(LeapYearUtil.isLeapYear(1996));
	}
	
	@Test
	public void testIsLeapYear0Input()
	{
		Assert.assertFalse(LeapYearUtil.isLeapYear(0));
		
	}
	
	@Test
	public void testIsLeapYearDivBy400()
	{
		Assert.assertTrue(LeapYearUtil.isLeapYear(2000));
		Assert.assertTrue(LeapYearUtil.isLeapYear(1600));
	}
	@Test
	public void testIsNotLeapYear()
	{
		Assert.assertFalse(LeapYearUtil.isLeapYear(2001));
		Assert.assertFalse(LeapYearUtil.isLeapYear(2017));
	}
}
