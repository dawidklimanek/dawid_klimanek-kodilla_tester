package com.kodilla.abstracts;

public class Person extends Job {
    public String firstName = "Dawid";
    public int age = 30;
    public String job = "mechanic";

    public Person(String duties) {
        super(duties);
    }

    @Override
    public String sallery() {
        return null;
    }

    @Override
    public String responsibilities() {
        return null;
    }
    @Override
    public void getduties() {

    }
}

