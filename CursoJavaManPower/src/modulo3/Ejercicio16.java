package modulo3;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("mete un numero: ");
		int numero = sc.nextInt();
		System.out.println("Tabla de multiplicar:");
		System.out.println("---------------------");
		for(int x = 0;x<11;x++) {
			System.out.println(numero +" x "+ x + " = "+ (numero*x));
		}
		
	}

}
