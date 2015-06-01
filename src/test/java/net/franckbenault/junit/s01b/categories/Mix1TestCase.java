package net.franckbenault.junit.s01b.categories;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTestsCategory.class)
public class Mix1TestCase {

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
	public void test() throws InterruptedException {
		Thread.sleep(10000);
		assertTrue("Dummy", true);
	}
	
	@Test
	@Category(FastTestsCategory.class)
	public void test2() throws InterruptedException {
		assertTrue("Dummy", true);
	}

}
