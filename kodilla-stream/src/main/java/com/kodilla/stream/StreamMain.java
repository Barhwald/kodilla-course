package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum myForum = new Forum();
        Map<Integer, ForumUser> myMap = myForum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears() > 20)
                .filter(forumUser -> forumUser.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        myMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        System.out.println(mirrorString("Adam"));
        System.out.println(mirrorString("Ewa"));
        System.out.println(mirrorString("Kajak"));

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("Stół z krzywymi nogami", String::toUpperCase);
//        poemBeautifier.beautify("      Ala ma kota, psa i kolorową krowę    ", String::strip);
//        poemBeautifier.beautify("alfabet", (a) -> "ABC-" + a + "-ABC");
//        poemBeautifier.beautify("Mia food bag salmon oil", (a) -> {
//            String[] stringArray = a.split("\\s+");
//            String result = "";
//            for (String element : stringArray) {
//                result = result + element + ", ";
//            }
//            return result.substring(0, result.length() - 2);
//        });
//        poemBeautifier.beautify("The Restoration of Erathia", (a) -> {
//            String trimmed = a.replaceAll("\\s+","");
//            String result = "";
//            for (int i = 0; i < trimmed.length(); i++) {
//                if (i % 2 != 1) {
//                    char x = trimmed.charAt(i);
//                    result = result + x;
//                }
//            }
//            return result;
//        });
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

        //        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]
//
//        System.out.println(theResultStringOfBooks);

//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));             // [1]
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());             // [2]
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
//                .forEach(System.out::println);


    }

    public static String mirrorString(String input) {

        String mirror = "";

        for (int i = 0; i < input.length(); i++) {
            mirror = input.charAt(i) + mirror;
        }

        return mirror;

    }
}