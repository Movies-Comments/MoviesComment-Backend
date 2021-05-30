package com.example.MoviesComments.repository;

import com.example.MoviesComments.entity.MoviePeople;
import com.example.MoviesComments.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People,Long> {

    List<People> findByFullName (String fullName);

}
