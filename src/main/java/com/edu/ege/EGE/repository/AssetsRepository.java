package com.edu.ege.EGE.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ege.EGE.entities.EventosAssets;

public interface AssetsRepository  extends JpaRepository<EventosAssets,Long>{
	List<EventosAssets> findByIdEvento(long id);
}
