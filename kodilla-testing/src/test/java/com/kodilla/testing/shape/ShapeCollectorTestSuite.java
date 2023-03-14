package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Tests for ShapeCollector class")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for adding shapes")
    class TestsAdding {             // these tests test both addFigure and getFigure methods

        @Test
        void testAddCircle() {
            //Given
            ShapeCollector myCollector = new ShapeCollector();

            //When
            Circle myCircle = new Circle(2.8);
            myCollector.addFigure(myCircle);

            //Then
            Assertions.assertEquals(myCircle, myCollector.getFigure(0));
        }

        @Test
        void testAddSquare() {
            //Given
            ShapeCollector myCollector = new ShapeCollector();

            //When
            Square mySquare = new Square(4.89);
            myCollector.addFigure(mySquare);

            //Then
            Assertions.assertEquals(mySquare, myCollector.getFigure(0));
        }

        @Test
        void testAddTriangle() {
            //Given
            ShapeCollector myCollector = new ShapeCollector();

            //When
            Triangle myTriangle = new Triangle(7.22);
            myCollector.addFigure(myTriangle);

            //Then
            Assertions.assertEquals(myTriangle, myCollector.getFigure(0));
        }

    }

    @Nested
    @DisplayName("Tests for removing shapes")
    class TestsRemoving {

        @Test
        void testRemoveCircle() {
            //Given
            ShapeCollector myCollector = new ShapeCollector();
            Circle myCircle = new Circle(2.8);
            myCollector.addFigure(myCircle);

            //When
            boolean result = myCollector.removeFigure(myCircle);

            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveSquare() {
            //Given
            ShapeCollector myCollector = new ShapeCollector();
            Square mySquare = new Square(4.2);
            myCollector.addFigure(mySquare);

            //When
            boolean result = myCollector.removeFigure(mySquare);

            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testRemoveTriangle() {
            //Given
            ShapeCollector myCollector = new ShapeCollector();
            Triangle myTriangle = new Triangle(4.2);
            myCollector.addFigure(myTriangle);

            //When
            boolean result = myCollector.removeFigure(myTriangle);

            //Then
            Assertions.assertTrue(result);
        }

    }

    @Nested
    @DisplayName("Tests for showing figures")
    class TestsShowingShapes {

        @Test
        void testShowCircle() {
            //Given
            ShapeCollector myCollector = new ShapeCollector();
            Circle myCircle = new Circle(2.8);
            myCollector.addFigure(myCircle);

            //When
            String result = myCollector.showFigures();

            //Then
            Assertions.assertEquals(myCircle.getShapeName(), result);

        }

        @Test
        void testShowSquare() {
            //Given
            ShapeCollector myCollector = new ShapeCollector();
            Square mySquare = new Square(4.2);
            myCollector.addFigure(mySquare);

            //When
            String result = myCollector.showFigures();

            //Then
            Assertions.assertEquals(mySquare.getShapeName(), result);

        }

        @Test
        void testShowTriangle() {
            //Given
            ShapeCollector myCollector = new ShapeCollector();
            Triangle myTriangle = new Triangle(7.22);
            myCollector.addFigure(myTriangle);

            //When
            String result = myCollector.showFigures();

            //Then
            Assertions.assertEquals(myTriangle.getShapeName(), result);

        }

    }

}
