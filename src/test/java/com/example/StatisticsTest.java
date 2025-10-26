package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatisticsTest {

    @Test
    void mean_simple() {
        Statistics s = new Statistics();
        assertEquals(2.0, s.mean(new int[]{1,2,3}), 1e-9); // will FAIL due to int division (returns 2 but as double 2.0? Actually pass; keep another to fail)
    }

    @Test
    void mean_nonInteger() {
        Statistics s = new Statistics();
        assertEquals(2.5, s.mean(new int[]{2,3}), 1e-9); // will FAIL (returns 2)
    }

    @Test
    void median_even_shouldAverage() {
        Statistics s = new Statistics();
        assertEquals(2.5, s.median(new int[]{1,2,3,4}), 1e-9); // will FAIL
    }

    @Test
    void variance_population() {
        Statistics s = new Statistics();
        assertEquals(2.0, s.variance(new double[]{1,2,3,4,5}), 1e-9);
    }
}
