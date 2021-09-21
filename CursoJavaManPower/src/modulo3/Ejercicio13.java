package modulo3;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String mes = null;
		
		System.out.print("Escribe el nombre del mes:");
		mes = sc.nextLine();
		mes = mes.toLowerCase().trim();
		
		switch(mes) {
			case "noviembre":
				System.out.print("Este mes tiene 31");
				break;
			case "junio":
				System.out.print("Este mes tiene 31");
				break;
			case "septiembre":
				System.out.print("Este mes tiene 31");
				break;
			case "abril":
				System.out.print("Este mes tiene 31");
				break;
			case "febrero":
				System.out.print("Este mes tiene 28");
				break;
			default:
				System.out.println("este mes tiene 30");
		}

	}

}
