package mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.example.demo.DTO.UsuarioDTO;
import com.example.demo.model.Usuario;

public class UsuarioMapper {

	public List<UsuarioDTO> listaUsuarioToListaUsuarioDto(List<Usuario> listaUsuario) {

		List<UsuarioDTO> listaUsuarioDto = new ArrayList<>();
		if (!listaUsuario.isEmpty()) {
			for (Usuario usuario : listaUsuario) {
				UsuarioDTO usuarioDTO = new UsuarioDTO();

				if (StringUtils.isNotBlank(Integer.toString(usuario.getIdusuarios())))
					usuarioDTO.setIdusuarios(usuario.getIdusuarios());
				if (StringUtils.isNotBlank(usuario.getNombre()))
					usuarioDTO.setNombre(usuario.getNombre());
				if (StringUtils.isNotBlank(usuario.getApellido()))
					usuarioDTO.setApellido(usuario.getApellido());
				if (StringUtils.isNotBlank(usuario.getMail()))
					usuarioDTO.setMail(usuario.getMail());
				if (StringUtils.isNotBlank(usuario.getContrasenia()))
					usuarioDTO.setContrasenia(usuario.getContrasenia());
				if (StringUtils.isNotBlank(usuario.getFechaalta().toString()))
					usuarioDTO.setFechaalta(usuario.getFechaalta());

				listaUsuarioDto.add(usuarioDTO);
			}
		}
		return listaUsuarioDto;
	}

	public UsuarioDTO usuarioToUsuarioDto(Usuario usuario) {

		UsuarioDTO usuarioDto = new UsuarioDTO();

		if (StringUtils.isNotBlank(Integer.toString(usuario.getIdusuarios())))
			usuarioDto.setIdusuarios(usuario.getIdusuarios());
		if (StringUtils.isNotBlank(usuario.getNombre()))
			usuarioDto.setNombre(usuario.getNombre());
		if (StringUtils.isNotBlank(usuario.getApellido()))
			usuarioDto.setApellido(usuario.getApellido());
		if (StringUtils.isNotBlank(usuario.getMail()))
			usuarioDto.setMail(usuario.getMail());
		if (StringUtils.isNotBlank(usuario.getContrasenia()))
			usuarioDto.setContrasenia(usuario.getContrasenia());
		if (StringUtils.isNotBlank(usuario.getFechaalta().toString()))
			usuarioDto.setFechaalta(usuario.getFechaalta());

		return usuarioDto;
	}

	public Usuario usuarioDtoToUsuario(UsuarioDTO usuarioDto) {

		Usuario usuario = new Usuario();

		if (StringUtils.isNotBlank(Integer.toString(usuarioDto.getIdusuarios())))
			usuario.setIdusuarios(usuarioDto.getIdusuarios());
		if (StringUtils.isNotBlank(usuarioDto.getNombre()))
			usuario.setNombre(usuarioDto.getNombre());
		if (StringUtils.isNotBlank(usuarioDto.getApellido()))
			usuario.setApellido(usuarioDto.getApellido());
		if (StringUtils.isNotBlank(usuarioDto.getMail()))
			usuario.setMail(usuarioDto.getMail());
		if (StringUtils.isNotBlank(usuarioDto.getContrasenia()))
			usuario.setContrasenia(usuarioDto.getContrasenia());
		if (StringUtils.isNotBlank(usuarioDto.getFechaalta().toString()))
			usuario.setFechaalta(usuarioDto.getFechaalta());

		return usuario;
	}

}
