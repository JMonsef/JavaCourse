package modulo7;

import java.util.Objects;

public class Persona {
	private String Apellido;
	private String Nombre;
	
	public Persona() {
		super();
	}
	public Persona(String apellido, String nombre) {
		super();
		Apellido = apellido;
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Apellido, Nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(Apellido, other.Apellido) && Objects.equals(Nombre, other.Nombre);
	}
	@Override
	public String toString() {
		return "Persona [Apellido=" + Apellido + ", Nombre=" + Nombre + "]";
	}
	
	
	
	
}
