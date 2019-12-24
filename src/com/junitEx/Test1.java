package com.junitEx;

import org.junit.Test;

import junit.framework.TestCase;

public class Test1 extends TestCase {

	private int a, b;

	public void setUp() {
		a = 3;
		b = 4;
	}

	@Test
	public void test() {
		assertEquals(3, a);
	}

	public void tearDown() {
		System.out.println("Noor...");
	}

}
