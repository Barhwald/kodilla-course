package com.kodilla.exception.test;

import java.util.List;
import java.util.Map;

public class FlightFinder {

    public static void main(String[] args) {

        List<Flight> flightsList = List.of(
                new Flight("Warsaw", "Cracow"),
                new Flight("Minsk", "London"),
                new Flight("Minsk", "Moscow"),
                new Flight("El Paso", "Hamburg"),
                new Flight("Cracow", "Chicago")
        );

        for (Flight flight : flightsList) {
            try {
                findFlight(flight);
            } catch (RouteNotFoundException e) {
                System.out.println(e);
            }
        }

    }

    public static void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportsMap = Map.of(
                "Berlin", true,
                "London", true,
                "Warsaw", true,
                "Moscow", false,
                "Cracow", true,
                "Minsk", false,
                "Hamburg", false,
                "Los Angeles", true,
                "El Paso", true,
                "Chicago", true
        );

        String depAirport = flight.getDepartureAirport();
        String queriedAirport = flight.getArrivalAirport();

        if (airportsMap.containsKey(queriedAirport) && airportsMap.get(queriedAirport)) {
            System.out.printf("Flight has been found. You can fly to %s\n", queriedAirport);
        } else {
            throw new RouteNotFoundException(String.format("Flight from %s to %s not found", depAirport, queriedAirport));
        }

    }

}
