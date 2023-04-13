package com.practice.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/demo")
public class MainController {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorService authorService;

    @PostMapping("/postAuthor")
    public AuthorEntity postAuthor(@RequestBody AuthorEntity authorEntity) {
        return authorService.saveAuthor(authorEntity);
    }

    @PostMapping("/postBook")
    public BookEntity postBook(@RequestBody BookEntity bookEntity) {
        return bookService.saveBook(bookEntity);
    }

    @GetMapping("/getBookByISBN/{bookISBN}")
    public BookEntity getBookByISBN(@PathVariable int bookISBN) {
        return bookService.searchByISBN(bookISBN);
    }

    @GetMapping("/getBookByAuthorID/{authorID}")
    public List<BookEntity> getBookByAuthorID(@PathVariable int authorID) {
        return bookService.searchByAuthorID(authorID);
    }

}
