package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q06FibonacciTest {
    @Test
    public void generatesSeries() {
        assertArrayEquals(new long[] {0, 1, 1, 2, 3, 5, 8}, Q06Fibonacci.fibonacci(7));
    }

    @Test
    public void handlesShortSeries() {
        assertArrayEquals(new long[] {}, Q06Fibonacci.fibonacci(0));
        assertArrayEquals(new long[] {0}, Q06Fibonacci.fibonacci(1));
        assertArrayEquals(new long[] {0, 1}, Q06Fibonacci.fibonacci(2));
    }

    @Test
    public void handlesLargestSupportedSeries() {
        assertEquals(7540113804746346429L, Q06Fibonacci.fibonacci(93)[92]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsNegativeCount() {
        Q06Fibonacci.fibonacci(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsOverflow() {
        Q06Fibonacci.fibonacci(94);
    }
}
