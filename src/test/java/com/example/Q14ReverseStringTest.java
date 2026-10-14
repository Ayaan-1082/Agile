package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q14ReverseStringTest {
    @Test
    public void reversesString() {
        assertEquals("olleh", Q14ReverseString.reverse("hello"));
    }

    @Test
    public void preservesSpacesAndCase() {
        assertEquals("b A", Q14ReverseString.reverse("A b"));
    }

    @Test
    public void handlesEmptyAndSingleCharacter() {
        assertEquals("", Q14ReverseString.reverse(""));
        assertEquals("x", Q14ReverseString.reverse("x"));
    }
}
