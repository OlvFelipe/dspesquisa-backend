package com.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devpesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	
}
