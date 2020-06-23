package com.ada.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ada.restapi.model.Cliente;
import com.ada.restapi.repository.ClienteRepository;
import com.ada.restapi.service.ClienteService;
import com.google.common.collect.Lists;





	
//SWAGGER
@RestController
@RequestMapping(path = "/v1")
public class ClienteController {

	@Autowired
	ClienteService cliServ;

	
	
	
	@Autowired
	ClienteRepository cliRepo;

	Log log = LogFactory.getLog(ClienteController.class);
	
	//agregar un cliente
	@PostMapping(path = "/cliente")
	public ResponseEntity<Cliente> guardarCliente(@RequestBody Cliente cli) {
		log.info("guardarCliente " + cli);
		cliRepo.save(cli);
		return new ResponseEntity<>(cli, HttpStatus.CREATED);
	}
	
	// eliminar un cliente
	@DeleteMapping(path = "/cliente/{id}")
	public ResponseEntity<Object> deleteCliente(@PathVariable Integer id) {
		log.info("metodo: deleteProducto " + id);
		cliServ.borrarCliente(id);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}

	
	// generar listado de todos los clientes
		@GetMapping(path = "/clientes")
		public ResponseEntity<List<Cliente>> listaCliente() {
			log.info("comienzo invocacion listar clientes...");
			Iterable<Cliente> lc = cliRepo.findAll();
			List<Cliente> result = Lists.newArrayList(lc);
			return new ResponseEntity<>(result, HttpStatus.OK);
		}

		// generar listado de clientes por id
		@GetMapping(path = "/clientes/{id}")
		public ResponseEntity<Cliente> getCliente(@PathVariable("id") Integer id) {
			log.info("metodo: getProducto");
			Optional<Cliente> cli = cliRepo.findById(id);
			if (Optional.empty().equals(cli)) {
				return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			} else {

				Cliente cliRespuesta = cli.get();
				return new ResponseEntity<>(cliRespuesta, HttpStatus.OK);
			}
		}

		// mofidificar clientes por id
				@PutMapping(path = "/clientes/modificar/{id}")
				public ResponseEntity<Cliente> modificarcliente(@PathVariable("id") Integer id) {
					log.info("metodo: modificar cliente");
					Optional<Cliente> cli = cliRepo.findById(id);
					if (Optional.empty().equals(cli)) {
						return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
					} else {
						cliRepo.save(cli);
						return new ResponseEntity<>( HttpStatus.OK);
					}
				}
	
	
	
	
}
