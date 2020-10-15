package com.novikov.homeworks.homework8;

import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Data

public class Book {
    private Author author;
    private String name;
    private Date issueDate;
    private Genre genre;
    private String isbn;

    public Book(Author author, String name, Date issueDate, Genre genre, String isbn) {
        this.author = author;
        this.name = name;
        this.issueDate = issueDate;
        this.genre = genre;
        this.isbn = isbn;
    }

    public enum Genre{
        FAIRY_TALE{
            @Override
            public String toString() {
                return "Fairy tale";
            }
        },
        FANTASTIC{
            @Override
            public String toString() {
                return "Fantastic";
            }
        },
        ADVENTURES{
            @Override
            public String toString() {
                return "Adventures";
            }
        },
        DETECTIVE{
            @Override
            public String toString() {
                return "Detective";
            }
        },
        DRAMA{
            @Override
            public String toString() {
                return "Drama";
            }
        },
        NOVEL{
            @Override
            public String toString() {
                return "Novel";
            }
        };
    }

    public String toString(){
        return "Book name: " + name + ", author{ " + author.toString() + "}, genre: " + genre + ", issue date: " + issueDate + ", isbn: " + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(name, book.name) &&
                Objects.equals(issueDate, book.issueDate) &&
                genre == book.genre &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, issueDate, genre, isbn);
    }
}
