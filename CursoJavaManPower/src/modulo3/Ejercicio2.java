package modulo3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 2. Realizar un programa que permita identificar si un número es par o impar,
		//    el mismo deberá estar guardado en una variable de tipo int.
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce a number: ");
		int number = sc.nextInt();
		if(number % 2 == 0) {
			System.out.println("this number is even!");
		}else {
			System.out.println("this number is odd!");
		}


	}

}
