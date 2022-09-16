package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void findFlightsFrom() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Boston");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Boston", "Katowice"));
        expectedFlights.add(new Flight("Katowice", "Boston"));
        assertEquals(expectedFlights, FlightFinder.findFlightsFrom("Boston"));
    }


    @Test
    void findFlightsTo() {
        //when
        List <Flight> result = FlightFinder.findFlightsTo("Boston");
        //then
        List<Flight> expectedFlights = new ArrayList<>();
        expectedFlights.add(new Flight("Boston", "Katowice"));
        expectedFlights.add(new Flight("Katowice", "Boston"));
        assertEquals(expectedFlights, FlightFinder.findFlightsTo("Boston"));
    }
}