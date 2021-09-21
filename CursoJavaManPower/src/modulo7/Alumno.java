package modulo7;

import java.util.Objects;

public class Alumno extends Persona {
	private int legajo;
	
	public Alumno() {
		super();
	}

	public Alumno(String apellido, String nombre, int legajo) {
		super(apellido, nombre);
		this.legajo = legajo;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(legajo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return legajo == other.legajo;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + "]";
	}
	
}
