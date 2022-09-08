package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private boolean stamped;
    private double width;
    private double height;

    public Stamp(String name, boolean stamped, double width, double height) {
        this.name = name;
        this.stamped = stamped;
        this.width = width;
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public boolean isStamped() {
        return stamped;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stamped == stamp.stamped && Double.compare(stamp.width, width) == 0 && Double.compare(stamp.height, height) == 0 && name.equals(stamp.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, stamped, width, height);

}

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", stamped=" + stamped +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

