package com.example.MoviesComments.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="MOVIES_PEOPLE")
public class MoviePeople {

    @EmbeddedId
    private MoviePeopleKey id;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name="movie_id")
    private Movies movieId;

    @ManyToOne
    @MapsId("peopleId")
    @JoinColumn(name = "people_id")
    private People peopleId;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "role_id")
    private Role roleId;

    // additional properties
    // standard constructors, getters, and setters
}
