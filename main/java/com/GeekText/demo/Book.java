package com.GeekText.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rating> ratings = new ArrayList<>();

    public void addRating(Rating rating)
    {
        this.ratings.add(rating);
        rating.setBook(this);
    }

    public Double getAverageRating()
    {
        if(ratings.isEmpty())
        {
            return 0.0;
        } else{
            double sum = 0;
            for(Rating rating : ratings)
            {
                sum += rating.getRating();
            }
            return sum / ratings.size();
        }

    }

}
