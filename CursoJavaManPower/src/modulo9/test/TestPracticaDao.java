package modulo9.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import modulo9.controlador.*;
import modulo9.modelo.Model;
import modulo9.modelo.Practica;

public class TestPracticaDao {
	
	PracticaDao pd;
	Model usuarioTest;
	Model usuarioTestModificar;
	
	@Before
	public void setUp() throws Exception {
		pd = new PracticaDao();
		usuarioTest = new Practica(12,"practica 12");
		usuarioTestModificar = new Practica(12,"practica 15");
	}

	@Test
	public void testAgregar() throws ClassNotFoundException, SQLException {
		
		assertEquals(1,pd.agregar(usuarioTest));
	}

	@Test
	public void testModificar() throws ClassNotFoundException, SQLException {
		
		assertEquals(1,pd.modificar(usuarioTestModificar));
		
	}

	@Test
	public void testEliminar() throws ClassNotFoundException, SQLException {

		assertEquals(1,pd.eliminar(usuarioTest));
	}

	@Test
	public void testLeer() throws ClassNotFoundException, SQLException {
		
		Model pr = new Practica(12);
		PracticaDao pd = new PracticaDao();
		
		List<Model> lista = new ArrayList<Model>(pd.leer(pr));
		List<Practica> listaFinal = new ArrayList<Practica>();
		
		for(Model practica: lista) {
			listaFinal.add((Practica) practica);
		}
		
		assertEquals("practica 15",listaFinal.get(0).getPRAC_NOMBRE());
		
	}

}
