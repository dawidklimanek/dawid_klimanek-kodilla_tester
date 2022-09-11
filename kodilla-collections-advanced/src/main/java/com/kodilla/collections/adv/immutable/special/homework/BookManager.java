package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public static List<Book> bookDirectory = new ArrayList<>();


    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (bookDirectory.contains(book) == false) {
            System.out.println("Book isn't in directory  ");
            bookDirectory.add(book);
        } else {
            System.out.println("Book is in directory  ");
            bookDirectory.add(book);

        }
        System.out.println(new Book(title, author));
        System.out.println(new Book(title, author).hashCode());
        return book;
    }

    public void getIndex() {
        for (int i = 0; i < BookManager.bookDirectory.size(); i++) {
            bookDirectory.get(i);
        }
    }
}


