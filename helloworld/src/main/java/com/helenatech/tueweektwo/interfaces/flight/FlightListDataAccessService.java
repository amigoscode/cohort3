package com.helenatech.tueweektwo.interfaces.flight;

import java.util.ArrayList;
import java.util.List;

public class FlightListDataAccessService implements FlightDAO {
    private List<Flight> flights = new ArrayList<>();

    @Override
    public int saveFlight(Flight flight) {
        flights.add(flight);
        return 1;
    }

    @Override
    public List<Flight> getFlights() {
        return flights;
    }

    @Override
    public int deleteFlight(Flight flight) {
        flights.remove(flight);
        return 1;
    }
}
