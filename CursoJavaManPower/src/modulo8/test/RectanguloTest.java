package modulo8.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modulo8.Rectangulo;

public class RectanguloTest {

	/*
	 *  el enunciado pide:
	 *  
	 * 5- realizar los testeos con junit de los m?todos equals, contructores y comportamiento dentro de una 
		  lista tipo List y dentro de una lista tipos Set.
	 */
	Rectangulo rectanguloPrueba = new Rectangulo("Nombre1",4.5f,2.5f);
	List <Rectangulo> listaRectangulos;
	Set <Rectangulo> setRectangulos;
	
	@Before
	public void setUp() throws Exception {
		
		listaRectangulos  = new ArrayList<Rectangulo>();
		
		listaRectangulos.add(rectanguloPrueba);
		listaRectangulos.add(new Rectangulo("Nombre2",4.5f,2.5f));
		listaRectangulos.add(new Rectangulo("Nombre3",4.5f,2.5f));
		
		setRectangulos = new HashSet<Rectangulo>();
		
		setRectangulos.add(rectanguloPrueba);
		setRectangulos.add(new Rectangulo("Nombre2",4.5f,2.5f));
		setRectangulos.add(new Rectangulo("Nombre3",4.5f,2.5f));
	}

	@After
	public void tearDown() throws Exception {
		rectanguloPrueba = null;
		listaRectangulos = null;
		setRectangulos = null;
	}

	@Test
	public void testEqualsObject() {
		Rectangulo rectanguloPrueba2 = new Rectangulo("Nombre1", 4.5f,2.5f);
		
		assertTrue(listaRectangulos.contains(rectanguloPrueba));
		assertTrue(setRectangulos.contains(rectanguloPrueba));
		assertTrue(rectanguloPrueba.equals(rectanguloPrueba2));
	}

	@Test
	public void testRectanguloStringFloatFloat() {
		Rectangulo rectanguloPrueba2 = new Rectangulo("Nombre1",4.5f,2.5f);
		assertEquals("Nombre1", rectanguloPrueba2.getNombre());
		assertEquals(2.5f, (float) rectanguloPrueba2.getBase(), 0.001);
		assertEquals(4.5f, (float) rectanguloPrueba2.getAltura(), 0.001);
	}

}
