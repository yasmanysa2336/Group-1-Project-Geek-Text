package com.bookstore.springbootsearch.service.IMPL;


import java.util.ArrayList;
import java.util.List;

import com.bookstore.springbootsearch.entity.Book;
import com.bookstore.springbootsearch.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> browseByGenre(String genre) {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.addAll(bookRepository.findByGenreIs(genre));
        return listOfBooks;
    }

    public List<Book> searchBooks(String query) {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.addAll(bookRepository.searchBooks(query));
        return listOfBooks;
    }

    public List<Book> getAllBooks() {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.addAll(bookRepository.findAll());
        return listOfBooks;
    }

    public List<Book> getTopSellers() {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.addAll(bookRepository.findAll());
        Page<Book> topSellers = bookRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "bookCopiesSold")));

        listOfBooks = topSellers.getContent();
        return listOfBooks;
    }

    public List<Book> browseByRating(Double rating) {
        List<Book> listOfBooks = new ArrayList<>();
        for(double i=rating; i<=5; i+= 0.1){

        listOfBooks.addAll(bookRepository.findByRating(i));
        }
        return listOfBooks;
    }


    public List<Book> discountByPublisher(int publisherID, double discountPercent) {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.addAll(bookRepository.findByPubID(publisherID));
       for(int i = 0; i < listOfBooks.size(); i++) {
           Book updatedBook = listOfBooks.get(i);
           updatedBook.setBookPrice(updatedBook.getBookPrice() * discountPercent);
       }
        return listOfBooks;
    }
}
