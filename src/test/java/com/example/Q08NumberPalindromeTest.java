package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q08NumberPalindromeTest {
    @Test
    public void recognizesPalindrome() {
        assertTrue(Q08NumberPalindrome.isPalindrome(121));
        assertTrue(Q08NumberPalindrome.isPalindrome(0));
    }

    @Test
    public void rejectsNonPalindrome() {
        assertTrue(Q08NumberPalindrome.isPalindrome(123));
        assertFalse(Q08NumberPalindrome.isPalindrome(10));
    }

    @Test
    public void rejectsNegative() {
        assertFalse(Q08NumberPalindrome.isPalindrome(-121));
    }
}
