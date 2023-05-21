package com.edu.ege.EGE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ege.EGE.entities.EventoMainAsset;

public interface EventoMainAssetRepository extends JpaRepository<EventoMainAsset,Long>{
	EventoMainAsset findByIdEvento(long id);
}
