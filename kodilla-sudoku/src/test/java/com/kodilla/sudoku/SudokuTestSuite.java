package com.kodilla.sudoku;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    private final int[][] solvedEasyBoard = {
            {4, 2, 7, 8, 6, 5, 3, 9, 1},
            {9, 1, 5, 2, 4, 3, 7, 6, 8},
            {6, 8, 3, 7, 9, 1, 4, 2, 5},
            {5, 9, 8, 4, 3, 7, 2, 1, 6},
            {7, 6, 4, 9, 1, 2, 8, 5, 3},
            {1, 3, 2, 5, 8, 6, 9, 4, 7},
            {8, 7, 1, 6, 2, 9, 5, 3, 4},
            {3, 4, 9, 1, 5, 8, 6, 7, 2},
            {2, 5, 6, 3, 7, 4, 1, 8, 9}
    };

    private final int[][] solvedMediumBoard = {
            {9, 3, 1, 4, 2, 7, 5, 6, 8},
            {6, 7, 8, 9, 1, 5, 3, 4, 2},
            {2, 4, 5, 6, 8, 3, 1, 9, 7},
            {4, 9, 7, 1, 3, 2, 6, 8, 5},
            {5, 8, 3, 7, 6, 4, 2, 1, 9},
            {1, 2, 6, 5, 9, 8, 7, 3, 4},
            {7, 6, 2, 3, 4, 9, 8, 5, 1},
            {3, 5, 4, 8, 7, 1, 9, 2, 6},
            {8, 1, 9, 2, 5, 6, 4, 7, 3}
    };

    private final int[][] solvedExpertBoard = {
            {5, 6, 8, 2, 4, 7, 9, 3, 1},
            {3, 4, 2, 1, 9, 5, 6, 7, 8},
            {1, 9, 7, 8, 6, 3, 2, 4, 5},
            {6, 8, 5, 3, 1, 2, 4, 9, 7},
            {7, 3, 4, 9, 5, 8, 1, 2, 6},
            {2, 1, 9, 6, 7, 4, 5, 8, 3},
            {9, 2, 6, 7, 8, 1, 3, 5, 4},
            {8, 5, 1, 4, 3, 9, 7, 6, 2},
            {4, 7, 3, 5, 2, 6, 8, 1, 9}
    };

    private final int[][] solvedEvilBoard = {
            {4, 7, 9, 2, 6, 5, 3, 1, 8},
            {5, 3, 1, 9, 7, 8, 4, 6, 2},
            {8, 6, 2, 1, 3, 4, 5, 7, 9},
            {1, 8, 7, 6, 5, 9, 2, 4, 3},
            {3, 9, 4, 8, 1, 2, 6, 5, 7},
            {2, 5, 6, 7, 4, 3, 9, 8, 1},
            {7, 2, 5, 4, 9, 1, 8, 3, 6},
            {6, 4, 8, 3, 2, 7, 1, 9, 5},
            {9, 1, 3, 5, 8, 6, 7, 2, 4}
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

    private boolean areBoardsEqual(int[][] board, int[][] solvedBoard) {
        for (int i = 0; i < SudokuGame.SIZE; i++) {
            for (int j = 0; j < SudokuGame.SIZE; j++) {
                if (board[i][j] != solvedBoard[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    void solveEasyBoard() {
        //given
        setGameBoard(easyBoard);
        sudokuSolver.solveBoard(sudokuGame.getBoard());

        //when
        boolean result = areBoardsEqual(sudokuGame.getBoard(), solvedEasyBoard);

        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    void solveMediumBoard() {
        //given
        setGameBoard(mediumBoard);
        sudokuSolver.solveBoard(sudokuGame.getBoard());

        //when
        boolean result = areBoardsEqual(sudokuGame.getBoard(), solvedMediumBoard);

        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    void solveExpertBoard() {
        //given
        setGameBoard(expertBoard);
        sudokuSolver.solveBoard(sudokuGame.getBoard());

        //when
        boolean result = areBoardsEqual(sudokuGame.getBoard(), solvedExpertBoard);

        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    void solveEvilBoard() {
        //given
        setGameBoard(evilBoard);
        sudokuSolver.solveBoard(sudokuGame.getBoard());

        //when
        boolean result = areBoardsEqual(sudokuGame.getBoard(), solvedEvilBoard);

        //then
        Assertions.assertEquals(true, result);
    }

}
