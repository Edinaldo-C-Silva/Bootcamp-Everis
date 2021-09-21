package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RulesTest {
	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();
	
	@Test
	public void createNewFile() throws IOException {
		File created = tempFolder.newFile("file.txt");
		
		assertTrue(created.isFile());
		assertEquals(tempFolder.getRoot(), created.getParentFile());
	}
}
