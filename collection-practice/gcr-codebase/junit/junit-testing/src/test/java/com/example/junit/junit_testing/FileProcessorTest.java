package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {

    FileProcessor fileProcessor = new FileProcessor();

    @TempDir
    Path tempDir;   // JUnit creates & deletes this automatically

    @Test
    void testWriteAndReadFile() throws IOException {
        Path filePath = tempDir.resolve("test.txt");
        String content = "Hello JUnit File Test";

        fileProcessor.writeToFile(filePath.toString(), content);
        String result = fileProcessor.readFromFile(filePath.toString());

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        Path filePath = tempDir.resolve("exists.txt");

        fileProcessor.writeToFile(filePath.toString(), "Test content");

        assertTrue(Files.exists(filePath));
    }

    @Test
    void testReadFromNonExistingFileThrowsException() {
        Path filePath = tempDir.resolve("missing.txt");

        assertThrows(
                IOException.class,
                () -> fileProcessor.readFromFile(filePath.toString())
        );
    }
}
