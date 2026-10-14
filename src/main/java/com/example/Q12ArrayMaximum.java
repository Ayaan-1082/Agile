package com.example;

import java.util.Arrays;

public class Q12ArrayMaximum {
    public static int maximum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = args.length > 0
                ? Arrays.stream(args).mapToInt(Integer::parseInt).toArray()
                : new int[] {10, 40, 20, 30};
        System.out.println("Maximum = " + maximum(numbers));
    }
}
