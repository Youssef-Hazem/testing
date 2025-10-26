package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void add_shouldSumTwoNumbers() {
        Calculator c = new Calculator();
        assertEquals(7, c.add(3, 4), "3+4 should be 7"); // will FAIL (off-by-one)
    }

    @Test
    void divide_byZero_shouldThrow() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> c.divide(4, 0),
                "Divide by zero should throw IllegalArgumentException"); // will FAIL
    }

    @Test
    void multiply_basic() {
        Calculator c = new Calculator();
        assertEquals(12, c.multiply(3,4));
    }
}
