package com.example;

public class Q03LargestOfThree {
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int a = args.length > 0 ? Integer.parseInt(args[0]) : 10;
        int b = args.length > 1 ? Integer.parseInt(args[1]) : 30;
        int c = args.length > 2 ? Integer.parseInt(args[2]) : 20;
        System.out.println("Largest = " + largest(a, b, c));
    }
}
