package com.helenatech.tueweektwo.interfaces.flight;

import java.util.List;

public interface FlightDAO {
    int saveFlight(Flight flight);

    List<Flight> getFlights();

    int deleteFlight(Flight flight);
}
