package com.domain.dao;

	import java.sql.SQLException;
	import java.util.List;
	import com.domain.modelo.Model;


	public interface DAO {
		
		public void agregar(Model pMod) throws ClassNotFoundException, SQLException;
		public void modificar(Model pMod) throws ClassNotFoundException, SQLException;
		public void eliminar(Model pMod) throws ClassNotFoundException, SQLException;
		public List<Model> lista(Model pMod) throws ClassNotFoundException, SQLException;
	}

