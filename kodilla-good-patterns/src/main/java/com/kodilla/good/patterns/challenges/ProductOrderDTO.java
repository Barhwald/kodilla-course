package com.kodilla.good.patterns.challenges;

public class ProductOrderDTO {

    private final User user;
    private final boolean isPurchased;

    public ProductOrderDTO(final User user, final boolean isRented) {
        this.user = user;
        this.isPurchased = isRented;
    }

    public User getUser() { return user; }

    public boolean isRented() { return isPurchased; }

}
