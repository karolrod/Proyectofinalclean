package com.ada.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clienteid;
	private String nombre;
	private String cuil;
	private String direccion;
	private String telefono;
	private String mail;
	private String plazopago;

	public Cliente() {

	}

	public Cliente(int clienteid, String nombre, String cuil, String direccion, String telefono, String mail, String plazopago) {
		this.clienteid = clienteid;
		this.nombre = nombre;
		this.cuil = cuil;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mail = mail;
		this.plazopago = plazopago;
	}

	public int getClienteid() {
		return clienteid;
	}

	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
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

	public String getPlazopago() {
		return plazopago;
	}

	public void setPlazopago(String plazopago) {
		this.plazopago = plazopago;
	}

	

}
