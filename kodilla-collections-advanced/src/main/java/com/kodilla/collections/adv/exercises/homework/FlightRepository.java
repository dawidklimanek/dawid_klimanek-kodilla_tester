package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List <Flight> flights=new ArrayList<>();

        flights.add(new Flight("Boston","Katowice"));
        flights.add(new Flight("Boston","Warszawa"));
        flights.add(new Flight("New York", "Washington"));
        flights.add(new Flight("Warszawa","Katowice"));
        flights.add(new Flight("Poznań", "Warszawa"));

        return flights;
    }
}
