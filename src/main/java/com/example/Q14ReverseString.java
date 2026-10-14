package com.example;

public class Q14ReverseString {
    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        String text = args.length > 0 ? args[0] : "hello";
        System.out.println("Reversed = " + reverse(text));
    }
}
