package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculationsAdd() {
        //Given
        //When
        double result = calculator.add(8, 4);

        //Then
        assertEquals(12, result);
    }

    @Test
    void testCalculationsSub() {
        //Given
        //When
        double result = calculator.sub(8, 4);

        //Then
        assertEquals(4, result);
    }

    @Test
    void testCalculationsMul() {
        //Given
        //When
        double result = calculator.mul(8, 4);

        //Then
        assertEquals(32, result);
    }

    @Test
    void testCalculationsDiv() {
        //Given
        //When
        double result = calculator.div(8, 4);

        //Then
        assertEquals(2, result);
    }

}
