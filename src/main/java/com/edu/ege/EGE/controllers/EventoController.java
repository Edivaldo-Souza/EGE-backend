package com.edu.ege.EGE.controllers;

import java.util.ArrayList;
import java.util.List;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.ege.EGE.entities.Evento;
import com.edu.ege.EGE.services.EventoService;

@CrossOrigin(maxAge=3600)
@RestController
@RequestMapping("api/event")
public class EventoController {
	@Autowired
	private EventoService service;
	@Autowired
	private ModelMapper mapper;
	
	@CrossOrigin(origins="http://localhost:3000", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
	@GetMapping("/latest")
	public ResponseEntity<Evento> getLatest() {
		Evento desc = service.findLatest();
		if(desc!=null) {
			return new ResponseEntity<>(desc,HttpStatus.OK);
		}
		else return ResponseEntity.notFound().build();
	}
	
	@CrossOrigin(origins="http://localhost:3000", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
	@GetMapping("/{id}")
	public ResponseEntity<Evento> getById(@PathVariable long id) {
		Evento desc = service.findById(id);
		if(desc!=null) {
			return new ResponseEntity<>(desc,HttpStatus.OK);
		}
		else return ResponseEntity.notFound().build();
	}
	
	@CrossOrigin(origins="http://localhost:3000", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
	@GetMapping()
	private List<Evento> getAll(){
		List<Evento> lista = new ArrayList<Evento>();
		for(Evento e : service.getAll()) {
			lista.add(e);
		}
		return lista;
	}
	
}
