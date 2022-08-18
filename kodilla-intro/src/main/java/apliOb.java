import java.util.*;
import java.lang.*;
import java.io.*;

class apliOb {
    private String name;
    private double age;
    private double height;

    public apliOb(String name, double age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    public double getAge()
    {
        return age;
    }

    public double getHeight()
    {
        return height;
    }

    public boolean name(String name)
    {
        if (name != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean age(double age)
    {
        if (age>30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean height(double height)
    {
        if (height>160) {
            return true;
        } else {
            return false;
        }
    }
}

class appliOb
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        apliOb userValidator = new apliOb(name, age, height);

        boolean isNameValid = userValidator.name(name);
        boolean isOlderThan30 = userValidator.age(age);
        boolean isHigherThan160 = userValidator.height(height);

        if(isNameValid) {
            if(isOlderThan30 && isHigherThan160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is 30 y.o. or younger either 160cm or smaller");
            }
        }
    }
}