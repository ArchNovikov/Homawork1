package com.novikov.homeworks.homework8;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", "Tolstoy", "09.09.1828");
        Book book1 = new Book(author1, "War and Peace", new Date(), Book.Genre.DRAMA, "978-59978431-2-4");

        System.out.println(book1.toString());
    }
}
