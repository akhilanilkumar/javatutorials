package com.java.misc;

public final class Extender {
    public static int factorial(int number) {
        return (number <= 1) ? 1 : number * factorial(number - 1);
    }

    public static void displayPrime(int number) {
        if (number < 2) {
            return;
        }
        boolean isPrime = true;
        for (int i = number / 2; i > 1; i--) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.print(number + "->");
        }
        displayPrime(--number);
    }
}
