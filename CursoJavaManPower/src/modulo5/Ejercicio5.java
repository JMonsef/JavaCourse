package modulo5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "gcasas1972@gmail.com";
		System.out.println("el @ esta en la posicion: " + txt.indexOf("@"));
		System.out.println(txt.substring(0, txt.indexOf("@")));
		System.out.println(txt.substring(txt.indexOf("@")+1, txt.length()));
	}

}