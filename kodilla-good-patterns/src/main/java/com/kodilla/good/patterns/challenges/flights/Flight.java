package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.Objects;

public record Flight(Location start, List<Location> through, Location end) {

    @Override
    public String toString() {
        return "Flight{" + "start=" + start +
                ", through=" + through +
                ", end=" + end +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return start == flight.start && Objects.equals(through, flight.through) && end == flight.end;
    }

}
