package com.example;

public class Q13VowelCount {
    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = Character.toLowerCase(text.charAt(i));
            if ("aeiou".indexOf(letter) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = args.length > 0 ? args[0] : "Hello World";
        System.out.println("Vowels = " + countVowels(text));
    }
}
