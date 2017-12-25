package com.film.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.film.models.Film;
import com.film.models.Kategorija;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

	public List<Film> findByKategorija(Kategorija kategorija);

}