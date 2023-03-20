package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Game myGame = new Game();
        myGame.startGame();

        while (true) {

            boolean validInput = false;
            myGame.setRoundCount(myGame.getRoundCount() + 1);
            System.out.println("\n" + "Round " + myGame.getRoundCount() + "\n");

            while (!validInput) {

                System.out.print("""
                        Press 1 - to play rock
                        Press 2 - to play paper
                        Press 3 - to play scissors
                        """);

                Scanner myScanner = new Scanner(System.in);
                String response = myScanner.nextLine();

                validInput = myGame.validateUserInput(response);

            }

            myGame.setCpuOption(Options.getRandomOption());
            myGame.calculateScore();
            myGame.printResult();

            if (myGame.getWinsNeeded() == myGame.getWins() || myGame.getWinsNeeded() == myGame.getLosses()) {

                myGame.printScore();

                Scanner myScanner = new Scanner(System.in);
                String response = myScanner.nextLine();

                while (true) {
                    if (response.equals("x")) {
                        System.exit(0);
                    } else if (response.equals("n")) {
                        main(args);
                    } else {
                        System.out.println("Pick a valid option");
                    }
                }
            }

        }

    }

}