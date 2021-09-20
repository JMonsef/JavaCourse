package modulo3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero = sc.nextInt();
		if(numero == 1)
			System.out.println("medalla de oro");
		else if(numero == 2)
			System.out.println("medalla de plata");
		else if(numero == 3)
			System.out.println("medalla de bronce");
		else
			System.out.println("siga participando");

	}

}
