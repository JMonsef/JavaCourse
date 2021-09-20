package modulo3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce numero del 0-12:");
		int edad = sc.nextInt();
		if(edad == 0)
			System.out.println("jardin de infantes");
		else if(edad>0 && edad<7)
			System.out.println("primaria");
		else if(edad>6 && edad<13)
			System.out.println("secundaria");
		else
			System.out.println("mete una edad de las que se te pide");
	}

}
