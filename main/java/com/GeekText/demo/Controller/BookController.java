package com.GeekText.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;
    @PostMapping("/{bookID}/ratings")
    public void createRating(@PathVariable Long bookID, @RequestParam Integer rating, @RequestParam Long userID)
    {
        bookService.createRating(bookID, rating, userID);
    }

}
