package com.example.MoviesComments.service;

import com.example.MoviesComments.entity.MoviePeople;
import com.example.MoviesComments.entity.People;
import com.example.MoviesComments.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceProperty;
import java.util.List;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<People> findAllMovies(String fullName){
        List<People> people=peopleRepository.findByFullName(fullName);
            System.out.println(people);
        return people;
    }
}
