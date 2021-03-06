package modulo8;

import java.util.Objects;

public class Cuadrado extends Figura {

	private float lado;
	
	public Cuadrado() {
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(String nombre, float lado) {
		super(nombre);
		this.lado = lado;
	}

	
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lado);
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
		Cuadrado other = (Cuadrado) obj;
		return Float.floatToIntBits(lado) == Float.floatToIntBits(other.lado);
	}
	
	@Override
	public String toString() {
		return "Cuadrado [getLado()=" + getLado() + ", hashCode()=" + hashCode() + ", calcularPerimetro()="
				+ calcularPerimetro() + ", calcularSuperficie()=" + calcularSuperficie() + ", getNombre()="
				+ getNombre() + "]";
	}
	
	@Override
	public float calcularPerimetro() {
		float resultado = 4f * getLado();
		return resultado;
	}

	@Override
	public float calcularSuperficie() {
		float resultado = (float) Math.pow(getLado(), 2);
		return resultado;
	}

	@Override
	public String getValores() {
		StringBuilder resultado = new StringBuilder("Lado= ");
		
		resultado.append(getLado());
		resultado.append(" Nombre= ");
		resultado.append(getNombre());
		
		return resultado.toString();
	}

}
