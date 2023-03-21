package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {

        Game myGame = new Game();
        Player player = new Player();
        player.createPlayer();
        myGame.playGame(player);

    }
}