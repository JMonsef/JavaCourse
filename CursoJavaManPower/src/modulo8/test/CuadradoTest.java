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

import modulo8.Cuadrado;

public class CuadradoTest {
	
	/*
	 *  el enunciado pide:
	 *  
	 * 5- realizar los testeos con junit de los m?todos equals, contructores y comportamiento dentro de una 
		  lista tipo List y dentro de una lista tipos Set.
	 */
	Cuadrado cuadradoPrueba = new Cuadrado("Cuadrado1",4.5f);
	List <Cuadrado> listaCuadrados;
	Set <Cuadrado> setCuadrados;
	@Before
	public void setUp() throws Exception {
		
		listaCuadrados  = new ArrayList<Cuadrado>();
		
		listaCuadrados.add(cuadradoPrueba);
		listaCuadrados.add(new Cuadrado("Cuadrado2",3.2f));
		listaCuadrados.add(new Cuadrado("Cuadrado3",5.0f));
		
		setCuadrados = new HashSet<Cuadrado>();
		
		setCuadrados.add(cuadradoPrueba);
		setCuadrados.add(new Cuadrado("Cuadrado2",3.2f));
		setCuadrados.add(new Cuadrado("Cuadrado3",5.0f));
	}

	@After
	public void tearDown() throws Exception {
		cuadradoPrueba = null;
		listaCuadrados = null;
		setCuadrados = null;
	}

	@Test
	public void testEqualsObject() {
		Cuadrado cuadradoPrueba2 = new Cuadrado("Cuadrado1",4.5f);
		
		assertTrue(listaCuadrados.contains(cuadradoPrueba));
		assertTrue(setCuadrados.contains(cuadradoPrueba));
		assertTrue(cuadradoPrueba.equals(cuadradoPrueba2));
	}
	
	@Test
	public void testCuadradoConstructor() {
		Cuadrado cuadradoPrueba2 = new Cuadrado("Cuadrado1",4.5f);
		assertEquals("Cuadrado1", cuadradoPrueba2.getNombre());
		assertEquals(4.5f, (float) cuadradoPrueba2.getLado(), 0.002);
		
	}

}
