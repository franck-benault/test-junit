package net.franckbenault.junit.s03.junitrules;


import java.io.File;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.TemporaryFolder;

public class ErrorCollectorRulesTestCase {
	
	@Rule
	public ErrorCollector collector = new ErrorCollector();



	@Ignore
	@Test//(expected=NullPointerException.class)
	public void testSample() throws IOException {
		collector.addError(new NullPointerException());
		collector.addError(new NullPointerException("two"));
	}

}
