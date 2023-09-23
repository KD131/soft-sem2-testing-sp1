package org.example;

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
}