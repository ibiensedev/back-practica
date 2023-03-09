package com.curso.indra.service;

import java.util.List;

import com.curso.indra.entity.Coche;

public interface ICocheService {
	
	public List<Coche> findAll();
	
	public Coche findByMatricula(String matricula);
	
	public Coche save(Coche coche);
	
	public void deleteByMatricula(String matricula);
	
	

}
