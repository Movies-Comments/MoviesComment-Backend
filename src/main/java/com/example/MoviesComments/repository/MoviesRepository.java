package com.example.MoviesComments.repository;

import com.example.MoviesComments.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MoviesRepository  extends JpaRepository<Movies,Long> {

    List<Movies> findByReleaseDate (String releaseDate);

}
