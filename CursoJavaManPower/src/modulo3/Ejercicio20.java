package modulo3;

import java.util.Arrays;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		int numeros;
		int contador = 0;
		int arrayNum[] = new int[10];
		do {
			// Abajo se genera numeros aleatorios del 0 - 10
			numeros = (int) (Math.random()*10);
			arrayNum[contador] = numeros;
			System.out.print(numeros+" ");
			contador++;
		}while(contador<10);
		Arrays.sort(arrayNum);
		System.out.println("\nMinimo: " + arrayNum[0]);
		System.out.println("Maximo: " + arrayNum[arrayNum.length - 1]);
	}

}
