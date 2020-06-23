package com.ada.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empleadoid;
	private String nombre;
	private String cuil;
	private String direccion;
	private String telefono;
	private String mail;
	private float valorhora;

	public Empleado() {

	}

	public Empleado(int empleadoid, String nombre, String cuil, String direccion, String telefono, String mail, float valorhora) {
		this.empleadoid = empleadoid;
		this.nombre = nombre;
		this.cuil = cuil;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mail = mail;
		this.valorhora = valorhora;
	}

	


	
	public int getEmpleadoid() {
		return empleadoid;
	}

	public void setEmpleadoid(int empleadoid) {
		this.empleadoid = empleadoid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public float getValorhora() {
		return valorhora;
	}

	public void setValorhora(float valorhora) {
		this.valorhora = valorhora;
	}

}
