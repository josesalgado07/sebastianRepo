package com.sebastian.prueba.dto;

public class UsuarioDto {

	private Integer id;
	
	private String nombre;
	
	private String cedula;
	
	public UsuarioDto() {
	}

	public UsuarioDto(Integer id, String nombre, String cedula) {
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	
}
