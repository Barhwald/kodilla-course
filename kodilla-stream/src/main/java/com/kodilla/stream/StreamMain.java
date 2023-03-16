package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Stół z krzywymi nogami", String::toUpperCase);
        poemBeautifier.beautify("      Ala ma kota, psa i kolorową krowę    ", String::strip);
        poemBeautifier.beautify("alfabet", (a) -> "ABC-" + a + "-ABC");
        poemBeautifier.beautify("Mia food bag salmon oil", (a) -> {
            String[] stringArray = a.split("\\s+");
            String result = "";
            for (String element : stringArray) {
                result = result + element + ", ";
            }
            return result.substring(0, result.length() - 2);
        });
        poemBeautifier.beautify("The Restoration of Erathia", (a) -> {
            String trimmed = a.replaceAll("\\s+","");
            String result = "";
            for (int i = 0; i < trimmed.length(); i++) {
                if (i % 2 != 1) {
                    char x = trimmed.charAt(i);
                    result = result + x;
                }
            }
            return result;
        });

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}