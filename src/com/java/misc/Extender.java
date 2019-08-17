package com.java.misc;

public final class Extender {
    public static int factorial(int number) {
        return (number <= 1) ? 1 : number * factorial(number - 1);
    }

    public static void displayPrime(int number) {
        if (number < 2) {
            System.out.println();
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

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void showPalindromes(int limit) {
        for (int i = 0, num; i < limit; i++) {
            num = i;
            int reverse = 0;
            while (num > 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }
            if (reverse == i) {
                System.out.print("|" + i + "|");
            }
        }
    }
}
