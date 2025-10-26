package com.example;

public class Converter {
    // BUG: wrong offset (+33 instead of +32)
    public double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 33.0; // intentional bug
    }

    // BUG: integer division if not careful (but here it's double; keep symmetrical)
    public double fahrenheitToCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }
}
