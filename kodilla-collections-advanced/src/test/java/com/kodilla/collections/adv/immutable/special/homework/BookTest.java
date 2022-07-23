package com.kodilla.collections.adv.immutable.special.homework;

import com.kodilla.collections.adv.immutable.special.homework.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void returnCorrectTitle() {
        Book book = new Book("title123", "author123");
        String title = book.getTitle();
        assertEquals("title123", title);
    }

    @Test
    void returnCorrectAuthorName() {
        Book book = new Book("title123", "author123");
        String author = book.getAuthor();
        assertEquals("author123", author);
    }

    @Test
    void setTitle() {
        Book book = new Book("author123", "title123");
        String unexpectedTitle = book.getTitle();
        book.setTitle("another title");
        String modifiedTitle = book.getTitle();

        System.out.println(unexpectedTitle);
        System.out.println(modifiedTitle);

        assertNotEquals(unexpectedTitle, modifiedTitle);
    }
}