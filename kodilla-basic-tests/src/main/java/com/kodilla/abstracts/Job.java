package com.kodilla.abstracts;

//Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
        //Utwórz kilka konkretnych zawodów (klas dziedziczących po Job). W kolejnym kroku utwórz klasę Person,
        //która zawierać będzie pola firstName, age i job. Dodaj metodę,
        //która wyświetli obowiązki danej osoby w pracy.

public abstract class Job {
    private double salary;
    private String responsibilities;

    public double getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}

