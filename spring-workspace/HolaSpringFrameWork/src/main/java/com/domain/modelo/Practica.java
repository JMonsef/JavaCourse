package com.domain.modelo;

public class Practica implements Model{

	private int codigo;
	private String nombre;

	public Practica() {

	}

	public Practica(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Practica(int codigo) {
		this.codigo = codigo;
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


	public boolean equals(Object obj) {

	return obj instanceof Practica && ((Practica)obj).getCodigo() == codigo && ((Practica)obj).getNombre().equals(nombre);
}

	public int hashCode() {
	 return (int) (codigo + nombre.hashCode());
}

	public String toString() {
		StringBuilder sb = new StringBuilder("codigo =");
		sb.append(this.codigo);
		sb.append(", nombre =");
		sb.append(this.nombre);
	
		return sb.toString();
	
	}
}

