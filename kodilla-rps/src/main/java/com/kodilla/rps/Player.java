package com.kodilla.rps;

import java.util.Scanner;

public class Player {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createPlayer() {

        System.out.println("Welcome to the ultimate scissors-paper-rock experience!");
        System.out.print("Type your name: ");
        Scanner myScanner = new Scanner(System.in);
        setName(myScanner.nextLine());

    }
}
