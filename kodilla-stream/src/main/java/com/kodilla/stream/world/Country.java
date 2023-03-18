package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String name;
    private final BigDecimal PeopleQuantity;

    public Country(String name, BigDecimal peopleQuantity) {
        this.name = name;
        this.PeopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }
}
