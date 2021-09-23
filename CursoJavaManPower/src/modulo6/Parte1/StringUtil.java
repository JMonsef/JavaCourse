package modulo6.Parte1;

public class StringUtil {

	public static void main(String[] args) {
		
		String mensaje = "Hola Mundo";
		System.out.println("este es el texto de prueba: " +mensaje);
	    
	    if(containsDobleSpace(mensaje)) 
	    	System.out.println("tiene doble espacio");
	    else
	    	System.out.println("no tiene doble espacio");
	    
	    if(containsNumber(mensaje)) 
	    	System.out.println("tiene numeros");
	    else
	    	System.out.println("no tiene numeros");
		
	}
	
	public static boolean containsDobleSpace(String mensaje) {
		
	    for(int x = 0; x < mensaje.length(); x++) {
	    	
	    	if(mensaje.charAt(x) == ' ' && mensaje.charAt(x+1) == ' ') {
	    		return true;
	    	}
	    }
	    	
	    
	    return false;
		
	}
	
	public static boolean containsNumber(String mensaje) {
		
		for(int x = 0; x < mensaje.length(); x++) {
			
	        if ((mensaje.charAt(x) >= 'a' && mensaje.charAt(x) <= 'z')) {
	        	return false;
	        }
	        
		}
		return true;
	}
	
}
