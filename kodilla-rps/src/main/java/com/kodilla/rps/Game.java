package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    private int winsNeeded;
    private int wins;
    private int ties;
    private int losses;
    private String playerName;
    private Options userOption;
    private Options cpuOption;
    private int roundCount = 0;


    public int getWinsNeeded() {
        return winsNeeded;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setWinsNeeded(int winsNeeded) {
        this.winsNeeded = winsNeeded;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Options getUserOption() {
        return userOption;
    }

    public void setUserOption(Options userOption) {
        this.userOption = userOption;
    }

    public Options getCpuOption() {
        return cpuOption;
    }

    public void setCpuOption(Options cpuOption) {
        this.cpuOption = cpuOption;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }

    public void startGame() {

        System.out.println("Welcome to the ultimate scissors-paper-rock experience!");
        System.out.print("Type your name: ");

        Scanner myScanner = new Scanner(System.in);
        setPlayerName(myScanner.nextLine());

        System.out.print("How many wins before game ends? ");
        setWinsNeeded(myScanner.nextInt());
        myScanner.nextLine();

    }

    public boolean validateUserInput(String input) {

        boolean flag = false;

        switch (input) {
            case "1" -> {
                flag = true;
                setUserOption(Options.ROCK);
            }
            case "2" -> {
                flag = true;
                setUserOption(Options.PAPER);
            }
            case "3" -> {
                flag = true;
                setUserOption(Options.SCISSORS);
            }
            default -> System.out.println("pick a valid option\n");
        }
        return flag;

    }

    public boolean didPlayerWin(Options playerOption, Options cpuOption) {

        return playerOption.equals(Options.ROCK) && cpuOption.equals(Options.SCISSORS) ||
                (playerOption.equals(Options.SCISSORS) && cpuOption.equals(Options.PAPER)) ||
                (playerOption.equals(Options.PAPER) && cpuOption.equals(Options.ROCK));
    }

    public boolean didCpuWin(Options playerOption, Options cpuOption) {

        return cpuOption.equals(Options.ROCK) && playerOption.equals(Options.SCISSORS) ||
                (cpuOption.equals(Options.SCISSORS) && playerOption.equals(Options.PAPER)) ||
                (cpuOption.equals(Options.PAPER) && playerOption.equals(Options.ROCK));
    }

    public void calculateScore() {

        boolean playerWon = didPlayerWin(getUserOption(), getCpuOption());
        boolean cpuWon = didCpuWin(getUserOption(), getCpuOption());
        if (playerWon) {
            setWins(getWins() + 1);
        } else {
            if (cpuWon) {
                setLosses(getLosses() + 1);
            } else {
                setTies(getTies() + 1);
            }
        }

    }

    public void printResult() {

        System.out.println("You picked " + getUserOption() + ", CPU picked " + getCpuOption());
        System.out.println("You: " + getWins() + ", CPU: " + getLosses());
        System.out.println("Ties: " + getTies());

    }

    public void printScore() {

        String victor;

        if (getWins() > getLosses()) {
            victor = getPlayerName();
        } else {
            victor = "CPU";
        }
        System.out.println("Game has finished! " + victor + " has won. What would you like to do?\n");
        System.out.print("""
                    Press x - to quit the game
                    Press n - to restart the game
                    """);
    }

}
