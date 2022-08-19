package com.sebastian.prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebastian.prueba.dto.UsuarioDto;
import com.sebastian.prueba.services.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/listar")
	public ResponseEntity<List<UsuarioDto>> listarUsuarios() {
		return new ResponseEntity<>(usuarioService.listar(), HttpStatus.OK);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<UsuarioDto> guardarUsuario(@RequestBody UsuarioDto usuario) {
		return new ResponseEntity<>(usuarioService.guardar(usuario), HttpStatus.OK);
	}
	
	@PutMapping("/actualizar/{id}")
	public ResponseEntity<UsuarioDto> guardarUsuario(@RequestBody UsuarioDto usuario, @PathVariable Integer id) {
		return new ResponseEntity<>(usuarioService.actualizar(usuario, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<String> guardarUsuario(@PathVariable Integer id) {
		return new ResponseEntity<>(usuarioService.eliminar(id), HttpStatus.OK);
	}
}
