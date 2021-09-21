package modulo3;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("elige clase: a, b, c");
		char caracteres = sc.next().charAt(0);
		switch(caracteres) {
		case 'a':
			System.out.println("4 ruedas y un motor.");
			break;
		case 'b':
			System.out.println("4 ruedas, un motor, cierre centralizado y aire.");
			break;
		case 'c':
			System.out.println("4 ruedas, un motor, cierre centralizado, aire y airbag.");
			break;
		}

	}

}
