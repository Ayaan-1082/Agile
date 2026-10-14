package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q01AdditionTest {
    @Test
    public void addsTwoNumbers() {
        assertEquals(5, Q01Addition.add(2, 3));
    }

    @Test
    public void addsNegativeNumbers() {
        assertEquals(-5, Q01Addition.add(-2, -3));
    }

    @Test
    public void addsZero() {
        assertEquals(7, Q01Addition.add(7, 0));
    }
}
