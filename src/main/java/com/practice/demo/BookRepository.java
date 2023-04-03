package com.practice.demo;

import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
    List<BookEntity> findByBookISBN(Integer bookISBN);
    List<BookEntity> findByAuthorID(Integer authorID);

    @Transactional
    @Query(value = "INSERT INTO books (bookISBN, bookName, bookDesc, bookPrice, bookAuthor, authorID, bookGenre, publisherName, bookPublishedYear, bookCopiesSold)"
                    + "VALUES (:bookISBN, :bookName, :bookDesc, :bookPrice, :bookAuthor, :authorID, :bookGenre, :publisherName, :bookPublishedYear, :bookCopiesSold)",
            nativeQuery = true)


    @Modifying
    void insertBookEntity(@Param("bookISBN") int bookISBN, @Param("bookName") String bookName,
                    @Param("bookDesc") String bookDesc, @Param("bookPrice") int bookPrice,
                    @Param("bookAuthor") String bookAuthor, @Param("authorID") int authorID,
                    @Param("bookGenre") String bookGenre, @Param("publisherName") String publisherName,
                    @Param("bookPublishedYear") int bookPublishedYear, @Param("bookCopiesSold") int bookCopiesSold);
}
