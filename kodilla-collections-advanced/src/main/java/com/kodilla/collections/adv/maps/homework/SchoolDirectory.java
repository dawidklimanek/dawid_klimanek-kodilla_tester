package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal john = new Principal("John", "Stevenson");
        Principal jessie = new Principal("Jessie", "Pinkman");
        Principal bart = new Principal("Bart", "Simpson");

        School johnSchool = new School("Cambridge",100);
        School jessieSchool = new School("Maison School", 150);
        School bartSchool = new School("Lincoln School", 200);

        schools.put(john, johnSchool);
        schools.put(jessie, jessieSchool);
        schools.put(bart, bartSchool);

        System.out.println(schools.get(john));

        for(Map.Entry<Principal, School> principalEntry : schools.entrySet()) {
            System.out.println("Total students in " + principalEntry.getKey().getFirstName()+"  " +principalEntry.getKey().getLastName()+ " "
                    + "'s school " + principalEntry.getValue().getSchoolName() + ": " +  principalEntry.getValue().getSum());
        }

    }
}

