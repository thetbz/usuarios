package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Usuarios")
@Table(name = "USUARIOS")
public class Usuario {
	@Id
	@Column(name = "idusuarios")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idusuarios;
	@Column
	public String nombre;
	@Column
	public String apellido;
	@Column
	public String mail;
	@Column
	public String contrasenia;
	@Column
	public Date fechaalta;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idusuarios, String nombre, String apellido, String mail, String contrasenia, Date fechaalta) {
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

	@Override
	public String toString() {
		return "Usuario [idusuarios=" + idusuarios + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail
				+ ", contrasenia=" + contrasenia + ", fechaalta=" + fechaalta + "]";
	}

}
