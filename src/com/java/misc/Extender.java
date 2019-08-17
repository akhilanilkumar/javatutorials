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
            System.out.print(number + ", ");
        }
        displayPrime(--number);
    }

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void showPalindromes(int limit) {
        for (int i = 0; i < limit; i++)
            if (reverse(i, 0) == i)
                System.out.print(i + ", ");
    }

    private static int reverse(int num, int rev) {
        return num == 0 ? rev : reverse(num / 10, rev * 10 + num % 10);
    }
}
