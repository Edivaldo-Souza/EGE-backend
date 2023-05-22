package com.edu.ege.EGE.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.edu.ege.EGE.entities.EventosAssets;
import com.edu.ege.EGE.services.*;

@RestController
@RequestMapping("api/assets")
public class AssetsController{
	@Autowired
	private EventoAssetsService service;
	
	@GetMapping("/{id}")
	private List<EventosAssets> getById(@PathVariable long id){
		List<EventosAssets> lista = new ArrayList<EventosAssets>();
		for(EventosAssets e : service.getById(id)) {
			lista.add(e);
		}
		return lista;
	}
	
}
