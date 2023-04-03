package com.practice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public void addAuthor(String authorFirst, String authorLast, String authorBio, String publisherName) {
        authorRepository.insertAuthorEntity(authorFirst, authorLast, authorBio, publisherName);
    }

}
