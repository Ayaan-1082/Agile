package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Q10StudentGradeTest {
    @Test
    public void checksEveryGradeBoundary() {
        assertEquals("A", Q10StudentGrade.grade(90));
        assertEquals("B", Q10StudentGrade.grade(89));
        assertEquals("B", Q10StudentGrade.grade(80));
        assertEquals("C", Q10StudentGrade.grade(79));
        assertEquals("C", Q10StudentGrade.grade(70));
        assertEquals("D", Q10StudentGrade.grade(69));
        assertEquals("D", Q10StudentGrade.grade(60));
        assertEquals("E", Q10StudentGrade.grade(59));
        assertEquals("E", Q10StudentGrade.grade(50));
        assertEquals("F", Q10StudentGrade.grade(49));
    }

    @Test
    public void handlesExtremeValidMarks() {
        assertEquals("A", Q10StudentGrade.grade(100));
        assertEquals("F", Q10StudentGrade.grade(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsNegativeMarks() {
        Q10StudentGrade.grade(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectsMarksAbove100() {
        Q10StudentGrade.grade(101);
    }
}
