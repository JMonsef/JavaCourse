package modulo3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	/*
		3. Realizar un programa que permita determinar la cantidad de d�as que tiene el mes informando 
		el nombre del mismo acompa�ado de la cantidad de d�as que le corresponden. Recuerde que 30
		d�as tiene noviembre con abril junio y setiembre de 28 solo hay uno y los dem�s 31.
	*/
		Scanner sc = new Scanner(System.in);
		String mes = null;
		
		System.out.print("Escribe el nombre del mes:");
		mes = sc.nextLine();
		mes = mes.toLowerCase().trim();
		
		if(mes == "noviembre" || mes == "junio" || mes == "septiembre" || mes == "abril")
			System.out.print("Este mes tiene 31");
		else if(mes == "febrero")
			System.out.print("Este mes tiene 28");
		else
			System.out.print("Este mes tiene 30");
	}

}
