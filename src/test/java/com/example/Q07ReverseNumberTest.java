package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q07ReverseNumberTest {
    @Test
    public void reversesDigits() {
        assertEquals(4321L, Q07ReverseNumber.reverse(1234));
    }

    @Test
    public void handlesZeroAndTrailingZeros() {
        assertEquals(0L, Q07ReverseNumber.reverse(0));
        assertEquals(21L, Q07ReverseNumber.reverse(1200));
    }

    @Test
    public void handlesNegativesAndIntMinimum() {
        assertEquals(-321L, Q07ReverseNumber.reverse(-123));
        assertEquals(-8463847412L, Q07ReverseNumber.reverse(Integer.MIN_VALUE));
    }
}
