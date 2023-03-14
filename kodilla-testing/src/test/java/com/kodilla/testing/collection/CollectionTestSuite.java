package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeAll
    public static void start() {
        System.out.println("Starting tests");
    }

    @AfterAll
    public static void end() {
        System.out.println("Tests finished");
    }

    @BeforeEach
    public void before() {
        System.out.println("Single test starting");
    }

    @AfterEach
    public void after() {
        System.out.println("Single test finished");
    }

    @DisplayName("when - create OddNumbersExterminator and put an empty list in, " +
            "then - it should return an empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator myExterminator = new OddNumbersExterminator();

        //When
        List<Integer> myList = new ArrayList<>();

        //Then
        Assertions.assertTrue(myExterminator.exterminate(myList).isEmpty());

    }


    @DisplayName("when - create OddNumbersExterminator and put a list of 1-12 in, " +
                        "then - it should return only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator myExterminator = new OddNumbersExterminator();

        //When
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> evenList = Arrays.asList(2, 4, 6, 8, 10, 12);

        //Then
        Assertions.assertEquals(evenList, myExterminator.exterminate(myList));

    }

}
