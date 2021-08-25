package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom_To() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> result1 = flightFinder.findFlightsFrom("WRO");
        List<Flight> result2 = flightFinder.findFlightsTo("KAT");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("WRO", "KAT"));
        assertEquals(expectedList, result1);
        assertEquals(expectedList, result2);
    }
}