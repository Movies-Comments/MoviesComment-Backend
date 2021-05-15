package com.example.MoviesComments.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="movies")
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
    private String release_date; //tarih date format olacak

    @Column(name = "average_rating")
    private float average_rating;

    /*
    @ManyToOne
    @JoinColumn(name="country_id")
    private Countries country_id;
    */

    @Column(name="country_id")
    private long country_id;

    @Column(name = "num_of_votes")
    private long num_of_votes;


}
