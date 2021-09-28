package com.domain.modelo;

public class PracticaResuelta {
	
	private int codigo;
	private float nota;
	private String observaciones;
	
	public PracticaResuelta() {
		
	}

	public PracticaResuelta(int codigo, float nota, String observaciones) {
		super();
		this.codigo = codigo;
		this.nota = nota;
		this.observaciones = observaciones;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public boolean equals(Object obj) {


		return obj instanceof PracticaResuelta && ((PracticaResuelta)obj).getCodigo() == codigo &&
				((PracticaResuelta)obj).getNota() == nota;
	}

	public int hashCode() {
		return (int) (codigo + nota);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("codigo =");
		sb.append(this.codigo);
		sb.append(", nota =");
		sb.append(this.nota);
		sb.append(", observaciones =");
		sb.append(this.observaciones);
		sb.append(", estudios =");
		
		return sb.toString();
		
	}
}

