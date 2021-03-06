package modulo7.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modulo7.Alumno;

public class AlumnoTest {
	
	List <Alumno> alumnoLista;
	Set <Alumno> alumnoSet;
	Alumno alumnoEjemplo;
	
	@Before
	public void setUp() throws Exception {
		
		alumnoLista = new ArrayList<Alumno>();
		alumnoLista.add(new Alumno("BD","Monsef",393));
		alumnoLista.add(new Alumno("Guerreiro","Angel",121));
		alumnoLista.add(new Alumno("Sanchez","Aaron",901));
		
		alumnoSet = new HashSet<Alumno>();
		alumnoSet.add(new Alumno("BD","Monsef",393));
		alumnoSet.add(new Alumno("Guerreiro","Angel",121));
		alumnoSet.add(new Alumno("Sanchez","Aaron",901));
		
		alumnoEjemplo = new Alumno("BD","Monsef",393);
	}

	@After
	public void tearDown() throws Exception {
		alumnoLista = null;
		alumnoSet = null;
		alumnoEjemplo = null;
	}

	@Test
	public void testHashCode() {
		assertTrue(alumnoSet.contains(alumnoEjemplo));
	}

	@Test
	public void testEqualsObject() {
		assertTrue(alumnoLista.contains(alumnoEjemplo));
		Alumno alumnoPrueba = new Alumno("aaaa","Emilio",232);
		assertFalse(alumnoEjemplo.equals(alumnoPrueba));
	}

	@Test
	public void testAlumno() {
		assertEquals("Monsef",alumnoEjemplo.getNombre());
		alumnoEjemplo.setLegajo(222);
		assertEquals(222,alumnoEjemplo.getLegajo());
	}
}
