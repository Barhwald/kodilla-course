package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsCollection {

    private final Set<Flight> flights;

    public FlightsCollection() {
        this.flights = new HashSet<>();
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        return "FlightsCollection{" + "flights=" +
                flights +
                '}';
    }
}
