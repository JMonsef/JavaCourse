package patrones.factory;

import java.util.*;

public abstract class PiedraPapelTijeraFactory {
	
	private static List<PiedraPapelTijeraFactory> elementos;
	private String nombre;
	private int numero;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public PiedraPapelTijeraFactory() {
		
	}
	
	public static PiedraPapelTijeraFactory getInstance(int numero) {
		elementos = new ArrayList<PiedraPapelTijeraFactory>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		for(PiedraPapelTijeraFactory pptf: elementos) {
			if(pptf.isMe(numero))
				return pptf;
			
		}
		return null;
	}
	
	public abstract boolean isMe(int pNumero);
	
	public abstract int comparar(PiedraPapelTijeraFactory pptf);
}
