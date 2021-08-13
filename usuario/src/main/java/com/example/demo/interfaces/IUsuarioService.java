package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.DTO.UsuarioDTO;

public interface IUsuarioService {
	public UsuarioDTO getUsuarioById(int idUsuario);

	public List<UsuarioDTO> getAll();

	public String altaUsuario(UsuarioDTO c);

	public String editarUsuario(UsuarioDTO c);

	public String borrarUsuario(int idUsuario);

}
