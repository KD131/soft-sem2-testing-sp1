package org.example;

public class RomanNumeralConverter {
    public String arabicToRoman(int number) {
        return "I".repeat(Math.max(0, number));
    }
}
