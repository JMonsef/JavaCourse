package modulo3;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		int contador = 0;
		while(contador<11) {
		
		int trabajador[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("generando salario entre 12.000 y 60.000 ");
		int opcA = (int) (Math.random()*60_000+12_000);
		trabajador[0] = opcA;
		
		//aqui abajo va la categoria
		byte opcB = (byte) (Math.random()*3+1);
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
		
		//aqui abajo va la antiguedad
		byte opcC = (byte) (Math.random()*3+1);
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
		System.out.println("al trabajador "+ contador +" le corresponde el siguiente salario: " + salarioFinal);
		
		contador++;
		}
	}
}
