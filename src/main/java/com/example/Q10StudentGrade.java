package com.example;

public class Q10StudentGrade {
    public static String grade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be from 0 to 100.");
        }
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        if (marks >= 50) return "E";
        return "F";
    }

    public static void main(String[] args) {
        int marks = args.length > 0 ? Integer.parseInt(args[0]) : 85;
        System.out.println("Grade = " + grade(marks));
    }
}
