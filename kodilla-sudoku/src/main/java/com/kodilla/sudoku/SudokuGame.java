package com.kodilla.sudoku;

import java.util.Random;

public class SudokuGame {

    public static final int SIZE = 9;
    private static final int RANDOM_VALUES_NUMBER = 9;
    private int[][] board = new int[9][9];
    private final SudokuDataPrinter dataPrinter = new SudokuDataPrinter();
    private final SudokuDataReader dataReader = new SudokuDataReader();
    private final SudokuSolver sudokuSolver = new SudokuSolver();
    private boolean isSudokuSolved = false;

    public void playGame() {
        dataPrinter.welcome();
        setInitialRandomValues();
        while (!isSudokuSolved) {
            dataPrinter.printBoard(board);
            interactWithPlayer();
            if (isBoardFilledOut(board)) {
                isSudokuSolved = true;
            }
        }
        dataPrinter.printBoard(board);
        dataPrinter.congratz();
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }

    public void setBoardElementValue(String input) {
        int col, row, num;
        col = Integer.parseInt(input.substring(0, 1));
        row = Integer.parseInt(input.substring(1, 2));
        num = Integer.parseInt(input.substring(2, 3));

        if (board[row-1][col-1] == 0 && sudokuSolver.isSafe(board, num, row-1, col-1)) {
            board[row - 1][col - 1] = num;
        } else {
            System.out.println("Invalid placement");
        }
    }

    public void setBoardElementValue(int num, int row, int col) {
        if (board[row][col] == 0) {
            board[row][col] = num;
        } else {
            System.out.println("Invalid placement");
        }
    }

    public void setInitialRandomValues() {
        Random randomGen = new Random();
        for (int i = 0; i < RANDOM_VALUES_NUMBER; i++) {
            int randomRow = randomGen.nextInt(9);
            int randomCol = randomGen.nextInt(9);
            int randomNum = randomGen.nextInt(9) + 1;
            if (sudokuSolver.isSafe(board, randomNum, randomRow, randomCol) && board[randomRow][randomCol] == 0) {
                setBoardElementValue(randomNum, randomRow, randomCol);
              System.out.println("Value " + randomNum + " set to col " + (randomCol + 1) + " and row " + (randomRow + 1));
            } else {
                i--;
            }
        }
    }

    public boolean isBoardFilledOut(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void interactWithPlayer() {
        boolean isValid = false;
        while (!isValid) {
            String input = dataReader.askTypeOfInput();
            if (input.equals("1")) {
                setBoardElementValue(dataReader.whereToPlaceValue());
                isValid = true;
            } else if (input.equalsIgnoreCase("SUDOKU")) {
                sudokuSolver.solveBoard(board);
                isValid = true;
            } else {
                System.out.println("Invalid input, try again!");
            }
        }
    }
}
