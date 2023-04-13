package com.practice.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
    BookEntity findByBookISBN(Integer bookISBN);
    List<BookEntity> findByAuthorID(Integer authorID);
}
