package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Player player = new Player();
        player.createPlayer();
        playGame(player);

    }

    public static void playGame(Player player) {

        Game myGame = new Game();
        myGame.startGame();

        while (true) {

            myGame.startRound();
            myGame.setCpuOption(Options.getRandomOption());
            myGame.calculateScore();
            myGame.printResult();

            if (myGame.getWinsNeeded() == myGame.getWins() || myGame.getWinsNeeded() == myGame.getLosses()) {

                String victor;

                if (myGame.getWins() > myGame.getLosses()) {
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
                        playGame(player);
                    } else {
                        System.out.println("Pick a valid option");
                    }
                }
            }

        }

    }

}