package com.edu.ege.EGE.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.ege.EGE.repository.AssetsRepository;
import com.edu.ege.EGE.entities.EventosAssets;

@Service
public class EventoAssetsService {
	@Autowired
	AssetsRepository repository;
	
	public List<EventosAssets> getById(long id){
		return repository.findByIdEvento(id);
	}
}
