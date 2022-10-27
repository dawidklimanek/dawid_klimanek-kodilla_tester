package com.kodilla.mockito.homework;


import java.util.*;

public class WeatherAlert {



    private Map<Location, Set<Person>> personAndLocationMap = new HashMap<>();


    public void addDataToTheMap(Location location, Person person) {
        if (this.personAndLocationMap.containsKey(location)) {
            this.personAndLocationMap.get(location).add(person);
        } else {
            Set<Person> persons = new HashSet<>();
            persons.add(person);
            this.personAndLocationMap.put(location, persons);
        }
    }



    public void removeSubscription(Location location, Person client) {
        if (this.personAndLocationMap.containsKey(location)) {
            this.personAndLocationMap.get(location).remove(client);
        }
    }

    public void removeAllSubscriptions(Person client) {
        personAndLocationMap.entrySet().forEach(a -> a.getValue().remove(client));
    }


    public void sendAlertToLocation(Alert alert, Location location) {
        if (this.personAndLocationMap.containsKey(location)) {
            personAndLocationMap.get(location).forEach(a -> a.receive( alert));
        }
    }

    public void sendAlertToGroup(Alert alert) {
        this.personAndLocationMap.values().forEach(a -> a.forEach(b -> b.receive( alert)));
    }


    public void removeLocation(Location location){
        this.personAndLocationMap.remove(location);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherAlert that = (WeatherAlert) o;
        return Objects.equals(personAndLocationMap, that.personAndLocationMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personAndLocationMap);
    }

    @Override
    public String toString() {
        return "AlertService{" +
                "clientAndLocationMap=" + personAndLocationMap +
                '}';

    }
}