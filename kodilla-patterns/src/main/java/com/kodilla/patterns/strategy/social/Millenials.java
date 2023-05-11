package com.kodilla.patterns.strategy.social;

public final class Millenials extends User {
    public Millenials(String login) {
        super(login);
        this.socialPublisher = new SnapchatPublisher();
    }
}
