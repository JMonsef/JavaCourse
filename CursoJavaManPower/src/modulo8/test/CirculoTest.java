package modulo8.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modulo8.Circulo;

public class CirculoTest {

	/*
	 *  el enunciado pide:
	 *  
	 * 5- realizar los testeos con junit de los métodos equals, contructores y comportamiento dentro de una 
		  lista tipo List y dentro de una lista tipos Set.
	 */
	Circulo circuloPrueba = new Circulo("Nombre1",4.5f);
	List <Circulo> listaCirculos;
	Set <Circulo> setCirculos;
	
	@Before
	public void setUp() throws Exception {
		
		listaCirculos  = new ArrayList<Circulo>();
		
		listaCirculos.add(circuloPrueba);
		listaCirculos.add(new Circulo("Nombre2",3.2f));
		listaCirculos.add(new Circulo("Nombre3",5.0f));
		
		setCirculos = new HashSet<Circulo>();
		
		setCirculos.add(circuloPrueba);
		setCirculos.add(new Circulo("Nombre2",3.2f));
		setCirculos.add(new Circulo("Nombre3",5.0f));
	}

	@After
	public void tearDown() throws Exception {
		circuloPrueba = null;
		listaCirculos = null;
		setCirculos = null;
	}

	@Test
	public void testEqualsObject() {
		Circulo circuloPrueba2 = new Circulo("Nombre1", 4.5f);
		
		assertTrue(listaCirculos.contains(circuloPrueba));
		assertTrue(setCirculos.contains(circuloPrueba));
		assertTrue(circuloPrueba.equals(circuloPrueba2));
	}

	@Test
	public void testCirculoStringFloat() {
		Circulo circuloPrueba2 = new Circulo("Nombre1", 4.5f);
		assertEquals("Nombre1", circuloPrueba2.getNombre());
		assertEquals(4.5f, (float) circuloPrueba2.getRadio(), 0.001);
	}

}
