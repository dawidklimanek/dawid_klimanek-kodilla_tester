package com.kodilla.abstracts;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsibilities() {
        System.out.println(firstName + "  has responsibilities  " + this.job.getResponsibilities());
    }
}



