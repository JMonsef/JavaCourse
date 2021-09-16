package modulo234;

public class Mod_Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * 2- 	Crear una clase identificada como Mod2_Ejercicio2.java dentro del paquete modulo234, 
				recuerde tener chequeado el chekbox que permite crear el método main, luego mostrar en 
				pantalla todos los tipos de datos enteros con sus correspondientes máximos y mínimos, para 
				ello, una variable para cada uno de los casos como se muestra a continuación.
		 */
		byte bmin = -128;
		byte bmax = 127;
		// reemplazar el 0 por el valor que corresponda en todos los caso
		short smin = (short) ((short) Math.pow(2, 15)*(-1));
		short smax = (short) (Math.pow(2, 15) - 1);
		int imax = (int) (Math.pow(2, 31)*(-1));
		int imin = (int) (Math.pow(2, 31) - 1);
		long lmin = (long) (Math.pow(2, 63)*(-1));
		long lmax = (long) (Math.pow(2, 63) - 1);;
		System.out.println("tipo\tminimo\tmaximo");
		System.out.println("....\t......\t......");
		System.out.println("\nbyte\t" + bmin + "\t" + bmax);
		System.out.println("\nshort\t" + smin + "\t" + smax);
		System.out.println("\nint\t" + imin + "\t" + imax);
		System.out.println("\nlong\t" + lmin + "\t" + lmax);

	}

}
