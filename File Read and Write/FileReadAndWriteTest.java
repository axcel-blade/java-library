import java.util.*;
import java.io.*;
import java.nio.file.*;

class FileReadAndWriteTest {
    public static void main(String[] args) {
        FileReadAndWrite fileReadAndWrite = new FileReadAndWrite();

        fileReadTest(fileReadAndWrite);

        fileReadErrorTest(fileReadAndWrite);

        fileWriteTest(fileReadAndWrite);
    }

    public static void fileReadTest(FileReadAndWrite pFileReadAndWrite) {
        String fileName = "SampleRead";
        String[] fileContent = {"First Line", "Second Line", "Third Line"};

        assert Arrays.equals(fileContent, pFileReadAndWrite.fileRead(fileName)) : "Test Failed";
        System.out.println("Test Passed\n");
    }

    public static void fileReadErrorTest(FileReadAndWrite pFileReadAndWrite) {
        String fileName = "SampleErrorRead";
        String[] fileContent = {"First Line", "Second Line", "Third Line"};

        pFileReadAndWrite.fileRead(fileName);
        System.out.println("Test Passed\n");
    }

    public static void fileWriteTest(FileReadAndWrite pFileReadAndWrite) {
        String fileName = "SampleWrite";
        String[] writeContent = {"First", "Second", "Third"};
        Path filePath = Paths.get(fileName + ".txt");

        pFileReadAndWrite.fileWrite(fileName, writeContent);
        assert Files.exists(filePath) : "Test Failed";
        System.out.println("Test Passed\n");
    }
}