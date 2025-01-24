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
            throw new IllegalArgumentException("Square root of negative numbers is not allowed");
        }
        return Math.sqrt(a);
    }

    public double squareNumber(double a) {
        if (Double.isNaN(a)) {
            throw new IllegalArgumentException("Input is not a valid number");
        }
        return Math.pow(a, 2);
    }

    public static double[] calculateSinCos(double angle) {
        if (Double.isNaN(angle)) {
            throw new IllegalArgumentException("Input is not a valid number");
        }

        double radians = Math.toRadians(angle); // Convert angle to radians
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);

        return new double[]{sinValue, cosValue}; // Return sin and cos in an array
    }

}
