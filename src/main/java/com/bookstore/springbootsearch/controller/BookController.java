package com.bookstore.springbootsearch.controller;


import com.bookstore.springbootsearch.entity.Book;
import com.bookstore.springbootsearch.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/browseByPublisherID")
    public List<Book> getBookByPublisher(@RequestParam int publisherID){
        List<Book> books = new ArrayList<>();
        books.addAll(bookRepository.findByPublisherID(publisherID));
        return books;
    }


    @PatchMapping(value = "/discount/publisher", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> discountBooksByPublisher(@RequestBody Map<String, Object> requestMap) {

        double discountPercent = Double.parseDouble(requestMap.get("discountPercent").toString());
        int publisherID = Integer.parseInt(requestMap.getOrDefault("publisherID", "0").toString());

        // Get all books for the specified publisher
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.addAll(bookRepository.findByPublisherID(publisherID));


        for (Book book : listOfBooks) {
            double originalPrice = book.getBookPrice();
            double discountedPrice = originalPrice * (1 - (discountPercent / 100));
            book.setBookPrice(Double.parseDouble(String.format("%.2f",discountedPrice)));
            bookRepository.save(book);
        }


        return ResponseEntity.ok().build();
    }

}
