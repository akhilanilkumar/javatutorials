package com.java.files;

public class ListFiles {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int number) {
        return (number <= 1) ? 1 : number * factorial(number - 1);
    }
}
