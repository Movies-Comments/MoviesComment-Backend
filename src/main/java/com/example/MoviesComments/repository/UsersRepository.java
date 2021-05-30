package com.example.MoviesComments.repository;

import com.example.MoviesComments.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users,Long> {

    List<Users> findByUserName (String username);

    List<Users> findByEmail (String email);
}
