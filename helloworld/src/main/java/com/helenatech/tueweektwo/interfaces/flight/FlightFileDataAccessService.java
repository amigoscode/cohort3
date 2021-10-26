package com.helenatech.tueweektwo.interfaces.flight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightFileDataAccessService implements FlightDAO {
    @Override
    public int saveFlight(Flight flight) {
        try {
            File file = new File("src/flights.txt");

            if (!file.exists()) {


                System.out.println(file.createNewFile());


            } else {
                System.out.println("File already exists");
            }

            FileWriter fileWriter = new FileWriter(file, true);

            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(flight.getFlightNumber());

            printWriter.flush();
            printWriter.close();
            return 1;

        } catch (IOException e) {
            return 0;
        }

    }

    @Override
    public List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        try {
            File file = new File("src/flights.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                flights.add(new Flight(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            return flights;
        }
        return flights;

    }

    @Override
    public int deleteFlight(Flight flight) {
        return 0;
    }
}
