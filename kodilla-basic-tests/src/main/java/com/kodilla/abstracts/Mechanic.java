package com.kodilla.abstracts;

public class Mechanic extends Job {

    public Mechanic(String duties) {
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
        System.out.println("Nothing");

    }
}
