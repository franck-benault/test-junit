package net.franckbenault.junit.s02.assertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleAssertionsTestCase {
	
	@Test(expected=ArithmeticException.class)
	public void t00fail() {
		int i1= 0;
		int i2= 0;
		
		int res = i1/i2;
		
		fail("exception expected");
	}

	@Test
	public void t01AssertArrayEqualsTest() {
		
		int[] ints1 = {1,3};
		int[] ints2 = {1,3};

		
		assertArrayEquals(ints1, ints2);
		assertArrayEquals("explanation",ints1, ints2);
	}

	@Test
	public void t02aAssertEquals() {
		
		String s1 = "a string";
		String s2 = "a string";
		
		assertEquals(s1, s2);
		assertEquals("explanation",s1, s2);
	}
	
	@Test
	public void t02bAssertNotEquals() {
		
		String s1 = "String1";
		String s2 = "String2";
		
		assertNotEquals(s1, s2);
		assertNotEquals("explanation",s1, s2);
	}
	
	@Test
	public void t03aAssertTrue() {
		
		boolean condition = true;
		
		assertTrue(condition);
		assertTrue("explanation", condition);
	}
	
	@Test
	public void t03bAssertFalse() {
		
		boolean condition = false;
		
		assertFalse(condition);
		assertFalse("explanation", condition);
	}
	
	@Test
	public void t04aAssertNull() {
		
		Object myObject = null;
		
		assertNull(myObject);
		assertNull("explanation",myObject);
	}
	
	@Test
	public void t04bAssertNotNull() {
		
		Object myObject = new Object();
		
		assertNotNull(myObject);
		assertNotNull("explanation",myObject);
	}
	
	@Test
	public void t05aAssertSame() {
		Object o1 = new Object();
		Object o2 = o1;
		assertSame(o1,o2);
		assertSame("explanation",o1,o1);
	}
	
	@Test
	public void t05bAssertNotSame() {
		Object o1 = new Object();
		Object o2 = new Object();
		assertNotSame(o1, o2);
		assertNotSame("explanation",o1, o2);
		
	
	}
}
