package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookManagerTest {

    @Test
    public void isCreatedBookSameLikeAlreadyExistOne(){
        BookManager book1 = new BookManager("23uohi","werh");
        Book book2 = BookManager.createBook("23uohi","werh");

        assertEquals(book1.toString(), book2.toString());
    }

    @Test
    public void isBookCreated(){
         Book book = BookManager.createBook("Title01","Author02");

         int bookListSize = BookManager.booksList.size();

         assertEquals(1,bookListSize);
    }
}