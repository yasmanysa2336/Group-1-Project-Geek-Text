package com.bookstore.springbootsearch.repository;

import com.bookstore.springbootsearch.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String > {
    List<Book> searchBooks(String query);
    List<Book> findByGenreIs(String genre);

    List<Book> findByRating(Double rating);

    List<Book> findByPubID(int publisherID);
}
