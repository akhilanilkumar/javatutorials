package com.java.files;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        final String PATH = "E:\\Media\\Movies";
        File file = new File(PATH);
        if (file.exists() && file.isDirectory()) {
            recursiveFiles(file.listFiles(), 0, 0);
        }
    }

    private static void recursiveFiles(File[] files, int index, int level) {
        if (files.length == index) {
            return;
        }
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        File file = files[index];
        System.out.println(file.getName());
        if (file.isDirectory()) {
            recursiveFiles(file.listFiles(), 0, level + 1);
        }
        recursiveFiles(files, ++index, level);
    }

    private static int factorial(int number) {
        return (number <= 1) ? 1 : number * factorial(number - 1);
    }
}
