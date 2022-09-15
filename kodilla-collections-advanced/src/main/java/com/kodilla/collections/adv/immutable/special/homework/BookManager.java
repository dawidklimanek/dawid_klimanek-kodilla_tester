package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static List<Book> bookDirectory = new ArrayList<>();


    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (!bookDirectory.contains(book)) {
            System.out.println("Book isn't in directory  ");
            bookDirectory.add(book);

        }
        System.out.println(new Book(title, author));
        System.out.println(new Book(title, author).hashCode());
        return book;
    }
    public static int getSize (){
        return bookDirectory.size();
    }
}




