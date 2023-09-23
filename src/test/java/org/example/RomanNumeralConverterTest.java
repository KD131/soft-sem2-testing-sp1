package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralConverterTest {
    public static RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    void convert1AtoR() {
        int arabic = 1;
        assertEquals("I", converter.arabicToRoman(arabic));
    }

    @Test
    void convert2AtoR() {
        int arabic = 2;
        assertEquals("II", converter.arabicToRoman(arabic));
    }

    @Test
    void convert3AtoR() {
        int arabic = 3;
        assertEquals("III", converter.arabicToRoman(arabic));
    }

    @Test
    void convert5AtoR() {
        int arabic = 5;
        assertEquals("V", converter.arabicToRoman(arabic));
    }

    @Test
    void convert10AtoR() {
        int arabic = 10;
        assertEquals("X", converter.arabicToRoman(arabic));
    }

    @Test
    void convert20AtoR() {
        int arabic = 20;
        assertEquals("XX", converter.arabicToRoman(arabic));
    }

    @Test
    void convert22AtoR() {
        int arabic = 22;
        assertEquals("XXII", converter.arabicToRoman(arabic));
    }

    @Test
    void convert25AtoR() {
        int arabic = 25;
        assertEquals("XXV", converter.arabicToRoman(arabic));
    }

    @Test
    void convert28AtoR() {
        int arabic = 28;
        assertEquals("XXVIII", converter.arabicToRoman(arabic));
    }

    @Test
    void convert50AtoR() {
        int arabic = 50;
        assertEquals("L", converter.arabicToRoman(arabic));
    }

    @Test
    void convert100AtoR() {
        int arabic = 100;
        assertEquals("C", converter.arabicToRoman(arabic));
    }

    @Test
    void convert500AtoR() {
        int arabic = 500;
        assertEquals("D", converter.arabicToRoman(arabic));
    }

    @Test
    void convert1000AtoR() {
        int arabic = 1000;
        assertEquals("M", converter.arabicToRoman(arabic));
    }

    @Test
    void convert4AtoR() {
        int arabic = 4;
        assertEquals("IV", converter.arabicToRoman(arabic));
    }

    @Test
    void convert9AtoR() {
        int arabic = 9;
        assertEquals("IX", converter.arabicToRoman(arabic));
    }

    @Test
    void convert7AtoR() {
        int arabic = 7;
        assertEquals("VII", converter.arabicToRoman(arabic));
    }

    @Test
    void convert8AtoR() {
        int arabic = 8;
        assertEquals("VIII", converter.arabicToRoman(arabic));
    }

    @Test
    void convert14AtoR() {
        int arabic = 14;
        assertEquals("XIV", converter.arabicToRoman(arabic));
    }

    @Test
    void convert66AtoR() {
        int arabic = 66;
        assertEquals("LXVI", converter.arabicToRoman(arabic));
    }

    @Test
    void convert99AtoR() {
        int arabic = 99;
        assertEquals("XCIX", converter.arabicToRoman(arabic));
    }

    @Test
    void convert44AtoR() {
        int arabic = 44;
        assertEquals("XLIV", converter.arabicToRoman(arabic));
    }

    @Test
    void convert444AtoR() {
        int arabic = 444;
        assertEquals("CDXLIV", converter.arabicToRoman(arabic));
    }

    @Test
    void convert999AtoR() {
        int arabic = 999;
        assertEquals("CMXCIX", converter.arabicToRoman(arabic));
    }

    @Test
    void convert1999AtoR() {
        int arabic = 1999;
        assertEquals("MCMXCIX", converter.arabicToRoman(arabic));
    }

    @Test
    void convert3999AtoR() {
        int arabic = 3999;
        assertEquals("MMMCMXCIX", converter.arabicToRoman(arabic));
    }
}