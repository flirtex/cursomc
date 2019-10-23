package com.flirtex.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flirtex.cursomc.domain.Cliente;
import com.flirtex.cursomc.repositories.ClienteRepository;
import com.flirtex.cursomc.services.exceptions.ObjectNotFoundExcepetion;

@Service
public class ClienteService  {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepetion("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
	
}
