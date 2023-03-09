package com.curso.indra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.indra.entity.Coche;
import com.curso.indra.service.ICocheService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CocheRestController {

	@Autowired
	private ICocheService cocheService;

	@GetMapping("/coches")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<Coche> indice() {
		return cocheService.findAll();
	}

	@GetMapping("coches/{matricula}")
	@ResponseStatus(HttpStatus.OK)
	public Coche mostrarCoche(@PathVariable String matricula) {
		return cocheService.findByMatricula(matricula);
	}

	@PostMapping("/coches")
	@ResponseStatus(HttpStatus.CREATED)
	public Coche crearCoche(@RequestBody Coche coche) {
		return cocheService.save(coche);
	}

	@PutMapping("/coches/{matricula}")
	@ResponseStatus(HttpStatus.CREATED)
	public Coche actualizarCoche(@RequestBody Coche coche, @PathVariable String matricula) {
		Coche cocheActual = cocheService.findByMatricula(matricula);
		cocheActual.setMarca(coche.getMarca());
		cocheActual.setModelo(coche.getModelo());
		cocheActual.setFechaMatriculacion(coche.getFechaMatriculacion());
		cocheActual.setBastidor(coche.getBastidor());

		return cocheService.save(cocheActual);
	}

	@DeleteMapping("/coches/{matricula}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrarCoche(@PathVariable String matricula) {
		cocheService.deleteByMatricula(matricula);
	}

}
