package com.bookstore.springbootsearch.controller;

import java.util.List;

import com.bookstore.springbootsearch.entity.Book;
import com.bookstore.springbootsearch.service.IMPL.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/books")
public class BookStoreController {
    @Autowired
    private BookService bookService;

    public BookStoreController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/search")
    public List<Book> searchBook(@RequestParam String query){
        return bookService.searchBooks(query);
    }
    @GetMapping("/browseByGenre")
    public List<Book> browseByGenre(@RequestParam String genre) {
        return bookService.browseByGenre(genre);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/topSellers")
    public List<Book> getTopSellers() {
        return bookService.getTopSellers();
    }

    @GetMapping("/browseByRating")
    public List<Book> browseByRating(@RequestParam Double rating) {
        return bookService.browseByRating(rating);
    }

    @PatchMapping(path = "/discountByPublisher")
    public List<Book> discountByPublisher(@RequestParam int publisherID, @RequestParam double discountPercent){
        return bookService.discountByPublisher(publisherID,discountPercent);
    }
}
