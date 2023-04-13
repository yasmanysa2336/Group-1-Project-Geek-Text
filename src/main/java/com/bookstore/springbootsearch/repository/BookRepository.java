package com.bookstore.springbootsearch.repository;

import com.bookstore.springbootsearch.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String > {
    List<Book> findByPublisherID(int publisherID);
    List<Book> findByBookRating(double bookRating);
    List<Book> findByBookGenre(String bookGenre);


}
