package com.kodilla.abstracts;

public class TestJob {

    public static void main(String[] args) {
        Job plumber = new Plumber(1000, "nothing");
        Person Dawid = new Person("Dawid", 20, plumber);
        Dawid.showResponsibilities();
        Job mechnic = new Mechanic(2000, "nothing");
        Person jan = new Person("Jan", 20, mechnic);
        jan.showResponsibilities();
    }
}


