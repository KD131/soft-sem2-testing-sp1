package org.example;

public class RomanNumeralConverter {
    public String arabicToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        if (number >= 1000) {
            sb.append("M".repeat(number / 1000));
            number %= 1000;
        }
        if (number >= 500) {
            sb.append("D");
            number -= 500;
        }
        if (number >= 100) {
            sb.append("C".repeat(number / 100));
            number %= 100;
        }
        if (number >= 10) {
            int tens = number / 10;
            if (tens == 9) {
                sb.append("XC");
            } else if (tens >= 5) {
                sb.append("L");
                tens -= 5;
                sb.append("X".repeat(tens));
            } else if (tens == 4) {
                sb.append("XL");
            } else {
                sb.append("X".repeat(tens));
            }
            number %= 10;
        }
        if (number >= 1) {
            int ones = number;
            if (ones == 9) {
                sb.append("IX");
            } else if (ones >= 5) {
                sb.append("V");
                ones -= 5;
                sb.append("I".repeat(ones));
            } else if (ones == 4) {
                sb.append("IV");
            } else {
                sb.append("I".repeat(ones));
            }
        }
        return sb.toString();
    }
}
