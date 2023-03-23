package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public int countToPower(int base, int exponent) throws Exception {

        if (base < 0 && exponent < 0) {
            throw new Exception("Base or exponent below zero!");
        }

        if (base == 0) {
            return 0;
        }

        if (exponent == 0) {
            return 1;
        }

        int result = base;

        for (int i = 1; i < exponent; i++) {
            result *= base;
        }

        return result;
    }


    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        double result = 0;

        try {
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception " + e + " caught.");
        } finally {
            System.out.println(result);
        }

        //Zadanie dodatkowe

        try {
//            System.out.println(firstChallenge.countToPower(0, 4));
            firstChallenge.countToPower(0, 4);
        } catch (Exception e) {
            System.out.println("Exception " + e + " was just caught.");
        }

    }
}