package com.kodilla.collections.adv.exercises.homework;

import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = List.of(
                new Flight("KTW", "WAW"),
                new Flight("POZ", "WAW"),
                new Flight("POZ", "KRK"),
                new Flight("KAT", "WRO"),
                new Flight("WRO", "KAT")
        );

        return flights;
    }
}
