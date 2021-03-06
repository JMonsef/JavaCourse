package es.com.manpower.notas.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import es.com.manpower.notas.modelo.Alumno;
import es.com.manpower.notas.modelo.Model;
import es.com.manpower.notas.util.ConnectionManager;

public class AlumnoDAO implements DAO {
	private Connection conexion;
	public AlumnoDAO() {
		
	}

	@Override
	public void agregar(Model pMod) throws ClassNotFoundException, SQLException {
		Alumno alumno= (Alumno)pMod;
		
		//1- me tengo que conectar
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConection();
		//2- statemente
		
		StringBuilder sql = new StringBuilder("INSERT INTO alumnos (ALU_NOMBRE,ALU_APELLIDO,ALU_ESTUDIOS,ALU_LINKGIT) VALUES");
		sql.append(" (?,?,?,?)");
		
		PreparedStatement pstm = conexion.prepareStatement(sql.toString());
		pstm.setString(1, alumno.getNombre());
		pstm.setString(2, alumno.getApellido());
		pstm.setString(3, alumno.getEstudios());
		pstm.setString(4, alumno.getLinkArepositorio());
		
		pstm.executeUpdate();				
		ConnectionManager.desConectar();
	}

	@Override
	public void modificar(Model pMod) {
		

	}

	@Override
	public void eliminar(Model pMod) {
		

	}

	@Override
	public List<Model> leer(Model pMod) {
		
		return null;
	}

}
