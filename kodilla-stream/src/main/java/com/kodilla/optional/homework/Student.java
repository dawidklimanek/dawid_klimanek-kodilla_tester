package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }


    public String getTeacherName() {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
        String name = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        return name;
    }
}
