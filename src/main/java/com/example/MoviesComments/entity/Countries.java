package com.example.MoviesComments.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="COUNTRIES")
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "continent_name")
    private String continentName;

    @OneToMany(mappedBy = "countryId")
    private Set<Movies> moviesSet;

    @OneToMany(mappedBy = "countryId")
    private Set<People> peopleSet;


}
