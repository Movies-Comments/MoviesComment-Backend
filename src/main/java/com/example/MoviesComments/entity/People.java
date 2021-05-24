package com.example.MoviesComments.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="PEOPLE")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "birthday")
    private String birthday; //tarih date format olacak

    @ManyToOne
    @JoinColumn(name="country_id")
    private Countries countryId;

    @OneToMany(mappedBy = "peopleId")
    private Set<MoviePeople> moviePeopleSet;
}
