package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q05PrimeTest {
    @Test
    public void recognizesPrimes() {
        assertTrue(Q05Prime.isPrime(2));
        assertTrue(Q05Prime.isPrime(17));
        assertTrue(Q05Prime.isPrime(2147483647));
    }

    @Test
    public void rejectsComposite() {
        assertFalse(Q05Prime.isPrime(9));
        assertFalse(Q05Prime.isPrime(25));
    }

    @Test
    public void rejectsNumbersBelowTwo() {
        assertFalse(Q05Prime.isPrime(1));
        assertFalse(Q05Prime.isPrime(0));
        assertFalse(Q05Prime.isPrime(-7));
    }
}
