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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bookISBN;
    private double bookPrice;
    private String bookName;
    private String bookDesc;
    private String bookauthorFirst;
    private String bookauthorMid;
    private String bookauthorLast;
    private String bookGenre;
    private double bookRating;
    private String bookPublishedYear;
    private int bookCopiesSold;
    private int publisherID;


}
