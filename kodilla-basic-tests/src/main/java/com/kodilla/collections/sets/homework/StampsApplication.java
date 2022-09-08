package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps=new HashSet<>();

        stamps.add(new Stamp("Kopalnia 1",true,2,4));
        stamps.add(new Stamp("Kopalnia 2",false,2,3 ));
        stamps.add(new Stamp("Kopalnia 3", true,3,7));
        stamps.add(new Stamp("Kopalnia 1",true,2,4));

        System.out.println(stamps.size());
        for(Stamp stamp:stamps)
            System.out.println(stamp);

    }
}
