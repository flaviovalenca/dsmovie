package com.devsuperio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperio.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
