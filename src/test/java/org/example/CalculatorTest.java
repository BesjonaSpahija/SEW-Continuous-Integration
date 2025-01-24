package org.example;

import static org.example.Calculator.calculateSinCos;
import static org.example.Calculator.convertToBinary;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7, calculator.add(3, 4));
        assertNotEquals(7, calculator.add(3, 3));
    }

    @Test
    void subtract(){
        assertEquals(1, calculator.subtract(5, 4));
        assertNotEquals(1, calculator.subtract(5, 3));
    }

    @Test
    void multiply(){
        assertEquals(12, calculator.multiply(3, 4));
        assertNotEquals(12, calculator.multiply(3, 3));
    }

    @Test
    void divide(){
        assertEquals(3, calculator.divide(9, 3));
        assertNotEquals(4, calculator.divide(9, 3));
    }

    @Test
    void divideByZero(){
        assertThrows(ArithmeticException.class, () -> calculator.divide(3, 0));
    }

    @Test
    void squareRoot() {
        assertEquals(4.0, calculator.squareRoot(16.0));
        assertNotEquals(5.0, calculator.squareRoot(16.0));
        assertEquals(0.0, calculator.squareRoot(0.0));
    }

    @Test
    void squareNumber() {
        assertEquals(25.0, calculator.squareNumber(5.0));
        assertEquals(0.0, calculator.squareNumber(0.0));
        assertEquals(9.0, calculator.squareNumber(-3.0));
    }

    @Test
    void testCalculateSinCos() {
        double[] result = calculateSinCos(0.0);
        assertEquals(0.0, result[0], 0.0001);
        assertEquals(1.0, result[1], 0.0001);
        result = calculateSinCos(90.0);
        assertEquals(1.0, result[0], 0.0001);
        assertEquals(0.0, result[1], 0.0001);

    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> calculateSinCos(Double.NaN), "Input is not a valid number");
    }

    @Test
    void testConvertToBinary() {
        // Test for positive numbers
        assertEquals("0", convertToBinary(0));
        assertEquals("1", convertToBinary(1));
        assertEquals("1010", convertToBinary(10));
        assertEquals("11001", convertToBinary(25));

        // Test for larger numbers
        assertEquals("11111111", convertToBinary(255));
    }
}

