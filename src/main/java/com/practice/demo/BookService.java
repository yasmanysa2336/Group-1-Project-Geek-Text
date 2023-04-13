package com.practice.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public BookEntity searchByISBN(int bookISBN) {
        return bookRepository.findByBookISBN(bookISBN);
    }

    public List<BookEntity> searchByAuthorID(int authorID) {
        return bookRepository.findByAuthorID(authorID);
    }

    public BookEntity saveBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }
}
