package modulo8;

import java.util.Objects;

public class Circulo extends Figura {
	private float radio;
	
	public Circulo() {
		super();
	}

	public Circulo(String nombre, float radio) {
		super(nombre);
		this.radio = radio;
	}
	

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(radio);
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
		Circulo other = (Circulo) obj;
		return Float.floatToIntBits(radio) == Float.floatToIntBits(other.radio);
	}



	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getRadio()=" + getRadio() + ", calcularPerimetro()=" + calcularPerimetro()
				+ ", calcularSuperficie()=" + calcularSuperficie() + ", getNombre()=" + getNombre() + "]";
	}

	@Override
	public float calcularPerimetro() {
		float resultado = (float) ((radio * 2) * 3.14);
		return resultado;
	}

	@Override
	public float calcularSuperficie() {
		float resultado = (float) (Math.pow(radio,2) * 3.14);
		return resultado;
	}

	@Override
	public String getValores() {
	
		StringBuilder resultado = new StringBuilder("radio= ");
		resultado.append(getRadio());
		resultado.append(" Nombre= ");
		resultado.append(getNombre());
		
		return resultado.toString();
	}
	
	
	
}
