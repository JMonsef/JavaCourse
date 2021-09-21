package modulo3;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int variable[] = new int[3];

		for (int x = 0; x < 3; x++) {
			System.out.println("introduce un numero: ");
			variable[x] = sc.nextInt();
		}
		if (variable[0] > variable[1] && variable[0] > variable[2])
			System.out.println("el mayor es: " + variable[0]);
		else if (variable[1] > variable[0] && variable[1] > variable[2])
			System.out.println("el mayor es: " + variable[1]);
		else
			System.out.println("el mayor es: " + variable[2]);
	}

}
