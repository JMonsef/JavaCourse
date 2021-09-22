package es.com.manpower.notas.vista;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("1) alumnos");
		int opc = sc.nextInt();
		switch(opc) {
		case 1:
			opcionesAlumnos();
			break;
		case 2:
			break;
		}

	}
	
	private static void opcionesAlumnos() {
		System.out.println("1) ver todos \n2) eliminar alumno por id \n3)insertar alumno \n4)modificar alumno");
		int opc = sc.nextInt();
		switch(opc) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}

}
