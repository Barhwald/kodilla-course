package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {

    @Test
    void testEdgeCases() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When and Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5, 0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2))


        );

    }


}
