package org.example;

public class RomanNumeralConverter {
    /**
     * Convert a number from Arabic to Roman numerals.
     *
     * @param number arabic number to convert as an int
     * @return Roman numeral representation of number as a String
     * @throws IllegalArgumentException if number is not between 1 and 3999
     */
    public String arabicToRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        }

        StringBuilder sb = new StringBuilder();
        if (number >= 1000) {
            sb.append("M".repeat(number / 1000));
            number %= 1000;
        }
        if (number >= 100) {
            int hundreds = number / 100;
            if (hundreds == 9) {
                sb.append("CM");
            } else if (hundreds >= 5) {
                sb.append("D");
                hundreds -= 5;
                sb.append("C".repeat(hundreds));
            } else if (hundreds == 4) {
                sb.append("CD");
            } else {
                sb.append("C".repeat(hundreds));
            }
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
