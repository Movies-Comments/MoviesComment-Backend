package com.example.MoviesComments.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="MOVIES")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_date")
    private String releaseDate; //tarih date format olacak

    @Column(name = "average_rating")
    private float averageRating;

    @Column(name = "num_of_votes")
    private long numOfVotes;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Countries countryId;

    @ManyToMany
    @JoinTable(         // Note that using @JoinTable or even @JoinColumn isn't required.
                        // JPA will generate the table and column names for us.
                        // However, the strategy JPA uses won't always match the naming conventions we use.
                        // So, we need the possibility to configure table and column names.
            name = "Movie_Genres",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genres> markedGenresSet;

    @OneToMany(mappedBy = "movie")
    private Set<UserReviews> userReviewsSet;

    @OneToMany(mappedBy = "movieId")
    private Set<MoviePeople> moviePeopleSet;

}
