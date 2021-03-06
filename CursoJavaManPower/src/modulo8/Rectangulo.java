package modulo8;

import java.util.Objects;

public class Rectangulo extends Figura{

	private float altura;
	private float base;
	
	public Rectangulo() {
		super();
	}
	
	public Rectangulo(String nombre, float altura, float base) {
		super(nombre);
		this.altura = altura;
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(altura, base);
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
		Rectangulo other = (Rectangulo) obj;
		return Float.floatToIntBits(altura) == Float.floatToIntBits(other.altura)
				&& Float.floatToIntBits(base) == Float.floatToIntBits(other.base);
	}

	
	
	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + ", getValores()=" + getValores()
				+ ", calcularPerimetro()=" + calcularPerimetro() + ", calcularSuperficie()=" + calcularSuperficie()
				+ "]";
	}

	@Override
	public String getValores() {
		StringBuilder resultado = new StringBuilder("Altura= ");
		resultado.append(getAltura());
		resultado.append(" Base= ");
		resultado.append(getBase());
		resultado.append(" Nombre= ");
		resultado.append(getNombre());
		
		return resultado.toString();
	}

	@Override
	public float calcularPerimetro() {
		float resultado = (float) (2*(getBase()*getAltura()));
		return resultado;
	}

	@Override
	public float calcularSuperficie() {
		float resultado = (float) (getBase()*getAltura());
		return resultado;
	}

}
