package modulo3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce una letra");
		char caracter = sc.next().charAt(0);
		
		if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')
			System.out.println("la letras que has metido es una vocal");
		else
			System.out.println("la letras que has metido no es una vocal");
	}

}
