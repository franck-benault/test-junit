package net.franckbenault.junit.s03.junitrules;


import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderRulesTestCase {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();



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
