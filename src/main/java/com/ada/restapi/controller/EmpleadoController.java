package com.ada.restapi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.restapi.model.Empleado;
import com.ada.restapi.repository.EmpleadoRepository;


//SWAGGER
@RestController
@RequestMapping(path = "/v1")
public class EmpleadoController {
	@Autowired
	EmpleadoRepository empRepo;

	Log log = LogFactory.getLog(EmpleadoController.class);
	
	
	@PostMapping(path = "/empleado")
	public ResponseEntity<Empleado> guardarEmpleado(@RequestBody Empleado emp) {
		log.info("guardarEmpleado " + emp);
		empRepo.save(emp);
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}
	
	
	
	
}
