package modulo3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int jugador1;
		int jugador2;
		
		System.out.println("Jugador 1, meta 0 para piedra, "
							+ "meta 1 para papel, meta 2 para tijera");
		jugador1 = sc.nextInt();
		
		System.out.println("Jugador 2, meta 0 para piedra, "
				+ "meta 1 para papel, meta 2 para tijera");
		jugador2 = sc.nextInt();
		
		if(jugador1 == 0 && jugador2 == 2)
			System.out.println("jugador 1, gana");
		else if(jugador1 == 2 && jugador2 == 1)
			System.out.println("jugador 1, gana");
		else
			System.out.println("jugador 2, gana");
	}

}
