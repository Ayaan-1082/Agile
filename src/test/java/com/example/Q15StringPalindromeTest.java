package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q15StringPalindromeTest {
    @Test
    public void recognizesPalindrome() {
        assertTrue(Q15StringPalindrome.isPalindrome("madam"));
        assertTrue(Q15StringPalindrome.isPalindrome("abba"));
    }

    @Test
    public void rejectsNonPalindrome() {
        assertFalse(Q15StringPalindrome.isPalindrome("hello"));
        assertFalse(Q15StringPalindrome.isPalindrome("Madam"));
    }

    @Test
    public void handlesEmptyAndSingleCharacter() {
        assertTrue(Q15StringPalindrome.isPalindrome(""));
        assertTrue(Q15StringPalindrome.isPalindrome("x"));
    }
}
