package com.example.MoviesComments.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="people")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "birthday")
    private String birthday; //tarih date format olacak

    @Column(name = "country_id")
    private long country_id;
}
