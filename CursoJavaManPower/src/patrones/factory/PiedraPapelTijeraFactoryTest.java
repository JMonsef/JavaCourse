package patrones.factory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PiedraPapelTijeraFactoryTest {
	PiedraPapelTijeraFactory piedra;
	PiedraPapelTijeraFactory papel;
	PiedraPapelTijeraFactory tijera;
	
	@Before
	public void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}

	@After
	public void tearDown() throws Exception {
		piedra = null;
		papel = null;
		tijera = null;
	}
	
	@Test
	public void testComprarPiedraConPapel_gana() {
		assertEquals(-1, piedra.comparar(papel));
	}
	@Test
	public void testComprarPiedraConPiedra_gana() {
		assertEquals(0, piedra.comparar(piedra));
	}
	@Test
	public void testComprarPiedraConTijera_gana() {
		assertEquals(1, piedra.comparar(tijera));
	}

	@Test
	public void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(0) instanceof Piedra);
	}
	
	@Test
	public void testGetInstancePapel() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(1) instanceof Papel);
	}
	
	@Test
	public void testGetInstanceTijera() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(2) instanceof Tijera);
	}
}
