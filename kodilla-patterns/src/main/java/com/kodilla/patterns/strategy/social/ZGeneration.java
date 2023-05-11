package com.kodilla.patterns.strategy.social;

public final class ZGeneration extends User {
    public ZGeneration(String login) {
        super(login);
        this.socialPublisher = new TwitterPublisher();

    }
}
