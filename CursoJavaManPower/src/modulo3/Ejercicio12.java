package modulo3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduce un numero del 1-36");
		int num = sc.nextInt();
		
		if(num > 0 && num < 13)
			System.out.println("primera docena");
		else if(num > 12 && num < 25)
			System.out.println("segunda docena");
		else if(num > 24 && num < 37)
			System.out.println("tercera docena");
		else if(num > 36 || num < 0)
			System.out.println("el numero esta fuera de rango");
	}

}
