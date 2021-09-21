package modulo3;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero = sc.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("medalla de oro");
			break;
		case 2:
			System.out.println("medalla de plata");
			break;
		case 3:
			System.out.println("medalla de bronce");
			break;
		default:
			System.out.println("siga participando");
			break;
		}
	}

}
