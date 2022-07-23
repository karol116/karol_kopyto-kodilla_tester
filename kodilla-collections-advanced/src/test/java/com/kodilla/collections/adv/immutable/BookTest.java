package com.kodilla.collections.adv.immutable;

import com.kodilla.collections.adv.immutable.homework.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void returnCorrectTitle() {
        Book book = new Book("author123", "title123");
        String title = book.getTitle();
        assertEquals("title123", title);
    }

    @Test
    void returnCorrectAuthorName() {
        Book book = new Book("author123", "title123");
        String author = book.getAuthor();
        assertEquals("author123", author);
    }
}