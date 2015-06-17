package net.franckbenault.junit.s04.handlingexception;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import net.franckbenault.junit.Calculator;

import org.junit.Test;

public class CalculatorExceptionTestCase {



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
}
