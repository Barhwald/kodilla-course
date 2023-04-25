package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.printMovies();

        System.out.println();
        System.out.println(factorial(10));

    }

    // zadanie dodatkowe

    public static int factorial(int n) {

        int result = 1;

        while (n > 0) {
            result *= n;
            n -= 1;
        }

        return result;

    }

}
