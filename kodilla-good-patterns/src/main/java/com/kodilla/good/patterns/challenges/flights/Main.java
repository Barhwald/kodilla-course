package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FlightsCollection flightsCollection = new FlightsCollection();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightsCollection);

        Flight flight1 = new Flight(Location.CRACOW, null, Location.BARCELONA);
        Flight flight2 = new Flight(Location.LONDON, List.of(Location.BERLIN), Location.LOS_ANGELES);
        Flight flight3 = new Flight(Location.BERLIN, List.of(Location.PRAGUE, Location.ABU_DHABI), Location.CANBERRA);
        Flight flight4 = new Flight(Location.LOS_ANGELES, null, Location.AUSTIN);
        Flight flight5 = new Flight(Location.SCRANTON, List.of(Location.NEW_YORK), Location.LONDON);
        Flight flight6 = new Flight(Location.BARCELONA, List.of(Location.PRAGUE, Location.LONDON), Location.AUSTIN);
        Flight flight7 = new Flight(Location.SCRANTON, null, Location.CRACOW);
        Flight flight8 = new Flight(Location.WICHITA_FALLS, List.of(Location.SCRANTON, Location.WARSAW), Location.BRATISLAVA);


        flightsCollection.getFlights().add(flight1);
        flightsCollection.getFlights().add(flight2);
        flightsCollection.getFlights().add(flight3);
        flightsCollection.getFlights().add(flight4);
        flightsCollection.getFlights().add(flight5);
        flightsCollection.getFlights().add(flight6);
        flightsCollection.getFlights().add(flight7);
        flightsCollection.getFlights().add(flight8);


        flightSearchEngine.searchFlightsFrom(Location.CRACOW);
        flightSearchEngine.searchFlightsThrough(Location.PRAGUE);
        flightSearchEngine.searchFlightsTo(Location.BARCELONA);
        flightSearchEngine.searchFlightsTo(Location.BRATISLAVA);
        flightSearchEngine.searchFlightsFrom(Location.AUSTIN);
        flightSearchEngine.searchFlightsFrom(Location.LOS_ANGELES);
        flightSearchEngine.searchFlightsTo(Location.CRACOW);
        flightSearchEngine.searchFlightsFromTo(Location.CRACOW, Location.BARCELONA);


    }

}
