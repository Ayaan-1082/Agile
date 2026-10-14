package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q02EvenOddTest {
    @Test
    public void recognizesEven() {
        assertTrue(Q02EvenOdd.isEven(4));
    }

    @Test
    public void recognizesOdd() {
        assertFalse(Q02EvenOdd.isEven(7));
    }

    @Test
    public void handlesZeroAndNegative() {
        assertTrue(Q02EvenOdd.isEven(0));
        assertFalse(Q02EvenOdd.isEven(-3));
    }
}
