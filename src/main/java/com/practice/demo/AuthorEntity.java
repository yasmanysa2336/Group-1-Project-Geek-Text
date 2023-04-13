package com.practice.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name="Author_Information")
public class AuthorEntity {
    @Id
    @Column(name= "author_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="authorFirst")
    private String authorFirst;

    @Column(name="authorLast")
    private String authorLast;

    @Column(name="authorBio")
    private String authorBio;

    @Column(name="publisherName")
    private String publisherName;

    public AuthorEntity() {
        //empty constructor
    }
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getAuthorFirst() {
        return authorFirst;
    }

    public void setAuthorFirst(String authorFirst) {
        this.authorFirst = authorFirst;
    }

    public String getAuthorLast() {
        return authorLast;
    }

    public void setAuthorLast(String authorLast) {
        this.authorLast = authorLast;
    }

    public String getAuthorBio() {
        return authorBio;
    }

    public void setAuthorBio(String authorBio) {
        this.authorBio = authorBio;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
