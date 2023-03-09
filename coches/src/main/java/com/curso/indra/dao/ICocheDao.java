package com.curso.indra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.indra.entity.Coche;

public interface ICocheDao extends JpaRepository<Coche, String> {

	public Coche findByMatricula(String matricula);

	public void deleteByMatricula(String matricula);

}
