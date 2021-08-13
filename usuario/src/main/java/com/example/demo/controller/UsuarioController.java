package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.interfaces.IUsuarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")

public class UsuarioController {

	@Autowired
	IUsuarioService usuarioServ;

	@GetMapping("/getAll")
	public List<UsuarioDTO> getAll() {
		return usuarioServ.getAll();
	}

	@GetMapping("/getUsuarioById/{idusuario}")
	public UsuarioDTO getUsuarioById(@PathVariable("idusuario") int idusuario) {
		return usuarioServ.getUsuarioById(idusuario);
	}

	@PostMapping("/altaUsuario")
	public String altaUsuario(@RequestBody UsuarioDTO usuario) {
		return usuarioServ.altaUsuario(usuario);
	}

	@PostMapping("/editarUsuario")
	public String editarUsuario(@RequestBody UsuarioDTO usuario) {
		return usuarioServ.editarUsuario(usuario);
	}

	@GetMapping("/borrarUsuario/{idusuario}")
	public String borrarUsuario(@PathVariable("idusuario") int idusuario) {
		return usuarioServ.borrarUsuario(idusuario);
	}

}
