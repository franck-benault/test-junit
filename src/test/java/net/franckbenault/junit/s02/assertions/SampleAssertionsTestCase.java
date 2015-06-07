package net.franckbenault.junit.s02.assertions;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

public class SampleAssertionsTestCase {

	@Test
	public void t01AssertArrayEqualsTest() {
		
		int[] ints1 = {1,3};
		int[] ints2 = {1,3};

		
		assertArrayEquals(ints1, ints2);
		assertArrayEquals("explanation",ints1, ints2);
	}

	@Test
	public void t02aAssertEquals() {
		assertEquals("String", "String");
		assertEquals("explanation","String", "String");
	}
	
	@Test
	public void t02bAssertNotEquals() {
		assertNotEquals("String1", "String2");
		assertNotEquals("explanation","String1", "String2");
	}
	
	@Test
	public void t03aAssertTrue() {
		assertTrue(true);
		assertTrue("explanation", true);
	}
	
	@Test
	public void t03bAssertFalse() {
		assertFalse(false);
		assertFalse("explanation", false);
	}
	
	@Test
	public void t04aAssertNull() {
		assertNull(null);
		assertNull("explanation",null);
	}
	
	@Test
	public void t04bAssertNotNull() {
		assertNotNull(new Object());
		assertNotNull("explanation",new Object());
	}
	
	@Test
	public void t05aAssertSame() {
		Object o = new Object();
		assertSame(o,o);
		assertSame("explanation",o,o);
	}
	
	@Test
	public void t05bAssertNotSame() {
		Object o1 = new Object();
		Object o2 = new Object();
		assertNotSame(o1, o2);
		assertNotSame("explanation",o1, o2);
		
		assertThat(o1,equalTo(o1));
	}
}
