package es.com.manpower.notas.util;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConnectionManagerTest {
	//lote de prubas
	Connection con;

	@Before
	public void antes() throws Exception{
		//1- driver levantar el driver			
		Class.forName("com.mysql.jdbc.Driver");
		//2- conexion
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manpower", "sistema", "sistema");
		ConnectionManager.conectar();

	}
	@After
	public void despues() throws Exception{
		con=null;
		ConnectionManager.desConectar();
	}

	@Test
	public void testConectar() {
		try {
			ConnectionManager.conectar();
			assertFalse(ConnectionManager.getConection().isClosed());
			
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test
	public void testDesConectar() {
		try {
			ConnectionManager.desConectar();
			assertTrue(ConnectionManager.getConection().isClosed());
			
		} catch (SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}

	@Test
	public void testGetConection() throws Exception {
	  assertFalse(ConnectionManager.getConection().isClosed());
	}

}
