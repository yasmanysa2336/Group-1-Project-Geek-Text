package com.practice.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;


public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer>  {
    @Transactional
    @Query(value = "INSERT INTO authors (authorFirst, authorLast, authorBio, publisherName"
            + "VALUES (:authorFirst, :authorLast, :authorBio, :publisherName)", nativeQuery = true)

    @Modifying
    void insertAuthorEntity(@Param("authorFirst") String authorFirst, @Param("authorLast") String authorLast,
                            @Param("authorBio") String bio, @Param("publisherName") String publisherName);

}
