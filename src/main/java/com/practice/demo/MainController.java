package com.practice.demo;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // makes this class a controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public @ResponseBody void addAuthor (@RequestParam String authorFirst,@RequestParam String authorLast,
                                           @RequestParam String authorBio, @RequestParam String publisherName) {
        AuthorEntity a = new AuthorEntity();
        a.setAuthorFirst(authorFirst);
        a.setAuthorLast(authorLast);
        a.setAuthorBio(authorBio);
        a.setPublisherName(publisherName);
        authorService.addAuthor(authorFirst, authorLast, authorBio, publisherName);
    }

    //adds book
    @PostMapping
    public @ResponseBody void addBook (@RequestParam int bookISBN, @RequestParam String bookName,
                                         @RequestParam String bookDesc, @RequestParam int bookPrice,
                                         @RequestParam String bookAuthor, @RequestParam int authorID,
                                         @RequestParam String bookGenre, @RequestParam String publisherName,
                                         @RequestParam int bookPublishedYear, @RequestParam int bookCopiesSold) {
        BookEntity b = new BookEntity();
        b.setBookISBN(bookISBN);
        b.setBookName(bookName);
        b.setBookDesc(bookDesc);
        b.setBookPrice(bookPrice);
        b.setBookAuthor(bookAuthor);
        b.setAuthorID(authorID);
        b.setBookGenre(bookGenre);
        b.setBookPublishedYear(bookPublishedYear);
        b.setPublisherName(publisherName);
        b.setBookCopiesSold(bookCopiesSold);
        bookService.addBook(bookISBN, bookName, bookDesc, bookPrice, bookAuthor, authorID, bookGenre,
                publisherName, bookPublishedYear, bookCopiesSold);
    }

    @GetMapping(path = "/getBookByISBN")
    public List<BookEntity> getBookByISBN(@RequestParam int bookISBN) {
        return bookService.searchByISBN(bookISBN);
    }

    @GetMapping(path = "/getBookByAuthorID")
    public List<BookEntity> getBookByAuthorID(@RequestParam int authorID) {
        return bookService.searchByAuthorID(authorID);
    }

}
