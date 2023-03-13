package com.bookstore.springbootsearch.service.IMPL;


import java.util.ArrayList;
import java.util.List;

import com.bookstore.springbootsearch.entity.Book;
import com.bookstore.springbootsearch.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> browseByGenre(String genre) {
        List<Book> books = new ArrayList<>();
        books.addAll(bookRepository.findByGenreIs(genre));
        return books;
    }

    public List<Book> searchBooks(String query) {
        List<Book> books = new ArrayList<>();
        books.addAll(bookRepository.searchBooks(query));
        return books;
    }

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        books.addAll(bookRepository.findAll());
        return books;
    }
}
