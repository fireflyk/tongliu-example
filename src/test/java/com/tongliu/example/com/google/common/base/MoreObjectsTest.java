package com.tongliu.example.com.google.common.base;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class MoreObjectsTest {

	@Test
	public void testFirstNonNull() {
		Assert.assertEquals(new Integer(1), MoreObjects.firstNonNull(1, 2));
		Assert.assertEquals(new Integer(1), MoreObjects.firstNonNull(1, null));
		Assert.assertEquals(new Integer(2), MoreObjects.firstNonNull(null, 2));
	}

	@Test(expected = NullPointerException.class)
	public void testFirstNonNullException() {
		MoreObjects.firstNonNull(null, null);
	}
}
