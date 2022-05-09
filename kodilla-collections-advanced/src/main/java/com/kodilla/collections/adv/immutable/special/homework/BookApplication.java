package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book bookA = BookManager.createBook("TitleA", "AuthorA");
        Book bookB = BookManager.createBook("TitleB", "AuthorB");
        Book bookC = BookManager.createBook("TitleC", "AuthorC");

        System.out.println("\nIs the same address\n" + (bookA.hashCode() == bookB.hashCode()) + "\n" + bookA.hashCode() + "\n" + bookB.hashCode());
        System.out.println("\nIs the same address\n" + (bookB.hashCode() == bookC.hashCode()) + "\n" + bookB.hashCode() + "\n" + bookC.hashCode());
        System.out.println("\nIs the same address\n" + (bookA.hashCode() == bookC.hashCode()) + "\n" + bookA.hashCode() + "\n" + bookC.hashCode());
        System.out.println(bookA.equals(null));
        System.out.println("_____________________");

        for (int i = 0; i < BookManager.booksList.size(); i++) {
            System.out.println(BookManager.booksList.get(i));
        }
        System.out.println("_____________________");

        Book bookD = BookManager.createBook("TitleA", "AuthorA");

        System.out.println(bookD);
        System.out.println(bookA);
        System.out.println("_____________________");
        System.out.println((bookA.hashCode() == bookD.hashCode()) + " - " + bookA.hashCode() + " - " + bookD.hashCode());
        System.out.println(bookA == bookD);
        System.out.println(bookA.equals(bookD));
    }
}