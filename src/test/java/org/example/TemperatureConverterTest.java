package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    public static TemperatureConverter converter = new TemperatureConverter();

    @Test
    void convertNegative40FtoC() {
        double fahrenheit = -40;
        assertEquals(-40, converter.fahrenheitToCelsius(fahrenheit));
    }

    @Test
    void convertNegative22FtoC() {
        double fahrenheit = -22;
        assertEquals(-30, converter.fahrenheitToCelsius(fahrenheit));
    }

    @Test
    void convert41FtoC() {
        double fahrenheit = 41;
        assertEquals(5, converter.fahrenheitToCelsius(fahrenheit));
    }

    @Test
    void convert77FtoC() {
        double fahrenheit = 77;
        assertEquals(25, converter.fahrenheitToCelsius(fahrenheit));
    }

    @Test
    void convert0FtoC() {
        double fahrenheit = 0;
        assertEquals(-17.77777777777778, converter.fahrenheitToCelsius(fahrenheit));
    }

    @Test
    void convertNegative40CtoF() {
        double celsius = -40;
        assertEquals(-40, converter.celsiusToFahrenheit(celsius));
    }

    @Test
    void convertNegative30CtoF() {
        double celsius = -30;
        assertEquals(-22, converter.celsiusToFahrenheit(celsius));
    }

    @Test
    void convert5CtoF() {
        double celsius = 5;
        assertEquals(41, converter.celsiusToFahrenheit(celsius));
    }

    @Test
    void convert0CtoF() {
        double celsius = 0;
        assertEquals(32, converter.celsiusToFahrenheit(celsius));
    }

    @Test
    void convert100CtoF() {
        double celsius = 100;
        assertEquals(212, converter.celsiusToFahrenheit(celsius));
    }

    @Test
    void convert69CtoF() {
        double celsius = 69;
        assertEquals(156.2, converter.celsiusToFahrenheit(celsius));
    }
}