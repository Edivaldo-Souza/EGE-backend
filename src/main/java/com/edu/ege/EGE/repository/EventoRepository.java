package com.edu.ege.EGE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ege.EGE.entities.Evento;

public interface EventoRepository extends JpaRepository<Evento,Long>{
	Evento findById(long id);
	Evento findByLatest(boolean isLatest);
	Evento findFirstByOrderByIdDesc();
}
