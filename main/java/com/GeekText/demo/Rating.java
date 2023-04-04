package com.GeekText.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Rating {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reviewID;
    private Integer bookCode;
    private Integer userID;
    private Double rating;
    private String comment;
    private Date datestamp;
    public void setReviewID(Integer reviewID) {
        this.reviewID = reviewID;
    }
    public Integer getReviewID() {
        return reviewID;
    }
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Date getDatestamp() {
        return datestamp;
    }
    public void setDatestamp(Date datestamp) {
        this.datestamp = datestamp;
    }
    public Integer getBookCode() {
        return bookCode;
    }
    public void setBookCode(Integer bookCode) {
        this.bookCode = bookCode;
    }
    public Integer getUserID() {
        return userID;
    }
    public void setUserID(Integer userID){
        this.userID = userID;
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private Integer rating;
//
//    private Date date;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "book_id")
//    private Book book;

}
