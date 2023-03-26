package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {

        Game myGame = new Game();
        Player player = new Player();
        player.createPlayer();
        myGame.playGame(player);

    }


//    log.debug("User with id {} and password {} logged in",id,password);
//    log.debug(String.format("User with id %s and password %s logged in",id,password));

    //               var nameAndSurname = String.format("%s and %s", name, surname)
}