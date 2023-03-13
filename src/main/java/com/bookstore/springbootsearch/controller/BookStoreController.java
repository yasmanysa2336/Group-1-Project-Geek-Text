package com.bookstore.springbootsearch.controller;

import java.util.List;

import com.bookstore.springbootsearch.entity.Book;
import com.bookstore.springbootsearch.service.IMPL.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/books")
public class BookStoreController {
    @Autowired
    private BookService bookService;
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

}
