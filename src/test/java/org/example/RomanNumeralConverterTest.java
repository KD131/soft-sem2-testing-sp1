package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Disabled
    @Test
    void convert4AtoR() {
        int arabic = 4;
        assertEquals("IV", converter.arabicToRoman(arabic));
    }
}