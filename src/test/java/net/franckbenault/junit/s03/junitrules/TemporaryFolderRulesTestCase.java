package net.franckbenault.junit.s03.junitrules;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderRulesTestCase {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

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
	public void testCreateFile() throws IOException {
		File createdFile = folder.newFile("file1.txt");
		System.out.println(createdFile.getAbsoluteFile());
	}

	@Test
	public void testCreateFolder() throws IOException {
		File createdFolder = folder.newFolder("foo");
		System.out.println(createdFolder.getAbsoluteFile());
	}
}
