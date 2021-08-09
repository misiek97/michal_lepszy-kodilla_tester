package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        int found = -1;
        for (int n = 0; n < books.size(); n++) {
            if (books.get(n).equals(book)) {
                found = n;
                return books.get(found);
            }
        }
        return book;
    }
}