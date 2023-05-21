package com.edu.ege.EGE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ege.EGE.entities.Descricao;

public interface DescricaoRepository extends JpaRepository<Descricao,Long>{
	Descricao findByIdEvento(long id);
}
