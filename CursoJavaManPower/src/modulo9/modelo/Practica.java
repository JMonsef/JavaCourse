package modulo9.modelo;

public class Practica implements Model{
	
	private int PRAC_ID;
	private String PRAC_NOMBRE;
	
	public Practica() {
	
	}
	
	public Practica(String pRAC_NOMBRE) {
		PRAC_NOMBRE = pRAC_NOMBRE;
	}

	public Practica(int pRAC_ID) {
		PRAC_ID = pRAC_ID;
	}
	
	public Practica(int pRAC_ID, String pRAC_NOMBRE) {
		super();
		PRAC_ID = pRAC_ID;
		PRAC_NOMBRE = pRAC_NOMBRE;
	}
	
	public int getPRAC_ID() {
		return PRAC_ID;
	}
	
	public void setPRAC_ID(int pRAC_ID) {
		PRAC_ID = pRAC_ID;
	}
	
	public String getPRAC_NOMBRE() {
		return PRAC_NOMBRE;
	}
	
	public void setPRAC_NOMBRE(String pRAC_NOMBRE) {
		PRAC_NOMBRE = pRAC_NOMBRE;
	}
	
	
	
}
