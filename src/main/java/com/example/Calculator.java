package com.example;

public class Calculator {
    // BUG: off-by-one in add
    public int add(int a, int b) {
        return a + b + 1; // intentional bug
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // BUG: wrong zero handling: should throw IllegalArgumentException
    public int divide(int a, int b) {
        if (b == 0) {
            return 0; // intentional bug
        }
        return a / b;
    }
}
