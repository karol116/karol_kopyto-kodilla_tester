package com.kodilla.collections.adv.immutable.special.homework;

public class Book {
    String title;
    String author;


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
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