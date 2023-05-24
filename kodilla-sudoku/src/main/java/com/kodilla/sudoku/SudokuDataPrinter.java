package com.kodilla.sudoku;

public class SudokuDataPrinter {

    public void welcome() {
        System.out.println("""
                Hello there!
                Let's play some sudoku now.
                """);
    }

    public void congratz() {
        System.out.println("Sudoku finished. Congrats!");
    }

    public void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i == 3 || i == 6) {
                System.out.println("-".repeat(29));
            }
            for (int j = 0; j < 9; j++) {
                String result;
                if (board[i][j] == 0) {
                    result = " ";
                } else {
                    result = Integer.toString(board[i][j]);
                }
                System.out.print(" " + result + " ");
                if (j == 2 || j == 5) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

}
