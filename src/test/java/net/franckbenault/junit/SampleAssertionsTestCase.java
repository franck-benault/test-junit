package net.franckbenault.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleAssertionsTestCase {

	private int[] ints1 = {1,3};
	private int[] ints2 = {1,3};
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void t01AssertArrayEqualsTest() {
		assertArrayEquals(ints1, ints2);
	}

	@Test
	public void t02aAssertEquals() {
		assertEquals("String", "String");
	}
	
	@Test
	public void t02aAssertNotEquals() {
		assertNotEquals("String1", "String2");
	}
}
