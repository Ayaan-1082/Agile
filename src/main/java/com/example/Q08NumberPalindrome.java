package com.example;

public class Q08NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        long reversed = 0;
        int remaining = number;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        return reversed == number;
    }

    public static void main(String[] args) {
        int number = args.length > 0 ? Integer.parseInt(args[0]) : 123;
        System.out.println(number + (isPalindrome(number) ? " is a palindrome" : " is not a palindrome"));
    }
}
