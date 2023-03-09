package com.curso.indra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.indra.dao.ICocheDao;
import com.curso.indra.entity.Coche;

@Service
public class CocheServiceImpl implements ICocheService {

	@Autowired
	private ICocheDao cocheDao;

	@Override
	@Transactional(readOnly = true)
	public List<Coche> findAll() {
		return cocheDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Coche findByMatricula(String matricula) {
		return cocheDao.findByMatricula(matricula);
	}

	@Override
	@Transactional
	public Coche save(Coche coche) {
		return cocheDao.save(coche);
	}

	@Override
	@Transactional
	public void deleteByMatricula(String matricula) {
		cocheDao.deleteByMatricula(matricula);

	}

}
