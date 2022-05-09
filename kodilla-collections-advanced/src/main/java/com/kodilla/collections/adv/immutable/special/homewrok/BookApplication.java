package com.kodilla.collections.adv.immutable.special.homewrok;

public class BookApplication {
    public static void main(String[] args) {

        Book bookA = BookManager.createBook("TitleA","AuthorA");
        Book bookB = BookManager.createBook("TitleB","AuthorB");
        Book bookC = BookManager.createBook("TitleC","AuthorC");
//      BookManager bookA = new BookManager("sa","sasad");
        System.out.println("\nIs the same address\n"+(bookA.hashCode()==bookB.hashCode())+"\n"+bookA.hashCode()+"\n"+bookB.hashCode());
        System.out.println("\nIs the same address\n"+(bookA==bookC));
        System.out.println("\nIs the same address\n"+(bookC==bookB));
        System.out.println(bookA.equals(null));
        System.out.println("_____________________");
//      BookManager.booksList.add(bookA);
//      System.out.println(BookManager.booksList.get(0));
    }

}
