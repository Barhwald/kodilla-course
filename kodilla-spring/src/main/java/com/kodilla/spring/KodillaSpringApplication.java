package com.kodilla.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaSpringApplication.class, args);
//        System.out.println(fibonacci(4));
//        System.out.println(fibonacci(5));
//        System.out.println(fibonacci(6));
//        System.out.println(fibonacci(7));
//        System.out.println(fibonacci(8));
//        System.out.println(fibonacci(9));
//        System.out.println(fibonacci(10));
        System.out.println(recurrentFibonacci(1));
        System.out.println(recurrentFibonacci(2));
        System.out.println(recurrentFibonacci(3));
        System.out.println(recurrentFibonacci(4));
        System.out.println(recurrentFibonacci(5));


    }


    public static int fibonacci(int n) {

        int first = 0;
        int second = 1;

        if (n == 1) {
            return first;
        }

        if (n == 2) {
            return second;
        }

        for (int i = 2; i < n; i++) {
            int temp = second;
            second += first;
            first = temp;

        }
        return second;

    }

    public static int recurrentFibonacci(int n) {
        if (n < 3) {
            return 1;
        }
        return recurrentFibonacci(n-2) + recurrentFibonacci(n-1);
    }
}
