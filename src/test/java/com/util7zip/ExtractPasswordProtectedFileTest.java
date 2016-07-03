package com.util7zip;

import org.junit.Test;

public class ExtractPasswordProtectedFileTest {

    @Test
    public void testExtractAndPrint7ZipFile() throws Exception {

    	String fileName = "testFile.7z";
		String password = "password";
		PasswordProtectedFileExtractor passwordProtectedFileExtractor = new PasswordProtectedFileExtractor();
		passwordProtectedFileExtractor.extractAndPrint7ZipFile(fileName, password);

    }

}
