package com.java;

public class Interview {
    public static void main(String[] args) {
        try {
            //factorial(Integer.parseInt(args[0]));
            displayPrime(50);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("At least One argument is required");
        } catch (Exception e) {
            System.out.println("Oops...!" + e.getMessage());
        }
    }

    private static int factorial(int number) {
        return (number <= 1) ? 1 : number * factorial(number - 1);
    }

    private static void displayPrime(int number) {
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
