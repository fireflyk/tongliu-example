package com.tongliu.example.java.util;

import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.Test;

public class DecimalFormatTest {

	@Test
	public void testSimple() {
		Assert.assertEquals("12.3", getFormatDecimal(12.345d, "#.#"));
		Assert.assertEquals("12.35", getFormatDecimal(12.345d, "#.##"));
	}
	
	@Test
	public void testZeroHead() {
		Assert.assertEquals("12.345", getFormatDecimal(012.345d, "###.####"));
		Assert.assertEquals("012.345", getFormatDecimal(012.345d, "000.####"));
	}
	
	@Test
	public void testZeroTail() {
		Assert.assertEquals("12.345", getFormatDecimal(12.34500d, "#.####"));
		Assert.assertEquals("12.3450", getFormatDecimal(12.34500d, "#.0000"));
	}

	private String getFormatDecimal(double number, String pattern) {
		return new DecimalFormat(pattern).format(number);
	}
}
