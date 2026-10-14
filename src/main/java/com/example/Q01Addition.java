package com.example;

public class Q01Addition {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = args.length > 0 ? Integer.parseInt(args[0]) : 2;
        int b = args.length > 1 ? Integer.parseInt(args[1]) : 3;
        System.out.println("Sum = " + add(a, b));
    }
}
