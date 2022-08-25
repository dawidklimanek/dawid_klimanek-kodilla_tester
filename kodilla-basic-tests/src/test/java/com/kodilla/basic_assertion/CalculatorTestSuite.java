package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(14, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator1 = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator1.sub(a, b);
        assertEquals(-2, subResult);
    }

    @Test
    public void testPow() {
        Calculator calculator2 = new Calculator();
        double a = 4;
        double powResult = calculator2.pow(a);
        assertEquals(-16, powResult, 0.99);
    }

    @Test
    public void testPow1() {
        Calculator calculator3 = new Calculator();
        double a = 0;
        double powResult = calculator3.pow(a);
        assertEquals(16, powResult, 0.99);
    }
    @Test
    public void testPow2() {
        Calculator calculator4 = new Calculator();
        double a = -4;
        double powResult = calculator4.pow(a);
        assertEquals(-16, powResult, 0.99);
    }
}

