package com.bookstore.springbootsearch.controller;


import com.bookstore.springbootsearch.entity.Book;
import com.bookstore.springbootsearch.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/demo")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/browseByGenre")
    public List<Book> getBookByGenre(@RequestParam String bookGenre){
        List<Book> books = new ArrayList<>();
        books.addAll(bookRepository.findByBookGenre(bookGenre));
        return books;
    }
    @GetMapping("/topSellers")
    public List<Book> getTopSellers() {
        List<Book> books = new ArrayList<>();
        books.addAll(bookRepository.findAll());
        Page<Book> page = bookRepository.findAll(PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "bookCopiesSold")));
        books = page.getContent();
        return books;
    }

    @GetMapping("/browseByRating")
    public List<Book> browseByRating(@RequestParam Double bookRating) {
        List<Book> books = new ArrayList<>();
        for(double i=bookRating; i<=5; i+= 1){
            books.addAll(bookRepository.findByBookRating(i));
        }
        return books;
    }


    @PatchMapping( "/discountByPublisher")
    public List<Book> discountByPublisher(@RequestParam int publisherID, @RequestParam double discountPercent) {
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.addAll(bookRepository.findByPublisherID(publisherID));
        for(int i = 0; i < listOfBooks.size(); i++) {
            Book updatedBook = listOfBooks.get(i);
            updatedBook.setBookPrice(updatedBook.getBookPrice() - (updatedBook.getBookPrice()* discountPercent));
        }
        return listOfBooks;
    }




}
