package modulo7;

import java.util.Objects;

public class Profesor extends Persona {
	private String iosfa;

	public Profesor() {
		super();
	}
	public Profesor(String apellido, String nombre, String iosfa) {
		super(apellido, nombre);
		this.iosfa = iosfa;
	}
	public String getIosfa() {
		return iosfa;
	}
	public void setIosfa(String iosfa) {
		this.iosfa = iosfa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(iosfa);
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
		Profesor other = (Profesor) obj;
		return Objects.equals(iosfa, other.iosfa);
	}
	@Override
	public String toString() {
		return "Profesor [iosfa=" + iosfa + ", getApellido()=" + getApellido() + ", getNombre()=" + getNombre() + "]";
	}
	
	
	
	
	
}
