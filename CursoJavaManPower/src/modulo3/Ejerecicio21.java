package modulo3;

import java.util.Scanner;

public class Ejerecicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int trabajador[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el salario: ");
		int opcA = sc.nextInt();
		trabajador[0] = opcA;
		menus("categoria A","categoria B","categoria C");
		byte opcB = sc.nextByte();
		switch(opcB) {
		case 1:
			trabajador[1] = 1000;
			break;
		case 2:
			trabajador[1] = 2000;
			break;
		case 3:
			trabajador[1] = 3000;
			break;
		}
		menus("1-5 años","6-10 años","mas de 10 años");
		byte opcC = sc.nextByte();
		switch(opcC) {
		case 1:
			trabajador[2] = 5;
			break;
		case 2:
			trabajador[2] = 10;
			break;
		case 3:
			trabajador[2] = 30;
			break;
		}
		
		int salarioFinal = ((trabajador[0] * (trabajador[2] / 100)) + trabajador[1]) + trabajador[0];
		System.out.println("le corresponde el siguiente salario: " + salarioFinal);
	}
	private static void menus(String a,String b,String c) {
		String opciones[] = {a, b, c};
		for(byte x = 0;x<3;x++) {
			System.out.println((x+1)+") "+ opciones[x]);
		}
		System.out.print("introduce la opcion: ");
	}
}
