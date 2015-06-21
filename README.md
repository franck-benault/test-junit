# test-junit
simple samples with junit library

# Installation (Maven)
Last version 4,12 : December 2014
```
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.12</version>
  <scope>test</scope>
</dependency>
```
one dependency : hamcrest-core (Matcher library)

# Goal of Junit
* Test Framework
 * organize the tests (before, after methods, test suites)
 * provide assertions
# Examples
## 01 tests regroupment
* Regroupment per class : @Suite
* Regroupment per test : @Category
## 02 assertions in Junit
* 6 groups of assertion
 * assertArrayEquals
 * assertEquals / assertNotEquals
 * assertTrue / assertFalse
 * assertNull / assertNotNull
 * assertSame /assertNotSame

assertThat (see hamcrest library)
## 03 Junit rules
TemporaryFolder rule
## 04 Handling exception
Fail with try catch bloc
@Test annotation with expected
