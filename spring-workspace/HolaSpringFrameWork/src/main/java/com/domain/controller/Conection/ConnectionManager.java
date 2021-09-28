package com.domain.controller.Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	private static Connection conection;
	
	public static Connection conectar() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manpower", "root", "admin");
		return conection;
	}
	
	public static void desconectar() throws SQLException {
		conection.close();
	}


}
