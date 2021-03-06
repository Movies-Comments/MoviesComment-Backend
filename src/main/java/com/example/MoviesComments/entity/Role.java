package com.example.MoviesComments.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "role_name")
    private String roleName;

    @OneToMany(mappedBy = "roleId")
    private Set<MoviePeople> moviePeopleSet;

}
