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
public class MoviePeopleKey implements Serializable {

    @Column(name = "people_id")
    private long peopleId;

    @Column(name = "movie_id")
    private long movieId;

    @Column(name = "role_id")
    private long roleId;

    // standard constructors, getters, and setters
    // hashcode and equals implementation
}