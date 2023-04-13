package com.practice.demo;

import jakarta.persistence.*;

@Entity
@Table(name="Book_Information")
public class BookEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="bookISBN")
    private int bookISBN;

    @Column(name="bookPrice")
    private double bookPrice;

    @Column(name="bookName")
    private String bookName;

    @Column(name="bookDesc")
    private String bookDesc;

    @Column(name="bookAuthor")
    private String bookAuthor;

    @Column(name="bookGenre")
    private String bookGenre;

    @Column(name="bookPublishedYear")
    private int bookPublishedYear;

    @Column(name="publisherName")
    private String publisherName;

    @Column(name="bookCopiesSold")
    private int bookCopiesSold;

    @Column(name="authorID")
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

    public int getAuthorID() { return authorID; }

    public void setAuthorID(int authorID) { this.authorID = authorID; }
}
