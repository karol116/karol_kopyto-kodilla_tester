package com.kodilla.collections.adv.immutable.special.homewrok;

public class Book {
    String title;
    String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "\"" + title + "\"" + " - " + author;
    }
}