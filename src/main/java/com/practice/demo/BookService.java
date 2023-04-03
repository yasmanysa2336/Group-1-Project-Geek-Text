package com.practice.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;


    public List<BookEntity> searchByISBN(int bookISBN) {
        List<BookEntity> books = new ArrayList<>();
        bookRepository.findByBookISBN(bookISBN).forEach(books::add);
        return books;
    }

    public List<BookEntity> searchByAuthorID(int authorID) {
        List<BookEntity> books = new ArrayList<>();
        bookRepository.findByAuthorID(authorID).forEach(books::add);
        return books;
    }

    public void addBook (int bookISBN, String bookName, String bookDesc, int bookPrice, String bookAuthor,
                         int authorID, String bookGenre, String publisherName, int bookPublishedYear, int bookCopiesSold) {
        bookRepository.insertBookEntity(bookISBN, bookName, bookDesc, bookPrice, bookAuthor, authorID, bookGenre,
                publisherName, bookPublishedYear, bookCopiesSold);
    }
}
