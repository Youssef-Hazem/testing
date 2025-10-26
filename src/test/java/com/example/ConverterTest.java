package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {

    @Test
    void celsiusToFahrenheit_freezingPoint() {
        Converter cv = new Converter();
        assertEquals(32.0, cv.celsiusToFahrenheit(0.0), 1e-6,
                "0C should be 32F"); // will FAIL (+33 bug)
    }

    @Test
    void fahrenheitToCelsius_boilingPoint() {
        Converter cv = new Converter();
        assertEquals(100.0, cv.fahrenheitToCelsius(212.0), 1e-6);
    }
}
