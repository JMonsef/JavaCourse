package modulo7.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modulo7.Profesor;

public class ProfesorTest {
	
	List <Profesor> profesorLista;
	Set <Profesor> profesorSet;
	Profesor profesorEjemplo;
	
	
	@Before
	public void setUp() throws Exception {
		profesorEjemplo = new Profesor("Casas","Gabriel","434");
		
		profesorLista = new ArrayList<Profesor>();
		profesorLista.add(new Profesor("Casas","Gabriel","434"));
		profesorLista.add(new Profesor("Vargas","Sara","321"));
		profesorLista.add(new Profesor("Lopez","Juan","124"));
		
		profesorSet = new HashSet<Profesor>();
		profesorSet.add(new Profesor("Casas","Gabriel","434"));
		profesorSet.add(new Profesor("Vargas","Sara","321"));
		profesorSet.add(new Profesor("Lopez","Juan","124"));
	}

	@After
	public void tearDown() throws Exception {
		profesorLista = null;
		profesorSet = null;
		profesorEjemplo = null;
	}

	@Test
	public void testHashCodeProfesor() {
		assertTrue(profesorSet.contains(profesorEjemplo));
	}

	@Test
	public void testEqualsProfesor() { //
		assertTrue(profesorLista.contains(profesorEjemplo));
		Profesor prueba = new Profesor("ffff","Juan","3432");
		assertFalse(profesorEjemplo.equals(prueba)); // equals con objetos profesor
	}

	@Test
	public void testProfesorContructor() {
		assertEquals("Gabriel",profesorEjemplo.getNombre()); // aqui pruebo si el contructor funciono
		profesorEjemplo.setIosfa("989"); // aqui pruebo que el seter funiona porque en el equals se ve el cambio
		assertEquals("989",profesorEjemplo.getIosfa());
	}
	
}
