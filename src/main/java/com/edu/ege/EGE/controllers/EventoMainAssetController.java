package com.edu.ege.EGE.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.edu.ege.EGE.entities.EventoMainAsset;
import com.edu.ege.EGE.services.EventoMainAssetService;

@CrossOrigin(maxAge=3600)
@RestController
@RequestMapping("api/mainasset")
public class EventoMainAssetController {
	@Autowired
	private EventoMainAssetService service;
	
	@CrossOrigin(origins="http://localhost:3000", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
	@GetMapping("/{id}")
	public ResponseEntity<EventoMainAsset> getById(@PathVariable long id) {
		EventoMainAsset desc = service.findById(id);
		if(desc!=null) {
			return new ResponseEntity<>(desc,HttpStatus.OK);
		}
		else return ResponseEntity.notFound().build();
	}
}
