package com.example.MoviesComments.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Embeddable
public class UserReviewsKey implements Serializable {

    @Column(name = "user_id")
    private long userId;

    @Column(name = "movie_id")
    private long movieId;

    // standard constructors, getters, and setters
    // hashcode and equals implementation
}
