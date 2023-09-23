package org.example;

public class RomanNumeralConverter {
    public String arabicToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        if (number >= 5) {
            sb.append("V");
            number -= 5;
        }
        sb.append("I".repeat(Math.max(0, number)));
        return sb.toString();
    }
}
