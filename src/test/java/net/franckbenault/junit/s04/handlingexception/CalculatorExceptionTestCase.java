package net.franckbenault.junit.s04.handlingexception;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import net.franckbenault.junit.Calculator;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorExceptionTestCase {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testDivide01TryCatch() {
		try {
			Calculator.divide(1, 0);
			fail("Exception expected");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(e.getMessage(), "Could not divide by 0");
		
		}	
	}

	@Test(expected=IllegalArgumentException.class)
	public void testDivide02Exception() {
		
		Calculator.divide(1, 0);
	
	}
	
	@Test
	public void testDivide03JunitRule() {
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(CoreMatchers.containsString("Could not divide by 0"));
		
		Calculator.divide(1, 0);
	
	}
}
