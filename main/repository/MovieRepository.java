package com.Gowtham.Springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gowtham.Springboot.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	List<Movie> findByGenera(String genera);
}