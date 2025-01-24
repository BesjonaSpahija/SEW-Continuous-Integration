package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Divide by zero not allowed");
        }
        return a/b;
    }
    public double squareRoot(double a) {
        if (a < 0) {
            thrownewIllegalArgumentException("Square root of negative numbers is not allowed");
        }
        return Math.sqrt(a);
    }
}
