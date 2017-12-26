package com.film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.film.models.Glumac;

@Repository
public interface GlumacRepository extends JpaRepository<Glumac, Long> {

}