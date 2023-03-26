package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    private int winsNeeded;
    private int wins;
    private int ties;
    private int losses;
    private Options userOption;
    private Options cpuOption;
    private int roundCount;
//    private static Map<String, Options> optionsMap = Map.of(
//            "1", Options.ROCK,
//            "2", Options.PAPER,
//            "3", Options.SCISSORS
//    );


    public int getWinsNeeded() {
        return winsNeeded;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setWinsNeeded(int winsNeeded) {
        this.winsNeeded = winsNeeded;
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

    public void playGame(Player player) {

        startGame();

        while (true) {

            startRound();
            setCpuOption(Options.getRandomOption());
            calculateScore();
            printResult();

            if (getWinsNeeded() == getWins() || getWinsNeeded() == getLosses()) {

                String victor;

                if (getWins() > getLosses()) {
                    victor = player.getName();
                } else {
                    victor = "CPU";
                }
                System.out.println("Game has finished! " + victor + " has won. What would you like to do?\n");
                System.out.print("""
                    Press x - to quit the game
                    Press n - to restart the game
                    """);

                while (true) {

                    Scanner myScanner = new Scanner(System.in);
                    String response = myScanner.nextLine();

                    if (response.equals("x")) {
                        System.out.println("Bye bye " + player.getName() + "!");
                        System.exit(0);
                    } else if (response.equals("n")) {
                        System.out.print("Ok " + player.getName() + ". ");
                        setRoundCount(0);
                        setWins(0);
                        setLosses(0);
                        setTies(0);
                        playGame(player);
                    } else {
                        System.out.println("Pick a valid option");
                    }
                }
            }

        }

    }

    public void startGame() {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("How many wins before game ends? ");
        setWinsNeeded(myScanner.nextInt());
        myScanner.nextLine();

    }

    public void startRound() {

        boolean validInput = false;
        setRoundCount(getRoundCount() + 1);
        System.out.println("\n" + "Round " + getRoundCount() + "\n");

        while (!validInput) {

            System.out.print("""
                        Press 1 - to play rock
                        Press 2 - to play paper
                        Press 3 - to play scissors
                        """);

            Scanner myScanner = new Scanner(System.in);
            String response = myScanner.nextLine();

            validInput = validateUserInput(response);

        }

    }

    public boolean validateUserInput(String input) {
//        return optionsMap.containsKey(input);

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

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Game{");
//        sb.append("winsNeeded=").append(winsNeeded);
//        sb.append(", wins=").append(wins);
//        sb.append(", ties=").append(ties);
//        sb.append(", losses=").append(losses);
//        sb.append(", userOption=").append(userOption);
//        sb.append(", cpuOption=").append(cpuOption);
//        sb.append(", roundCount=").append(roundCount);
//        sb.append('}');
//        return sb.toString();
//    }
}
