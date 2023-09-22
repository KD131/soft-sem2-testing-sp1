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
}