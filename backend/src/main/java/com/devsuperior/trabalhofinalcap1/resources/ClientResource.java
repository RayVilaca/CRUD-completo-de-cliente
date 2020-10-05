package com.devsuperior.trabalhofinalcap1.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.trabalhofinalcap1.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria", "2452245", 150.5, Instant.now(), 5));
		list.add(new Client(2L, "Marcos", "2452245", 10.5, Instant.now(), 3));
		list.add(new Client(3L, "Marta", "2452245", 187.25, Instant.now(), 2));
		return ResponseEntity.ok().body(list);
	}
	
}
