package com.kodilla.collections.adv.immutable.special.homewrok;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return title + author;
    }
    static List<Book> booksList = new ArrayList<>();

    public static List<Book> getBooksList() {
        return booksList;
    }
}
