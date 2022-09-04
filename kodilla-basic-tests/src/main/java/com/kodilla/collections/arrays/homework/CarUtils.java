package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car){

            System.out.println("-------------------------");
            System.out.println("Shape kind:" + getCarName(car));
            System.out.println("Car speed:" + car.getSpeed());
            System.out.println("Car increase speed:" + car.getSpeed()+car.increaseSpeed(20));
        }
        private static String getCarName(Car car){
            if (car instanceof BMW)
                return "BMW";
            else if (car instanceof Ford)
                return "Ford";
            else if (car instanceof Opel)
                return "Opel";
            else
                return "Unknown Car name";

        }
}
