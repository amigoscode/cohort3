package com.helenatech.tueweektwo.interfaces.flight;

import java.util.List;

public class FlightService {

    private FlightDAO flightDAO;

    public FlightService(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    public void addFlight(Flight flight) {
        String flightNumber = flight.getFlightNumber();
        if (flightNumber == null || flightNumber.isEmpty()) {
            throw new IllegalStateException("Flight number cannot be null");
        }

        flightDAO.saveFlight(flight);
    }

    public List<Flight> getAllFlights() {
        return flightDAO.getFlights();
    }

}
