package com.edu.ege.EGE.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.ege.EGE.entities.Evento;
import com.edu.ege.EGE.repository.EventoRepository;

@Service
public class EventoService {
	@Autowired
	EventoRepository repository;
	
	public Evento create(Evento obj) {
		List<Evento> allEventos = getAll();
		for(int i = 0; i<allEventos.size(); i++) {
			allEventos.get(i).setLatest(false);
			repository.save(allEventos.get(i));
		}
		
		obj.setLatest(true);
		repository.save(obj);
		return obj;
	}
	
	public Evento findById(long id) {
		return repository.findById(id);
	}
	
	public List<Evento> getAll(){
		return repository.findAll();
	}
	
	public Evento findLatest() {
		return repository.findFirstByOrderByIdDesc();
	}
}
