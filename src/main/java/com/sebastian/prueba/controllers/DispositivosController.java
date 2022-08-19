package com.sebastian.prueba.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dispositivos")
public class DispositivosController {

	@GetMapping("/buscar")
	public ResponseEntity<String> buscar() {
		String disposito = "Iphone";
		
		return new ResponseEntity<>(disposito, HttpStatus.OK);
	}
}
