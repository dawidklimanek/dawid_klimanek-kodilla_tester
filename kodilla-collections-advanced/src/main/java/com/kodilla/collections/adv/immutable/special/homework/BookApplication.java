package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager.createBook ("Koalicja","Juliusz");
        BookManager.createBook ("Mała","DAvid");
        BookManager.createBook("Wojna","Borys");
        BookManager.createBook ("Mała","DAvid");
        BookManager.createBook("Wojna","Borys");
        System.out.println("-----");
        System.out.println("Directory size: " + BookManager.bookDirectory.size());

        System.out.println("--------------");
        System.out.println("Do objects have the same hashCodes?");
        System.out.println("0 and 1");
        System.out.println(BookManager.bookDirectory.get(0).equals(BookManager.bookDirectory.get(1)));
        System.out.println("1 and 2");
        System.out.println(BookManager.bookDirectory.get(1).equals(BookManager.bookDirectory.get(2)));
        System.out.println("0 and 2");
        System.out.println(BookManager.bookDirectory.get(0).equals(BookManager.bookDirectory.get(2)));
    }

}
