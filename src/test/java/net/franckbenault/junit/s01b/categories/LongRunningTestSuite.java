package net.franckbenault.junit.s01b.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({FastTestsCategory.class, SlowTestsCategory.class})
@SuiteClasses( { Fast1TestCase.class, Fast2TestCase.class,Mix1TestCase.class, Slow1TestCase.class })
public class LongRunningTestSuite {}