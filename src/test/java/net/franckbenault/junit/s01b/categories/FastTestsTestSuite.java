package net.franckbenault.junit.s01b.categories;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Fast1TestCase.class, Fast2TestCase.class })
public class FastTestsTestSuite {

}
