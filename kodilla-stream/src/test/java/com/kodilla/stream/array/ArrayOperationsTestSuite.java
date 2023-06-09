package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] myArray = {2, 3, 4, 5, 6, 7, 8, 9};

        //When
        double result = ArrayOperations.getAverage(myArray);
        double expectedAvg = 5.5;

        //Then
        Assertions.assertEquals(expectedAvg, result);



    }

}
