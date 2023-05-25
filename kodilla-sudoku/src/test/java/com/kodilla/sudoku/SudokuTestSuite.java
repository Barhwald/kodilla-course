package com.kodilla.sudoku;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SudokuTestSuite {

    private final SudokuGame sudokuGame = new SudokuGame();
    private final SudokuDataPrinter dataPrinter = new SudokuDataPrinter();
    private final SudokuSolver sudokuSolver = new SudokuSolver();
    private final int[][] easyBoard = {
            {4, 0, 0, 0, 0, 0, 3, 9, 0},
            {0, 1, 0, 2, 0, 0, 7, 6, 0},
            {6, 0, 3, 0, 0, 1, 0, 0, 5},
            {5, 9, 8, 4, 3, 7, 0, 1, 0},
            {7, 0, 0, 9, 0, 0, 8, 0, 3},
            {1, 0, 0, 0, 8, 6, 0, 4, 7},
            {0, 0, 1, 0, 2, 9, 5, 0, 4},
            {0, 4, 9, 0, 0, 0, 0, 0, 2},
            {0, 0, 0, 3, 7, 0, 1, 0, 0}
    };

    private final int[][] mediumBoard = {
            {0, 3, 0, 4, 0, 0, 0, 6, 0},
            {0, 0, 0, 9, 1, 0, 0, 0, 0},
            {2, 0, 5, 0, 8, 0, 0, 9, 7},
            {0, 9, 7, 0, 3, 2, 0, 0, 5},
            {5, 0, 3, 0, 0, 4, 0, 0, 0},
            {1, 0, 0, 5, 9, 8, 7, 3, 0},
            {0, 6, 0, 3, 0, 0, 0, 0, 0},
            {0, 0, 4, 0, 7, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 4, 0, 0}
    };

    private final int[][] expertBoard = {
            {5, 0, 8, 0, 0, 7, 9, 0, 0},
            {0, 4, 0, 0, 0, 0, 6, 0, 0},
            {0, 0, 0, 8, 0, 3, 2, 4, 0},
            {6, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 2, 0},
            {0, 0, 9, 0, 7, 0, 0, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 5, 4},
            {0, 5, 0, 4, 0, 9, 0, 0, 0},
            {4, 0, 0, 0, 0, 0, 0, 1, 0}
    };

    private final int[][] evilBoard = {
            {4, 0, 0, 0, 0, 0, 0, 1, 8},
            {0, 0, 1, 0, 7, 8, 0, 0, 2},
            {0, 0, 0, 0, 3, 0, 0, 0, 0},
            {0, 0, 0, 6, 0, 0, 0, 0, 0},
            {0, 0, 4, 0, 1, 2, 0, 0, 7},
            {0, 5, 0, 0, 0, 0, 9, 0, 0},
            {0, 0, 0, 4, 0, 0, 0, 0, 6},
            {0, 0, 8, 3, 0, 0, 0, 0, 0},
            {9, 0, 0, 0, 8, 6, 7, 0, 0}
    };

    private void setGameBoard(int[][] board) {
        for (int i = 0; i < SudokuGame.SIZE; i++) {
            for (int j = 0; j < SudokuGame.SIZE; j++) {
                if (board[i][j] != 0) {
                    sudokuGame.setBoardElementValue(board[i][j], i, j);
                }
            }
        }
    }

    @Test
    void solveEasyGrid() {
        //given
        setGameBoard(easyBoard);
        dataPrinter.printBoard(sudokuGame.getBoard());

        //when
        boolean finished = sudokuSolver.solveBoard(sudokuGame.getBoard());

        //then
        Assertions.assertTrue(finished);
    }

    @Test
    void solveMediumGrid() {
        //given
        setGameBoard(mediumBoard);
        dataPrinter.printBoard(sudokuGame.getBoard());

        //when
        boolean finished = sudokuSolver.solveBoard(sudokuGame.getBoard());

        //then
        Assertions.assertTrue(finished);

    }

    @Test
    void solveExpertGrid() {
        //given
        setGameBoard(expertBoard);
        dataPrinter.printBoard(sudokuGame.getBoard());

        //when
        boolean finished = sudokuSolver.solveBoard(sudokuGame.getBoard());

        //then
        Assertions.assertTrue(finished);
    }

    @Test
    void solveEvilGrid() {
        //given
        setGameBoard(evilBoard);
        dataPrinter.printBoard(sudokuGame.getBoard());

        //when
        boolean finished = sudokuSolver.solveBoard(sudokuGame.getBoard());

        //then
        Assertions.assertTrue(finished);
    }

}
