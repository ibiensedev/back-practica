package com.curso.indra.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coche")
public class Coche implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String matricula;
	private String marca;
	private String modelo;
	@Column(name = "fecha_matriculacion")
	private LocalDate fechaMatriculacion;
	private Integer bastidor;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public Integer getBastidor() {
		return bastidor;
	}

	public void setBastidor(Integer bastidor) {
		this.bastidor = bastidor;
	}

}
