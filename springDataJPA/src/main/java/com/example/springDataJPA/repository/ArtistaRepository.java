package com.example.springDataJPA.repository;

import com.example.springDataJPA.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Integer> {

}
