package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {

    private final List<Continent> continentsList;

    public World(List<Continent> continentsList) {
        this.continentsList = continentsList;
    }

    public List<Continent> getContinentsList() {
        return continentsList;
    }

    public BigDecimal getPeopleQuantity() {
        return continentsList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                        .map(Country::getPeopleQuantity)
                        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
