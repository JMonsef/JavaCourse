package modulo5;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "Esto es una prueba de la clase String";
		int contador = 0;
		for(int x = 0;x<txt.length();x++) {
			char letra = txt.charAt(x);
			if(letra == 'a' || letra == 'u' || letra == 'i' || letra == 'e' || letra == 'o') {
				contador++;
			}
		}
		System.out.println("el texto tiene "+(txt.length()-contador)+" consonantes" + "y "
		+contador+" vocales");
	}

}
