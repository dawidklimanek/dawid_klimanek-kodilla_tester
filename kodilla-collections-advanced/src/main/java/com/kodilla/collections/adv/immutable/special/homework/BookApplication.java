package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager.createBook ("Koalicja","Juliusz");
        BookManager.createBook ("Mała","DAvid");
        BookManager.createBook("Wojna","Borys");
        BookManager.createBook ("Mała","DAvid");
        BookManager.createBook("Wojna","Borys");
        System.out.println("-----");
        System.out.println("Directory size: " + BookManager.getSize());


    }

}
