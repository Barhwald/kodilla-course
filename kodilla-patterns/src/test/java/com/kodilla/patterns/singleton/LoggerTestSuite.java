package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLogger() {
        logger = Logger.INSTANCE;
    }

    @Test
    void testGetLastLog() {
        //Given
        logger.log("Our vessel has just landed");

        //When
        String result = logger.getLastLog();

        //Then
        assertEquals("Our vessel has just landed", result);

    }


}
