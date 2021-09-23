package modulo8;

import java.util.Objects;

public class Triangulo extends Figura {
	
	private float lado1;
	private float lado2;
	private float lado3;
	
	public Triangulo() {
		super();
	}
	
	public Triangulo(String nombre) {
		super(nombre);
	}
	
	

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getLado3() {
		return lado3;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lado1, lado2, lado3);
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
		Triangulo other = (Triangulo) obj;
		return Float.floatToIntBits(lado1) == Float.floatToIntBits(other.lado1)
				&& Float.floatToIntBits(lado2) == Float.floatToIntBits(other.lado2)
				&& Float.floatToIntBits(lado3) == Float.floatToIntBits(other.lado3);
	}

	@Override
	public String getValores() {
		StringBuilder resultado = new StringBuilder(" lado 1 = ");
		resultado.append(getLado1());
		resultado.append(" lado 2= ");
		resultado.append(getLado2());
		resultado.append(" lado 3= ");
		resultado.append(getLado3());
		resultado.append(" nombre = ");
		resultado.append(getNombre());
		return resultado.toString();
	}

	@Override
	public float calcularPerimetro() {
		float resultado = getLado1() + getLado2() + getLado3();
		return resultado;
	}

	@Override
	public float calcularSuperficie() {
		float resultado = (float) ((getLado1() * getLado2()) / 2);
		return resultado;
	}

}
