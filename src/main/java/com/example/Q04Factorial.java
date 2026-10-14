package com.example;

public class Q04Factorial {
    public static long factorial(int number) {
        if (number < 0 || number > 20) {
            throw new IllegalArgumentException("Enter a number from 0 to 20.");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = args.length > 0 ? Integer.parseInt(args[0]) : 7;
        System.out.println(number + "! = " + factorial(number));
    }
}
