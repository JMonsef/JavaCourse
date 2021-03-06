package modulo9.controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import modulo9.controlador.*;
import modulo9.modelo.DAO;
import modulo9.modelo.Model;
import modulo9.modelo.Practica;

@SuppressWarnings("unused")
public class PracticaDao implements DAO {
	
	private Connection conexion;
	
	public PracticaDao() {
		
	}
	
	@Override
	public int agregar(Model pMod) throws ClassNotFoundException, SQLException {
		
		Practica practica = (Practica)pMod;
		conexion = ConnectionManager.conectar();
		StringBuilder sql = new StringBuilder("insert into practicas (PRAC_ID,PRAC_NOMBRE)");
		sql.append(" values(?,?)");
		
		PreparedStatement sentencia = conexion.prepareStatement(sql.toString());
		sentencia.setInt(1, practica.getPRAC_ID());
		sentencia.setString(2, practica.getPRAC_NOMBRE());
		
		int retorno = sentencia.executeUpdate();
		
		ConnectionManager.desConectar();
		
		return retorno;
	}

	@Override
	public int modificar(Model pMod) throws ClassNotFoundException, SQLException {
		
		Practica practica = (Practica)pMod;
		conexion = ConnectionManager.conectar();
		StringBuilder sql = new StringBuilder("update practicas set PRAC_NOMBRE = ?");
		sql.append(" where PRAC_ID = ?");
		
		PreparedStatement sentencia = conexion.prepareStatement(sql.toString());
		sentencia.setInt(2, practica.getPRAC_ID());
		sentencia.setString(1, practica.getPRAC_NOMBRE());
		
		int retorno = sentencia.executeUpdate();
		
		ConnectionManager.desConectar();
		
		return retorno;
	}

	@Override
	public int eliminar(Model pMod) throws ClassNotFoundException, SQLException {
		
		Practica practica = (Practica)pMod;
		conexion = ConnectionManager.conectar();
		StringBuilder sql = new StringBuilder("delete from practicas where PRAC_ID = ?");
		
		PreparedStatement sentencia = conexion.prepareStatement(sql.toString());
		sentencia.setInt(1, practica.getPRAC_ID());
		
		int retorno = sentencia.executeUpdate();
		
		ConnectionManager.desConectar();
		
		return retorno;
	}

	@Override
	public List<Model> leer(Model pMod) throws ClassNotFoundException, SQLException {
		
		Practica practica = (Practica)pMod;
		
		List<Model> practicas = new ArrayList<Model>();
		
		conexion = ConnectionManager.conectar();
		StringBuilder sql = new StringBuilder("select PRAC_NOMBRE");
		sql.append(" from practicas");
		sql.append(" where PRAC_ID = ?");
		
		PreparedStatement sentencia = conexion.prepareStatement(sql.toString());
		sentencia.setInt(1, practica.getPRAC_ID());
		
		ResultSet resultado = sentencia.executeQuery();
		
		while(resultado.next()) {
			practicas.add(new Practica(resultado.getString("PRAC_NOMBRE")));
		}
		
		resultado.close();
		ConnectionManager.desConectar();
		
		return practicas;
	}

}
