package com.edu.ege.EGE.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.ege.EGE.entities.Descricao;
import com.edu.ege.EGE.repository.DescricaoRepository;

@Service
public class DescricaoService {
	@Autowired
	DescricaoRepository repository;
	
	public Descricao findById(long id) {
		return repository.findByIdEvento(id);
	}
}
