package com.kodilla.abstracts;

//Utwórz klasę abstrakcyjną Job (zawód), z polami salary oraz responsibilities.
        //Utwórz kilka konkretnych zawodów (klas dziedziczących po Job). W kolejnym kroku utwórz klasę Person,
        //która zawierać będzie pola firstName, age i job. Dodaj metodę,
        //która wyświetli obowiązki danej osoby w pracy.

public abstract class Job {
    private final Object duties;

    public Job(String duties) {
        this.duties=duties;

    }

    public abstract String sallery();
    public abstract  String responsibilities();
        public abstract void getduties();
}
