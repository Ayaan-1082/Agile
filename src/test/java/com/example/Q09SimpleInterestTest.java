package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q09SimpleInterestTest {
    @Test
    public void calculatesInterest() {
        assertEquals(100.0, Q09SimpleInterest.simpleInterest(1000, 5, 2), 0.000001);
    }

    @Test
    public void handlesFractionalAndZeroValues() {
        assertEquals(187.5, Q09SimpleInterest.simpleInterest(2500, 7.5, 1), 0.000001);
        assertEquals(0.0, Q09SimpleInterest.simpleInterest(1000, 0, 2), 0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsNegative() {
        Q09SimpleInterest.simpleInterest(-1000, 5, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsNaN() {
        Q09SimpleInterest.simpleInterest(1000, Double.NaN, 2);
    }
}
