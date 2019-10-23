package com.flirtex.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flirtex.cursomc.domain.Categoria;
import com.flirtex.cursomc.repositories.CategoriaRepository;
import com.flirtex.cursomc.services.exceptions.ObjectNotFoundExcepetion;

@Service
public class CategoriaService  {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepetion("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	
}
