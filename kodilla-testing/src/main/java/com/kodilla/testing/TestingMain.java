package com.kodilla.testing;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.statistics.Data;

public class TestingMain {

    public static void main(String[] args) {

        System.out.println("Moduł 6. Wprowadzenie do testingu");

        System.out.println(findVowels("Elefantyna"));
        System.out.println(findVowels("Grzegorz"));

        System.out.println(ForumPost.class);


    }

    public static String findVowels(String input) {

        String output = "";

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            switch (ch) {

                case 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I',
                        'O', 'U', 'Y' -> output = output + ch;

            }

        }
        return output;
    }

}
