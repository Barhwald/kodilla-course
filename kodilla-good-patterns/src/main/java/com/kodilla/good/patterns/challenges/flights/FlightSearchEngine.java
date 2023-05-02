package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class FlightSearchEngine {

    private final FlightsCollection flightsCollection;

    public FlightSearchEngine(FlightsCollection flightsCollection) {
        this.flightsCollection = flightsCollection;
    }

    public void searchFlightsFrom(Location location) {
        System.out.println("Searching flights from: " + location.toString() + "...");
        List<Flight> results = flightsCollection.getFlights().stream()
                .filter(flight -> flight.start().equals(location))
                .toList();
        ContentPrinter.printFlights(results);
    }

    public void searchFlightsThrough(Location location) {
        System.out.println("Searching flights through: " + location.toString() + "...");
        List<Flight> results = flightsCollection.getFlights().stream()
                .filter(flight -> flight.through() != null && flight.through()
                        .stream().anyMatch(city -> city.equals(location)))
                .toList();
        ContentPrinter.printFlights(results);
    }

//    public void searchFlightsThrough(Location location) {
//        System.out.println("Searching flights through: " + location.toString() + "...");
//        List<Flight> results = flightsCollection.getFlights().stream()
//                .filter(flight -> flight.through() != null)
//                .filter(flight -> flight.through()
//                        .stream().anyMatch(city -> city.equals(location)))
//                .toList();
//        ContentPrinter.printFlights(results);
//    }

    public void searchFlightsTo(Location location) {
        System.out.println("Searching flights to: " + location.toString() + "...");
        List<Flight> results = flightsCollection.getFlights().stream()
                .filter(flight -> flight.end().equals(location))
                .toList();
        ContentPrinter.printFlights(results);
    }

    public void searchFlightsFromTo(Location start, Location end) {
        System.out.println("Searching flights from: " + start.toString() + " to " + end.toString() + "...");
        List<Flight> results = flightsCollection.getFlights().stream()
                .filter(flight -> flight.start().equals(start) && flight.end().equals(end))
                .toList();
        ContentPrinter.printFlights(results);
    }

}
