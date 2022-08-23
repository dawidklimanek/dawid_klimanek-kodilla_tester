package com.kodilla.abstracts;

public class Plumber extends Job{
    public Plumber(String duties) {
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
        System.out.println("Make Love");

    }
}
