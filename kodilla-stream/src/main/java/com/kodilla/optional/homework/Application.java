package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        Teacher jackFrost = new Teacher("Jack Frost");
        Teacher billGates = new Teacher("Bill Gates");
        Teacher ralphFerry = new Teacher("Ralph Ferry");

        List<Student> students = new ArrayList<>();

        students.add(new Student("Adam Nowak", null));
        students.add(new Student("Piotr Podleśny", jackFrost));
        students.add(new Student("Dawid Klimanek", null));
        students.add(new Student("Leonard Walczak", billGates));
        students.add(new Student("Jerzy Podpałka", ralphFerry));
        students.add(new Student("Mia Moi", null));
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String name = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        }
    }
}


