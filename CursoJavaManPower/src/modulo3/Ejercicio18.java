package modulo3;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tabla de multiplicar:");
		System.out.println("---------------------");
		for(int x = 0;x<11;x++) {
			System.out.println("Tabla del "+x);
			System.out.println("---------------------");
			for(int y = 0;y<11;y++) {
				System.out.println(x +" x "+ y + " = "+ (y*x));
			}
			System.out.println("---------------------");
		}
	}

}
