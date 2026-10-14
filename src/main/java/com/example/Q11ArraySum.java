package com.example;

import java.util.Arrays;

public class Q11ArraySum {
    public static long sum(int[] numbers) {
        long total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = args.length > 0
                ? Arrays.stream(args).mapToInt(Integer::parseInt).toArray()
                : new int[] {1, 2, 3, 4, 5};
        System.out.println("Array sum = " + sum(numbers));
    }
}
