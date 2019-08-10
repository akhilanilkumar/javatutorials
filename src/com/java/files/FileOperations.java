package com.java.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        doWriteFile();
        readFile();
    }

    private static void doWriteFile() {
        FileWriter writer = null;
        try {
            File file = new File(getFileParameter());
            writer = new FileWriter(file, file.exists());
            writer.write("This is just a sample text" + Math.random() + String.format("%n"));
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    private static String getFileParameter() {
        String directory = System.getProperty("user.home");
        String fileName = "SampleText.txt";
        return directory + File.separator + fileName;
    }

    private static void readFile() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(getFileParameter());
            StringBuilder stringBuilder = new StringBuilder();
            int ch;
            while ((ch = fileReader.read()) != -1) {
                stringBuilder.append((char) ch);
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
