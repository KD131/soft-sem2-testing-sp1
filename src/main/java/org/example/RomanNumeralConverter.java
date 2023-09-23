package org.example;

public class RomanNumeralConverter {
    public String arabicToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        if (number >= 1000) {
            sb.append("M".repeat(Math.max(0, number / 1000)));
            number %= 1000;
        }
        if (number >= 500) {
            sb.append("D");
            number -= 500;
        }
        if (number >= 100) {
            sb.append("C".repeat(Math.max(0, number / 100)));
            number %= 100;
        }
        if (number >= 50) {
            sb.append("L");
            number -= 50;
        }
        if (number >= 10) {
            sb.append("X".repeat(Math.max(0, number / 10)));
            number %= 10;
        }
        if (number >= 5) {
            sb.append("V");
            number -= 5;
        }
        sb.append("I".repeat(Math.max(0, number)));
        return sb.toString();
    }
}
