package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q03LargestOfThreeTest {
    @Test
    public void findsLargestInEveryPosition() {
        assertEquals(30, Q03LargestOfThree.largest(30, 10, 20));
        assertEquals(30, Q03LargestOfThree.largest(10, 30, 20));
        assertEquals(30, Q03LargestOfThree.largest(10, 20, 30));
    }

    @Test
    public void handlesTiesAndNegatives() {
        assertEquals(5, Q03LargestOfThree.largest(5, 5, 3));
        assertEquals(-1, Q03LargestOfThree.largest(-10, -1, -5));
    }
}
