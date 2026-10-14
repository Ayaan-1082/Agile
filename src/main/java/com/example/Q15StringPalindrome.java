package com.example;

public class Q15StringPalindrome {
    public static boolean isPalindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    public static void main(String[] args) {
        String text = args.length > 0 ? args[0] : "madam";
        System.out.println(text + (isPalindrome(text) ? " is a palindrome" : " is not a palindrome"));
    }
}
