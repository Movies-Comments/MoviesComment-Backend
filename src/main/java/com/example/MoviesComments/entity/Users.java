package com.example.MoviesComments.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="USERS")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<UserReviews> userReviewsSet;

}
