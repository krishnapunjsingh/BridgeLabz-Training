package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
        assertEquals(68.0, TemperatureConverter.celsiusToFahrenheit(20), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
        assertEquals(20.0, TemperatureConverter.fahrenheitToCelsius(68), 0.001);
    }
}
