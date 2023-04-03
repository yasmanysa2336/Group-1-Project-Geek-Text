package com.practice.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private int bookISBN;
    private double bookPrice;
    private String bookName;
    private String bookDesc;
    private String bookAuthor;
    private String bookGenre;
    private int bookPublishedYear;
    private String publisherName;
    private int bookCopiesSold;
    private int authorID;

    public BookEntity() {
        //empty constructor
    }

    public int getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(int bookISBN) {
        this.bookISBN = bookISBN;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getBookPublishedYear() {
        return bookPublishedYear;
    }

    public void setBookPublishedYear(int bookPublishedYear) {
        this.bookPublishedYear = bookPublishedYear;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getBookCopiesSold() {
        return bookCopiesSold;
    }

    public void setBookCopiesSold(int bookCopiesSold) {
        this.bookCopiesSold = bookCopiesSold;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }
}
