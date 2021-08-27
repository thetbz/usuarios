package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.interfaces.IUsuarioService;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

import mapper.UsuarioMapper;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	UsuarioRepository usuarioRepo;

	@Autowired
	BCryptPasswordEncoder passEnconder;

	UsuarioMapper convertidor = new UsuarioMapper();

	@Override
	public UsuarioDTO getUsuarioById(int idUsuario) {
		UsuarioDTO aux = convertidor.usuarioToUsuarioDto(usuarioRepo.findById(idUsuario).orElse(null));
		return aux;
	}

	@Override
	public List<UsuarioDTO> getAll() {
		List<UsuarioDTO> listaCentros = convertidor
				.listaUsuarioToListaUsuarioDto((List<Usuario>) usuarioRepo.findAll());
		return listaCentros;
	}

	@Override
	public String altaUsuario(UsuarioDTO c) {
		Usuario aux = convertidor.usuarioDtoToUsuario(c);
		aux.setContrasenia(passEnconder.encode(c.getContrasenia()));
		usuarioRepo.save(aux);
		return "Dado de alta correctamente";
	}

	@Override
	public String editarUsuario(UsuarioDTO c) {
		Usuario aux = convertidor.usuarioDtoToUsuario(c);
		usuarioRepo.save(aux);
		return "Editado correctamente";
	}

	@Override
	public String borrarUsuario(int idUsuario) {
		Usuario aux = convertidor.usuarioDtoToUsuario(getUsuarioById(idUsuario));
		usuarioRepo.delete(aux);
		return "Eliminado correctamente";
	}

}
