package com.kodilla.collections.adv.immutable.special.homewrok;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    String title;
    String author;



    public BookManager(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static Book createBook(String title, String author) {
        return new Book(title, author);
    }


    @Override
    public String toString() {
        return title + author;
    }


}