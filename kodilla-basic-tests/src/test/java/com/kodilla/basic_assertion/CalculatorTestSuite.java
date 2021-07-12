package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13.0, sumResult,0.001);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquareNegative() {
        Calculator calculator = new Calculator();
        int a = -5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }

    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResult = calculator.square(a);
        assertEquals(0, squareResult);
    }

    @Test
    public void testSquarePositive() {
        Calculator calculator = new Calculator();
        int a = 4;
        int squareResult = calculator.square(a);
        assertEquals(16, squareResult);
    }
}
