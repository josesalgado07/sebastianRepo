package com.sebastian.prueba.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sebastian.prueba.dto.UsuarioDto;

@Service
public class UsuarioService {

	private int id = 0;
	
	private List<UsuarioDto> listUsuarios = new ArrayList<>();
	
	public List<UsuarioDto> listar() {
		return this.listUsuarios;
	}
	
	public UsuarioDto guardar(UsuarioDto usuario) {
		this.id++;
		usuario.setId(this.id);
		this.listUsuarios.add(usuario);
		
		return usuario;
		//return new UsuarioDto(1, "Sebastian", "1234");
	}
	
	public UsuarioDto actualizar(UsuarioDto usuario, Integer id) {
		UsuarioDto userReturn = new UsuarioDto();
		
		for (int i = 0; i < listUsuarios.size(); i++) {
			UsuarioDto usuarioDto = listUsuarios.get(i);
			
			if (id == usuarioDto.getId()) {
				userReturn = usuarioDto;
				
				listUsuarios.get(i).setNombre(usuario.getNombre());
				listUsuarios.get(i).setCedula(usuario.getCedula());
			}
		}
		
		return userReturn;
	}
	
	public String eliminar(Integer id) {
		List<UsuarioDto> newList = new ArrayList<>();
		
		for (UsuarioDto usuarioDto : listUsuarios) {
			if (id != usuarioDto.getId()) {
				newList.add(usuarioDto);
			}
		}
		
		this.listUsuarios = newList;

		return "Se elimino el usuario";
		//return new UsuarioDto(1, "Sebastian", "1234");
	}
}
