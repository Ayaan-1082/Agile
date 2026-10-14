package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q13VowelCountTest {
    @Test
    public void countsVowels() {
        assertEquals(3, Q13VowelCount.countVowels("Hello World"));
    }

    @Test
    public void handlesUppercase() {
        assertEquals(5, Q13VowelCount.countVowels("AEIOU"));
    }

    @Test
    public void handlesNoVowels() {
        assertEquals(0, Q13VowelCount.countVowels("rhythm 123!"));
        assertEquals(0, Q13VowelCount.countVowels(""));
    }
}
