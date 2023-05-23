package com.kodilla.sudoku;

public class SudokuSolver {

    public boolean isSafe(int[][] board, int number, int row, int col) {
        return !isNumberInRow(board, number, row)
                && !isNumberInCol(board, number, col)
                && !isNumberInBox(board, number, col, row);
    }

    private boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < SudokuGame.SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInCol(int[][] board, int number, int col) {
        for (int i = 0; i < SudokuGame.SIZE; i++) {
            if (board[i][col] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInBox(int[][] board, int number, int col, int row) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = col - col % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solveBoard(int[][] board) {
        for (int row = 0; row < SudokuGame.SIZE; row++) {
            for (int col = 0; col < SudokuGame.SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int triedNum = 1; triedNum <= SudokuGame.SIZE; triedNum++) {
                        if (isSafe(board, triedNum, row, col)) {
                            board[row][col] = triedNum;
                            if (solveBoard(board)) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
