package com.ada.restapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ada.restapi.model.Cliente;
import com.ada.restapi.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository cliRepo;
	
	public void borrarCliente (int idcli) {
		Optional<Cliente> cli = cliRepo.findById(idcli);
	//	if (cli.get()!=null) {
		//	cliRepo.delete(cli.get());
		//}
	
		if (!Optional.empty().equals(cli)) {
			cliRepo.delete(cli.get());
		}
	
	
	
	}
}

