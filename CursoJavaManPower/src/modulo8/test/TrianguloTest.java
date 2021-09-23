package modulo8.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modulo8.Triangulo;

public class TrianguloTest {

	/*
	 *  el enunciado pide:
	 *  
	 * 5- realizar los testeos con junit de los métodos equals, contructores y comportamiento dentro de una 
		  lista tipo List y dentro de una lista tipos Set.
	 */
	Triangulo trianguloPrueba = new Triangulo("Nombre1");
	List <Triangulo> listaTriangulos;
	Set <Triangulo> setTriangulos;
	
	@Before
	public void setUp() throws Exception {
		
		listaTriangulos  = new ArrayList<Triangulo>();
		
		listaTriangulos.add(trianguloPrueba);
		listaTriangulos.add(new Triangulo("Nombre2"));
		listaTriangulos.add(new Triangulo("Nombre3"));
		
		setTriangulos = new HashSet<Triangulo>();
		
		setTriangulos.add(trianguloPrueba);
		setTriangulos.add(new Triangulo("Nombre2"));
		setTriangulos.add(new Triangulo("Nombre3"));
	}

	@After
	public void tearDown() throws Exception {
		trianguloPrueba = null;
		listaTriangulos = null;
		setTriangulos = null;
	}

	@Test
	public void testEqualsObject() {
		Triangulo trianguloPrueba2 = new Triangulo("Nombre1");
		
		assertTrue(listaTriangulos.contains(trianguloPrueba));
		assertTrue(setTriangulos.contains(trianguloPrueba));
		assertTrue(trianguloPrueba.equals(trianguloPrueba2));
	}
	
	@Test
	public void testTrianguloString() {
		Triangulo trianguloPrueba2 = new Triangulo("Nombre1");
		assertEquals("Nombre1", trianguloPrueba2.getNombre());
	}

}
