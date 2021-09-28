package com.domain.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.domain.controller.Conection.ConnectionManager;
import com.domain.modelo.Alumno;

public class SelectAlumnos {
	private static Connection conexion;
	public static List<Alumno> leer(String sql) throws ClassNotFoundException, SQLException{
			
			
			List<Alumno> practicas = new ArrayList<Alumno>();
			
			conexion = ConnectionManager.conectar();
			
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			ResultSet resultado = sentencia.executeQuery();
			
			while(resultado.next()) {
				practicas.add(new Alumno(resultado.getString("alu_nombre")));
			}
			
			resultado.close();
			ConnectionManager.desconectar();
			
			return practicas;
		}
}
