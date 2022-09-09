package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Double> students;



    public School(String schoolName, double...students) {
        this.students = new ArrayList<>();
        this.schoolName = schoolName;

        for (double number : students) {
            this.students.add(number);
        }
    }
        public double getSum () {
            double sum = 0.0;
            for (double number : students)
                sum += number;

        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
        public String toString() {
            return "School{" +
                    "schoolName='" + schoolName + '\'' +
                    ", students=" + students +
                    '}';
        }

}
