package com.kodilla.collections.adv.immutable;

public class immutableExample {
    public static void main(String[] args) {
//        Book book = new BookHacked("John Stewart", "The last chance");
//        BookHacked bookHacked = (BookHacked) book;
//        bookHacked.modifyTitled("New title");
        Book book = new Book("John Stewart", "The last chance");
        System.out.println(book.getTitle());
    }
}