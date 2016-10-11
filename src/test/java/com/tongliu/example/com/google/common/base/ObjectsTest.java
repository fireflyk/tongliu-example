package com.tongliu.example.com.google.common.base;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Objects;

public class ObjectsTest {
	
	@Test
	public void testEquals() {
		Assert.assertTrue(Objects.equal(null, null));
		Assert.assertTrue(Objects.equal(1, 1));
		
		Assert.assertFalse(Objects.equal(1, null));
		Assert.assertFalse(Objects.equal(1, 2));
	}
}
