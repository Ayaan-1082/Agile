package com.example;

import java.util.Arrays;

public class Q06Fibonacci {
    public static long[] fibonacci(int count) {
        if (count < 0 || count > 93) {
            throw new IllegalArgumentException("Enter a term count from 0 to 93.");
        }
        long[] series = new long[count];
        if (count > 1) {
            series[1] = 1;
        }
        for (int i = 2; i < count; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }

    public static void main(String[] args) {
        int count = args.length > 0 ? Integer.parseInt(args[0]) : 7;
        System.out.println("Fibonacci = " + Arrays.toString(fibonacci(count)));
    }
}
