package com.ada.restapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ada.restapi.model.Empleado;



@SuppressWarnings("unused")
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {

	Optional<Empleado> findById(int idEmpleado);

	void delete(Empleado entity);

}
