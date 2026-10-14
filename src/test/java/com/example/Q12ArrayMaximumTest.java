package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q12ArrayMaximumTest {
    @Test
    public void findsMaximum() {
        assertEquals(40, Q12ArrayMaximum.maximum(new int[] {10, 40, 20, 30}));
    }

    @Test
    public void handlesNegativesAndSingleElement() {
        assertEquals(-2, Q12ArrayMaximum.maximum(new int[] {-10, -2, -8}));
        assertEquals(7, Q12ArrayMaximum.maximum(new int[] {7}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsEmptyArray() {
        Q12ArrayMaximum.maximum(new int[] {});
    }
}
