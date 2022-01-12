package com.davidmagalhaes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidmagalhaes.dsmovie.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
