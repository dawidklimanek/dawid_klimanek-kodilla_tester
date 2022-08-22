package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        //Animal dog = new Dog();
       // AnimalProcessor processor = new AnimalProcessor();
        //processor.process(dog);

        Shape square= new Squer(4);
        Shape triangle= new Triangular(5,5);
        Shape round = new Round(3);
        System.out.println(square.calcArea());
        System.out.println(square.calcPerimetr());
        System.out.println(triangle.calcArea());
        System.out.println(triangle.calcPerimetr());
        System.out.println(round.calcArea());
        System.out.println(round.calcPerimetr());

    }


}
