package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q04FactorialTest {
    @Test
    public void calculatesFactorial() {
        assertEquals(120L, Q04Factorial.factorial(5));
    }

    @Test
    public void handlesZeroAndOne() {
        assertEquals(1L, Q04Factorial.factorial(0));
        assertEquals(1L, Q04Factorial.factorial(1));
    }

    @Test
    public void handlesLargestSupportedValue() {
        assertEquals(2432902008176640000L, Q04Factorial.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsNegative() {
        Q04Factorial.factorial(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsOverflow() {
        Q04Factorial.factorial(21);
    }
}
