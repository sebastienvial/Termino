package com.kcs.services.impl;

import java.util.List;
import java.util.Optional;

import com.kcs.models.Termino;
import com.kcs.repository.TerminoRepository;
import com.kcs.services.TerminoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminoServiceImpl implements TerminoService {
    @Autowired
    TerminoRepository repository;

	@Override
	public void delete(Termino termino) {		
		
	}

	@Override
	public List<Termino> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Termino> findOne(Integer id) {
		return repository.findById(id);
	}

	@Override
	public void save(Termino termino) {
		
		
	}

	@Override
	public void update(Termino termino) {
		
		
	}
}
