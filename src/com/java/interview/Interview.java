package com.java.interview;

import com.java.misc.Extender;

public class Interview {
    public static void main(String[] args) {
        System.out.print("Factorials: ");
        Extender.factorial(50);
        System.out.print("Prime Numbers: ");
        Extender.displayPrime(50);
        System.out.println("Palindrome ::String: " + Extender.isPalindrome("121"));
        System.out.print("Palindrome ::Numbers: ");
        Extender.showPalindromes(1000);
    }
}
