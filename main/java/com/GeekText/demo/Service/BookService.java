package com.GeekText.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void createRating(Long bookID, Integer rating, Long userID)
    {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new ResourceNotFoundException("Book", "id", bookId));
        Rating newRating = new Rating(rating, new Date(), userID);
        book.addRating(newRating);
        bookRepository.save(book);
    }

}
