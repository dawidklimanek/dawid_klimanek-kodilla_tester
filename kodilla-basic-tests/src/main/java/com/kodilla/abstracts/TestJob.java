package com.kodilla.abstracts;

public class TestJob {

    public static void main(String[] args) {
        Job plumber = new Plumber("Make Love");
        JobProces processor = new JobProces();
        processor.process(plumber);
        Job mechnic=new Mechanic("Nothing");
        processor.process(mechnic);

    }
}
