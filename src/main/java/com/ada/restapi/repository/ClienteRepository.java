package com.ada.restapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ada.restapi.model.Cliente;





public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

	public List<Cliente> findByNombreStartingWith(String nombre);


	public void save(Optional<Cliente> cli);
}
