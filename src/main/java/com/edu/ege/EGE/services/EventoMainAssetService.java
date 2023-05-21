package com.edu.ege.EGE.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.ege.EGE.entities.EventoMainAsset;
import com.edu.ege.EGE.repository.EventoMainAssetRepository;
@Service
public class EventoMainAssetService {
	@Autowired
	EventoMainAssetRepository repository;
	
	public EventoMainAsset findById(long id) {
		return repository.findByIdEvento(id);
	}
}
