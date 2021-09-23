package patrones.factory;

public class Piedra extends PiedraPapelTijeraFactory {

	public Piedra() {
		setNumero(0);
		setNombre("Piedra");
	}
	
	@Override
	public boolean isMe(int pNumero) {
		// TODO Auto-generated method stub
		return pNumero == 0;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pptf) {
		// resultado 0 empata
		// resultado 1 gana
		// resultado -1 pierde
		// piedra 0 empata(yo)
		//papel 1 pierde
		//tijera 2 gana
		
		return arbitrar(pptf.getNumero());
	}
	
	private int arbitrar(int numero) {
		int resultado = 0;
		
		if(numero == 0)
			resultado = 0;
		if(numero == 1)
			resultado = -1;
		if(numero == 2)
			resultado = 1;
		
		return resultado;
	}

}
