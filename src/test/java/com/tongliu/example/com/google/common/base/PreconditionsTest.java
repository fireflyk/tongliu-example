package com.tongliu.example.com.google.common.base;

import org.junit.Test;

import com.google.common.base.Preconditions;

public class PreconditionsTest {

	@Test(expected = IllegalStateException.class)
	public void testCheckState() {
		Preconditions.checkState(false);
	}
}
