package com.kodilla.patterns.strategy.social;

public final class YGeneration extends User{
    public YGeneration(String login) {
        super(login);
        this.socialPublisher = new FacebookPublisher();
    }
}
