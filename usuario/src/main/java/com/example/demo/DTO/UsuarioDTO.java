package com.example.demo.DTO;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("UsuarioDTO")

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public int idusuarios;

	public String nombre;

	public String apellido;

	public String mail;

	public String contrasenia;

	public Date fechaalta;

	public UsuarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioDTO(int idusuarios, String nombre, String apellido, String mail, String contrasenia, Date fechaalta) {
		super();
		this.idusuarios = idusuarios;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.contrasenia = contrasenia;
		this.fechaalta = fechaalta;
	}

	public int getIdusuarios() {
		return idusuarios;
	}

	public void setIdusuarios(int idusuarios) {
		this.idusuarios = idusuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Date getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(Date fechaalta) {
		this.fechaalta = fechaalta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [idusuarios=" + idusuarios + ", nombre=" + nombre + ", apellido=" + apellido + ", mail="
				+ mail + ", contrasenia=" + contrasenia + ", fechaalta=" + fechaalta + "]";
	}

}
