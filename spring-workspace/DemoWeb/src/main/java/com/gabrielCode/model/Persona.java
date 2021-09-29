package com.gabrielCode.model;

import javax.persistence.*;

@Entity
public class Persona {
	@Id
	private int codigo;
	@Column(name = "PER_NOMBRE", length = 50)
	private String nombre;
	
	public Persona(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
