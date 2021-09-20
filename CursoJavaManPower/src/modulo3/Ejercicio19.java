package modulo3;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros = 0;
		int suma = 0;
		int contador = 0;
		while(contador<11) {
			// Abajo se genera numeros aleatorios del 0 - 10
			numeros = (int) (Math.random()*10);
			suma = numeros + suma;
			System.out.print(numeros+" ");
			contador++;
		}
		System.out.println("\nSuma:"+ suma);
		System.out.println("Promedio:"+( suma/10 ));
	}

}
