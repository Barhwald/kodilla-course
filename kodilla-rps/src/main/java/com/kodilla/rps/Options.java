package com.kodilla.rps;

import java.util.Random;

public enum Options {

    SCISSORS,
    PAPER,
    ROCK;

    public static Options getRandomOption() {

        Random random = new Random();
        return values()[random.nextInt(values().length)];

    }


}
