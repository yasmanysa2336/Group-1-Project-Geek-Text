package com.bookstore.springbootsearch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name="book")
@Entity
public class Book {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String bookISBN;
    @Column(name = "book_price")
    private double bookPrice;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_desc")
    private String bookDesc;
    @Column(name = "bookauthor_first")
    private String bookauthorFirst;
    @Column(name = "bookauthor_mid")
    private String bookauthorMid;
    @Column(name = "bookauthor_last")
    private String bookauthorLast;
    @Column(name = "book_genre")
    private String bookGenre;
    @Column(name = "book_rating")
    private double bookRating;
    @Column(name = "book_published_year")
    private String bookPublishedYear;
    @Column(name = "book_copies_sold")
    private int bookCopiesSold;
    @Column(name = "publisherid")
    private int publisherID;


}
