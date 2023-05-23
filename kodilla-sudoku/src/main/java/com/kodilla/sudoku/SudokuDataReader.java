package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuDataReader {

    private static final Scanner scanner = new Scanner(System.in);

    public String whereToPlaceValue() {
        System.out.print("Set col, row and then num (col,row,num): ");
        String result = scanner.nextLine();
        return result.replaceAll("\\D", "").trim();
    }

    public String askTypeOfInput() {
        System.out.println("Type 1 to enter custom input or type \"SUDOKU\" to solve the puzzle");
        return scanner.nextLine();

    }
}