package com.example.MoviesComments.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor    // NoArgs vs AllArgs ?
@Entity
public class UserReviews {

    @EmbeddedId
    private UserReviewsKey id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    private Movies movie;

    int rating;

    String comment;

    // standard constructors, getters, and setters
}