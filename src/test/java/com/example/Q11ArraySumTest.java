package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q11ArraySumTest {
    @Test
    public void sumsElements() {
        assertEquals(15L, Q11ArraySum.sum(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void handlesEmptyAndNegativeValues() {
        assertEquals(0L, Q11ArraySum.sum(new int[] {}));
        assertEquals(-2L, Q11ArraySum.sum(new int[] {-5, 3}));
    }

    @Test
    public void avoidsIntOverflow() {
        assertEquals(4294967294L, Q11ArraySum.sum(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE}));
    }
}
