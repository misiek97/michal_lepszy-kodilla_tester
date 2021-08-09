package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = BookManager.createBook("Hobbit", "J.R.R. Tolkien");
        Book book3 = BookManager.createBook("Lord of the Rings", "J.R.R. Tolkien");

        System.out.println(book1 == book2);
        System.out.println(book2 == book3);
        System.out.println(book3 == book1);
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book3.equals(book1));
        System.out.println("-----");
    }
}

