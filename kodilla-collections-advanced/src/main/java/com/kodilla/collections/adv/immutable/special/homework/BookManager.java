package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    String title;
    String author;

    public BookManager(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static List<Book> booksList = new ArrayList<>();

    public static Book createBook(String title, String author) {
        for (Book book : booksList) {
            if ((title.equals(book.getTitle()) && author.equals(book.getAuthor()) && booksList.size() != 0)) {
                System.out.println("Book: " + book + " already exists");
                return book;
            }
        }

        booksList.add(new Book(title, author));
        return new Book(title, author);
    }

    @Override
    public String toString() {
        return title + author;
    }
}