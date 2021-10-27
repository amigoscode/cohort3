package com.helenatech.tueweektwo.interfaces.flight;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FlightListDataAccessService flightListDataAccessService =
                new FlightListDataAccessService();

        FlightFileDataAccessService flightFileDataAccessService =
                new FlightFileDataAccessService();

        FlightService flightService = new FlightService(flightListDataAccessService);
        flightService.addFlight(new Flight("7328173982"));
        flightService.addFlight(new Flight("Luke"));

        List<Flight> allFlights = flightService.getAllFlights();
        System.out.println(allFlights);

        System.out.println("a" + "a");
        System.out.println(1 + 1);

    }
}
