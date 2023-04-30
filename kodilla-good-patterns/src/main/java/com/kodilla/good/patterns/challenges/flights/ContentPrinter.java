package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class ContentPrinter {

    public static void printFlights(List<Flight> flightList) {
        if (flightList.isEmpty()) {
            System.out.println("No flights found\n");
        } else {
            String flights = "";
            for (Flight flight : flightList) {
                flights = flights + flight + "\n" ;
            }
            System.out.println(flights);
        }
    }

}
