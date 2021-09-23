package modulo8;

import java.util.Objects;

public abstract class Figura {
	
	protected float maximaSuperficie;
	private String nombre;
	
	public Figura() {
		super();
	}

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public float getMaximaSuperficie() {
		return maximaSuperficie;
	}

	public void setMaximaSuperficie(float maximaSuperficie) {
		this.maximaSuperficie = maximaSuperficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maximaSuperficie, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return Float.floatToIntBits(maximaSuperficie) == Float.floatToIntBits(other.maximaSuperficie)
				&& Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public String toString() {
		return "Figura [maximaSuperficie=" + maximaSuperficie + ", nombre=" + nombre + "]";
	}
	
	abstract public String getValores();
	
	abstract public float calcularPerimetro();
	
	abstract public float calcularSuperficie();
	
	
}
