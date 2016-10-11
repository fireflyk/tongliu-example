package com.tongliu.example.com.google.common.base;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Strings;

public class StringsTest {
	
	@Test
	public void testIsNullOrEmpty() {
		Assert.assertFalse(Strings.isNullOrEmpty("tongliu"));
		Assert.assertTrue(Strings.isNullOrEmpty(""));
		Assert.assertTrue(Strings.isNullOrEmpty(null));
	}
	
	@Test
	public void testNullToEmpty() {
		Assert.assertEquals("", Strings.nullToEmpty(null));
	}
	
	@Test
	public void testEmptyToNull() {
		Assert.assertEquals("tongliu", Strings.emptyToNull("tongliu"));
		Assert.assertNull(Strings.emptyToNull(""));
		Assert.assertNull(Strings.emptyToNull(null));
	}
}
