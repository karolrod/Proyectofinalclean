package com.ada.restapi.form;

import java.time.LocalDate;

public class ServicioForm {

	
	private int clienteid;
	private int empleadoid;
	private float canthora;
	private LocalDate fecha;
	public int getClienteid() {
		return clienteid;
	}
	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}
	public int getEmpleadoid() {
		return empleadoid;
	}
	public void setEmpleadoid(int empleadoid) {
		this.empleadoid = empleadoid;
	}
	public float getCanthora() {
		return canthora;
	}
	public void setCanthora(float canthora) {
		this.canthora = canthora;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
	
	
	
	
	
}
