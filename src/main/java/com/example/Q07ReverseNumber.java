package com.example;

public class Q07ReverseNumber {
    public static long reverse(int number) {
        long remaining = Math.abs((long) number);
        long result = 0;
        while (remaining > 0) {
            result = result * 10 + remaining % 10;
            remaining /= 10;
        }
        return number < 0 ? -result : result;
    }

    public static void main(String[] args) {
        int number = args.length > 0 ? Integer.parseInt(args[0]) : 123456789;
        System.out.println("Reversed = " + reverse(number));
    }
}
