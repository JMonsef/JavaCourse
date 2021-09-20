package modulo3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ingresa una de estas categorias: ");
		char categoria = sc.next().charAt(0);
		switch(categoria) {
			case 'a':
				System.out.println("Hijo");
				break;
			case 'b':
				System.out.println("Padres");
				break;
			case 'c':
				System.out.println("Abuelos");
				break;
		}
	}

}
