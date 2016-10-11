package com.tongliu.example.com.google.common.base;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ComparisonChain;

public class ComparisonChainTest {

	@Test
	public void testCompare() {
		Assert.assertEquals(1, ComparisonChain.start()
				.compareFalseFirst(false, false)
				.compare(18, 18)
				.compare("tongliu", "fireflyk")
				.result());
	}
}
